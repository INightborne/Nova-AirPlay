# Nova AirPlay — Fire OS 5 compatibility prototype

Targets Amazon Fire TV Stick Basic Edition, Fire OS 5 (Android 5.1 / API 22).

**Important: This is not yet a working AirPlay receiver.** It opens a TV app, but cannot receive iPhone mirroring. The AirPlay receiver protocol, video decoder pipeline, audio, and pairing are not implemented.

## Prototype APK

In GitHub, open Actions > Build Fire OS 5 prototype > most recent successful run > Artifacts > nova-airplay-prototype-apk. Unzip to obtain app-debug.apk. GitHub Actions artifacts may require sign-in.

## Build

CI uses Java 17, Gradle 8.9, Android compile SDK 35, and minimum SDK 22.

## Receiver work remaining

Integrate and test a compatible open-source AirPlay implementation, including Bonjour advertisement only after real sockets are active, secure pairing, H.264 MediaCodec rendering, AudioTrack, disconnect/reconnect, and GPL license compliance. Protected DRM streaming is out of scope.
