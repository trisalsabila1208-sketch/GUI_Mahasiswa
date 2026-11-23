# Aplikasi Formulir Data Mahasiswa

## Deskripsi
Aplikasi Formulir Data Mahasiswa merupakan program Graphical User Interface (GUI) menggunakan Java Swing. Aplikasi ini digunakan untuk memasukkan data mahasiswa berupa NIM, nama, dan program studi.

## Fitur
- Menginput NIM mahasiswa.
- Menginput nama mahasiswa.
- Memilih program studi.
- Menyimpan dan menampilkan data mahasiswa.
- Mengosongkan formulir menggunakan tombol Reset.

## 5 Komponen Utama GUI

### 1. Top-Level Container Class
**JFrame**

Digunakan sebagai jendela utama aplikasi yang menampung seluruh komponen GUI.

### 2. Intermediate Container Class
**JPanel**

Digunakan sebagai wadah untuk mengelompokkan komponen GUI agar lebih terstruktur.

### 3. Atomic Component Class
Komponen yang digunakan:
- JLabel: Menampilkan keterangan atau label.
- JTextField: Menerima input NIM dan nama.
- JComboBox: Menyediakan pilihan program studi.
- JButton: Menyediakan tombol Simpan dan Reset.

### 4. Layout Classes
Layout yang digunakan:
- GridLayout: Mengatur komponen dalam bentuk baris dan kolom.
- FlowLayout: Mengatur posisi panel pada jendela utama.

### 5. Event Listener
**ActionListener**

Digunakan untuk menangani aksi pengguna ketika menekan tombol Simpan dan Reset melalui metode `actionPerformed()`.

## Teknologi
- Bahasa Pemrograman: Java
- Library GUI: Java Swing
- IDE: Visual Studio Code

## Struktur File
```text
GUI_Mahasiswa/
├── FormMahasiswa.java
└── README.md
```

## Cara Menjalankan
1. Buka project menggunakan Visual Studio Code.
2. Pastikan Java Development Kit (JDK) sudah terpasang.
3. Buka file `FormMahasiswa.java`.
4. Jalankan program menggunakan Run Java.

## Screenshot
### 1. Tampilan Awal Aplikasi
![Tampilan Awal](screenshot/tampilan-awal.png)

### 2. Input Data Mahasiswa
![Input Data](screenshot/input-data.png)

### 3. Data Berhasil Disimpan
![Data Tersimpan](screenshot/data-tersimpan.png)

### 4. Tampilan Setelah Reset
![Reset](screenshot/reset.png)