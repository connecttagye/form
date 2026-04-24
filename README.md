# Form — Kotlin Multiplatform Template

A complete **Kotlin Multiplatform + Compose Multiplatform** template covering all platforms.

## Platforms
| Platform | Module | Status |
|---|---|---|
| Android | `apps:androidApp` | ✅ |
| Desktop (JVM) | `apps:desktopApp` | ✅ |
| iOS | `apps:iosApp` | ✅ |
| Web (WASM) | `apps:webApp` | ✅ |
| Server (JVM) | `server` | ✅ |

## Project Structure

```
form/
├── apps/
│   ├── androidApp/       # Android application
│   ├── desktopApp/       # Desktop (JVM) application
│   ├── iosApp/           # iOS framework/app entry
│   └── webApp/           # Compose WASM web app
├── server/               # Ktor server (REST API)
├── shared/
│   ├── api/contract/     # Shared API models & endpoints
│   ├── core/
│   │   ├── common/       # Utilities, Result, DateTime, Uid
│   │   ├── di/           # Koin setup & commonModule
│   │   ├── log/          # Multiplatform logger
│   │   └── ui/           # Shared Compose screen
│   ├── importexport/
│   │   ├── core/         # Importer/Exporter interfaces
│   │   └── json/         # JSON import/export impl
│   ├── network/
│   │   ├── http/         # Ktor client factory
│   │   └── api/          # FormApiClient
│   ├── platform/
│   │   ├── device/       # Device info (expect/actual)
│   │   ├── files/        # File manager (expect/actual)
│   │   └── messaging/    # Messenger (expect/actual)
│   ├── storage/
│   │   ├── db/           # SQLDelight Notes schema
│   │   └── settings/     # multiplatform-settings
│   └── util/text/        # Text utilities
└── gradle/
    └── libs.versions.toml
```

## Running

### Android
Open the project in Android Studio and run the `androidApp` configuration.

### Desktop
```bash
./gradlew :apps:desktopApp:run
```

### Web (WASM)
```bash
./gradlew :apps:webApp:wasmJsBrowserDevelopmentRun
```

### Server
```bash
./gradlew :server:run
```

The server starts on **http://localhost:8080**.
- `GET /health` → `{ "status": "ok" }`
- `GET /time` → `{ "time": "..." }`

### iOS
1. Build the shared framework: `./gradlew :apps:iosApp:linkDebugFrameworkIosSimulatorArm64`
2. Open Xcode project in `apps/iosApp/` and run on simulator.

## Tech Stack
- **Kotlin Multiplatform** 2.0.21
- **Compose Multiplatform** 1.7.0
- **Koin** 4.0 (DI)
- **Ktor** 3.0.1 (client + server)
- **SQLDelight** 2.0.2 (database)
- **multiplatform-settings** 1.2.0
