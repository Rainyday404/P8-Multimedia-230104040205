# P8 Multimedia - File Manager & Video Gallery

Proyek ini adalah aplikasi Android berbasis Kotlin yang dikembangkan sebagai bagian dari tugas praktikum Multimedia. Aplikasi ini berfokus pada manajemen file (khususnya video), mencakup fitur untuk melihat informasi file, mengubah nama, dan menghapus file secara efisien.

## 🚀 Fitur Utama

- **File Management**: Fungsi untuk menghapus dan mengubah nama file di penyimpanan lokal.
- **Auto-Formatting Size**: Konversi ukuran file otomatis dari *bytes* ke format yang mudah dibaca (KB/MB).
- **Video Data Handling**: Pengelolaan metadata video menggunakan data class yang terstruktur.
- **Modern UI**: Dibangun menggunakan komponen UI Android terbaru (Jetpack Compose).

## 📂 Struktur Project (Utility)

Di dalam folder `util`, terdapat `FileManagerUtility.kt` yang menangani logika utama:

| Fungsi | Deskripsi |
| :--- | :--- |
| `formatFileSize()` | Mengubah ukuran bytes menjadi unit KB atau MB dengan pembulatan. |
| `renameFile()` | Mengubah nama file fisik di direktori penyimpanan. |
| `deleteFile()` | Menghapus file terpilih dari penyimpanan perangkat. |

## 🛠️ Tech Stack

- **Language**: [Kotlin](https://kotlinlang.org/)
- **UI Framework**: Jetpack Compose
- **Tools**: Android Studio Ladybug | 2024.2.2
- **ID**: `p8_multimedia_230104040205`

## 🖥️ Cuplikan Kode

```kotlin
// Contoh penggunaan FileManagerUtility untuk merename file
val success = FileManagerUtility.renameFile(oldFile, "Video_Baru.mp4")
if (success) {
    println("File berhasil diubah namanya!")
}

```

## ⚙️ Cara Menjalankan

1. Clone repository ini.
2. Buka di **Android Studio**.
3. Pastikan SDK Android sudah terkonfigurasi.
4. *Build and Run* pada Emulator atau Physical Device.

---

**Developed by**
[Rainyday404](https://www.google.com/search?q=https://github.com/Rainyday404) 🌧️
*Information Technology Student at UIN Antasari Banjarmasin*

```