# Alf
Simple REST API With Ktor + Android App.

Alf App is an Android application that displays random Alf images retrieved from a Ktor API. Users can view Alf images and fetch the next random image using the "Next Alf" button.

## Features

- Display random Alf images.
- Fetch the next random Alf image.
- User-friendly interface with Material Design using Jetpack Compose.

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/nisaefendioglu/alf.git
   ```

2. Open the project in Android Studio.

3. Run the app on an emulator or a physical device.

## Dependencies

- Kotlin Coroutines for asynchronous programming.
- Jetpack Compose for building the UI.
- Hilt for dependency injection.
- Retrofit for network requests.
- Coil Compose for image loading.

## Configuration

To configure the base URL of the Ktor API, update the `ApiService.kt` file:

```kotlin
const val BASE_URL = "http://192.168.1.33:8100" // Replace with your API base URL / ipconfig -> IPV4 Address (192.168.1.33)
```

Make sure the server(Ktor Api) is running, set the necessary base urls yourself and run it. 

## Ktor API

The random Alf images are provided by a Ktor API. You can find the Ktor API repository [here](https://github.com/nisaefendioglu/ktor-api). 


## Contributing

Contributions are welcome! If you find a bug or want to add a new feature, please open an issue or submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
