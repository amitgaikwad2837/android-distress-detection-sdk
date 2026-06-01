# Android Distress Detection SDK

## Overview

Audio-based distress detection through cry, scream, and panic detection

## Installation

Add the Maven dependency once artifacts are published:

~~~kotlin
dependencies {
  implementation("io.github.amitgaikwad2837:android-distress-detection-sdk:1.0.0")
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
