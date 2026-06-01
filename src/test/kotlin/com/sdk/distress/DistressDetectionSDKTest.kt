package com.sdk.distress

import org.junit.Test
import kotlin.test.assertEquals

class DistressDetectionSDKTest {
    @Test
    fun testDistressDetectionConfigCreation() {
        val config = DistressDetectionConfig(
            enableScreamDetection = true,
            enableCryDetection = true,
            confidenceThreshold = 0.8f
        )
        
        assertEquals(true, config.enableScreamDetection)
        assertEquals(0.8f, config.confidenceThreshold)
    }

    @Test
    fun testDistressEventCreation() {
        val event = DistressEvent(
            id = "distress-123",
            timestamp = System.currentTimeMillis(),
            distressType = DistressType.SCREAM,
            confidence = 0.92f
        )
        
        assertEquals("distress-123", event.id)
        assertEquals(DistressType.SCREAM, event.distressType)
        assertEquals(0.92f, event.confidence)
    }

    @Test
    fun testDistressDetectionConfigDefaults() {
        val config = DistressDetectionConfig()
        assertEquals(true, config.enableScreamDetection)
        assertEquals(true, config.enableCryDetection)
        assertEquals(0.7f, config.confidenceThreshold)
        assertEquals(1000L, config.monitoringIntervalMs)
    }

    @Test
    fun testDistressTypeValues() {
        assertEquals(4, DistressType.values().size)
        assertTrue(DistressType.values().contains(DistressType.SCREAM))
        assertTrue(DistressType.values().contains(DistressType.CRY))
        assertTrue(DistressType.values().contains(DistressType.PANIC))
        assertTrue(DistressType.values().contains(DistressType.PHRASE))
    }

    @Test
    fun testDistressEventWithAudio() {
        val audioClip = byteArrayOf(1, 2, 3, 4, 5)
        val event = DistressEvent(
            id = "distress-audio",
            timestamp = System.currentTimeMillis(),
            distressType = DistressType.SCREAM,
            confidence = 0.85f,
            audioClip = audioClip,
            transcript = "Help!"
        )
        
        assertEquals(5, event.audioClip?.size)
        assertEquals("Help!", event.transcript)
    }

    @Test
    fun testDistressConfigMonitoringInterval() {
        val config = DistressDetectionConfig(
            monitoringIntervalMs = 500L
        )
        assertEquals(500L, config.monitoringIntervalMs)
    }

    @Test
    fun testDistressConfidenceScoring() {
        val lowConfidence = DistressEvent(
            id = "low",
            timestamp = System.currentTimeMillis(),
            distressType = DistressType.CRY,
            confidence = 0.3f,
            userResponsive = false
        )
        
        val highConfidence = DistressEvent(
            id = "high",
            timestamp = System.currentTimeMillis(),
            distressType = DistressType.SCREAM,
            confidence = 0.95f,
            userResponsive = true
        )
        
        assertTrue(lowConfidence.confidence < highConfidence.confidence)
    }
}
