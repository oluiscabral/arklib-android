<a href="https://www.buymeacoffee.com/arkbuilders" target="_blank"><img src="https://cdn.buymeacoffee.com/buttons/v2/default-yellow.png" alt="Buy Me A Coffee" style="height: 60px !important;width: 217px !important;" ></a>

# ArkLib for Android

This is a wrapper of <a href="https://github.com/ARK-Builders/arklib" target="_blank">ArkLib</a> which enables you to build Android apps, powered by resource indexing, previews generation and user metadata support such as tags or scores.

| :warning: WARNING          |
|:---------------------------|
| The following information is only for developers. |

## Prerequisites

- Rust toolchain
- Kotlin toolchain
- Android SDK + NDK r24 (latest)

## Debug

Make sure you have switch to `debug` profile in cargo config, which could be found at `lib/build.gradle` 

Run the command to build

```sh
./gradlew lib:assemble
```

Connect to a device or setup an AVD and check the functionality.

```sh
./gradlew appmock:connectedCheck
```

## Build Rust

For checking if Rust code compiles without problems, you can use this command:

```sh
./gradlew cargoBuild
```

## Build AAR

Before make a release build, ensure you have set `profile = "release"` in cargo config.

```sh
./gradlew lib:assemble
```

The generated release build is `lib/build/outputs/aar/lib-release.aar`

## Publish New Version

Ensure you have committed your changes.

```sh
./gradlew release
```

Then simply push to the repo.

## Installation
Add the following script to project's build.gradle

**Github packages with credentials is a workaround since JCenter is shutdown**
```groovy
allprojects {
    repositories{
        maven {
            name = "GitHubPackages"
            url = "https://maven.pkg.github.com/ARK-Builders/arklib-android"
            credentials {
                username = "token"
                password = "\u0037\u0066\u0066\u0036\u0030\u0039\u0033\u0066\u0032\u0037\u0033\u0036\u0033\u0037\u0064\u0036\u0037\u0066\u0038\u0030\u0034\u0039\u0062\u0030\u0039\u0038\u0039\u0038\u0066\u0034\u0066\u0034\u0031\u0064\u0062\u0033\u0064\u0033\u0038\u0065"
            }
        }
    }
}
```

And add arklib-android dependency to app module's build.gradle
```groovy
implementation 'dev.arkbuilders:arklib:0.3.1'
```
