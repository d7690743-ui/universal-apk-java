# Universal APK Java

Plantilla Android moderna en Java para crear una sola APK universal y compilarla en GitHub Actions.

- Java 17 + Android Gradle Plugin 8.7.3 + Gradle 8.9.
- Android SDK nativo, sin dependencia obligatoria de AndroidX.
- ABI: armeabi-v7a, arm64-v8a, x86 y x86_64.
- Compilación automática en cada push a main.
- Artefactos Debug y Release.
- Firma Release opcional mediante GitHub Secrets.

Una APK universal contiene las bibliotecas nativas de las ABI declaradas. Las dependencias nativas añadidas posteriormente deben ofrecer binarios para esas arquitecturas.

## Compilar localmente
Con JDK 17, Android SDK y Gradle 8.9:
```bash
gradle assembleDebug
```
APK: app/build/outputs/apk/debug/app-debug.apk

## Firma de Release
Configura estos Actions Secrets: ANDROID_KEYSTORE_BASE64, ANDROID_KEYSTORE_PASSWORD, ANDROID_KEY_ALIAS y ANDROID_KEY_PASSWORD. Sin ellos, Release queda sin firmar; Debug sí queda firmada para pruebas.

## Personalizar
Cambia applicationId en app/build.gradle, el nombre en app/src/main/res/values/strings.xml y el código en MainActivity.java.