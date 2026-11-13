# Topline

Topline is a social video and community application. This repository contains the Android Jetpack Compose client and the Node.js/Express backend.

## Project layout

- `ToplineAndroid/` — Android app (Kotlin, Jetpack Compose, Media3/ExoPlayer).
- `ToplineMobile-saver/server/` — Express API and MongoDB models/routes.
- `render.yaml` — Render service configuration.

## Video feed

The Home screen uses a vertically paged feed and the existing Media3 player lifecycle. The production For You feed now uses API posts only; placeholder/demo videos have been removed. Upload remains connected to the existing post creation flow.

## Configuration

Set the backend environment variables required by the server before running it (MongoDB connection, authentication secrets, and media-storage credentials as applicable). Configure the Android API base URL in the app's API configuration for the target environment.

## Build

Open `ToplineAndroid/` in Android Studio and allow Gradle sync to complete. Run the backend from `ToplineMobile-saver/` after installing its dependencies and configuring environment variables.

Note: verify the complete source tree and local environment configuration before production deployment.
