> Mirror Policy: This repository is an automated mirror of the monorepo https://github.com/amitgaikwad2837/SDK.
>
> Do not push changes directly here. All changes must be made in the SDK monorepo and synced by workflow.
> Pull requests opened in this repo are for review visibility only and may be overwritten by the next sync.
# Android Distress Detection SDK

## 📦 Registry & Repository

- **Maven Central**: [io.github.amitgaikwad2837:android-distress-detection-sdk](https://central.sonatype.com/artifact/io.github.amitgaikwad2837/android-distress-detection-sdk)
- **GitHub**: [amitgaikwad2837/android-distress-detection-sdk](https://github.com/amitgaikwad2837/android-distress-detection-sdk)

## Overview

Detect emotional distress from audio patterns including cries, screams, and panic vocalizations. Uses real-time audio analysis to identify signs of psychological stress for proactive support and intervention.

## Installation

Add the Maven dependency:

~~~kotlin
dependencies {
  implementation("io.github.amitgaikwad2837:android-distress-detection-sdk:0.0.9")
}
~~~

## Integration Example

~~~kotlin
import com.sdk.distress.DistressDetectionSDK

class ExampleUsage {
    fun setup() {
        val sdk = DistressDetectionSDK()
        // Configure and call SDK APIs here based on your app flow.
    }
}
~~~

## Feature Highlights

- scream-detection
- cry-detection
- panic-detection
- phrase-detection
- confidence-scoring
- real-time-monitoring

## Android Permissions

- RECORD_AUDIO
- INTERNET

## Development

~~~bash
./gradlew build
./gradlew test
~~~

## License

MIT

