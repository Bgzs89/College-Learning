# Tugas Kuliah - Pemrograman Java

Kumpulan tugas kuliah pemrograman berbahasa Java. Meliputi fundamental Java, OOP (Object-Oriented Programming), dan project sederhana.

---

## 📂 Struktur Folder

```
TUGAS KULIAH/
├── ComputeCircleArea.java       # Menghitung luas lingkaran
├── ComputeAvarage.java          # Menghitung rata-rata
├── TestTugas.java               # Testing berbagai fungsi
├── Course/                      # Project mini-market & generator
│   ├── Market.java              # Sistem kasir mini-market
│   ├── Cardread.java            # Baca kartu/data
│   ├── Codegenerator.java       # Generator kode/password
│   └── Visual.java              # Interface visual
└── EclipseBagas/                # Project Eclipse IDE
    ├── src/Biodata/             # Package biodata mahasiswa
    │   ├── Biodata.java
    │   ├── Mahasiswa.java
    │   └── Mahasiswa2.java
    └── src/jalanberhenti/       # Package simulasi kendaraan
        ├── Kendaraan.java       # Class parent
        ├── Mobil.java           # Class child
        └── Jalankan.java        # Main runner
```

---

## 🎯 Deskripsi Program

### 1. **Fundamental Java**
- `ComputeCircleArea.java` — Input radius, hitung luas lingkaran (πr²)
- `ComputeAvarage.java` — Input beberapa angka, tampilkan rata-rata
- `TestTugas.java` — Testing berbagai method dan logika

### 2. **Course Package**
- `Market.java` — Simulasi kasir: input item, hitung total, cetak struk
- `Cardread.java` — Baca data dari file/kartu (I/O operations)
- `Codegenerator.java` — Generate kode unik/password random
- `Visual.java` — GUI sederhana dengan Swing/AWT

### 3. **Eclipse Project: Biodata**
Package untuk mengelola data mahasiswa dengan konsep OOP:
- `Biodata.java` — Class untuk menyimpan data biodata umum
- `Mahasiswa.java` — Class mahasiswa dengan atribut NIM, nama, jurusan
- `Mahasiswa2.java` — Versi lanjutan dengan method tambahan

### 4. **Eclipse Project: Kendaraan**
Simulasi sistem kendaraan dengan inheritance:
- `Kendaraan.java` — Parent class dengan method `jalan()` dan `berhenti()`
- `Mobil.java` — Child class yang override method parent
- `Jalankan.java` — Main class untuk menjalankan simulasi

---

## 🚀 Cara Menjalankan

### **Terminal/Command Line**
```bash
# Compile
javac NamaFile.java

# Run
java NamaFile
```

### **Eclipse IDE**
1. Import folder `EclipseBagas` sebagai Java Project
2. Run → Run As → Java Application
3. Pilih class dengan method `main()`

---

## 📚 Konsep yang Dipelajari

- ✅ Variabel & Tipe Data
- ✅ Input/Output (Scanner, System.out)
- ✅ Operasi Aritmatika
- ✅ Conditional (if-else, switch)
- ✅ Looping (for, while)
- ✅ Method & Function
- ✅ OOP: Class, Object, Inheritance
- ✅ File I/O
- ✅ GUI (Swing)

---

## 🛠️ Tools & Environment

- **IDE**: Eclipse, VS Code, IntelliJ IDEA
- **JDK**: Java 8+
- **OS**: Windows/Linux/MacOS

---

## 📝 Catatan

- File `.class` (compiled bytecode) sudah di-exclude via `.gitignore`
- Beberapa file `password.txt` dan `card_code.txt` berisi data testing
- Project Eclipse sudah include `bin/` (compiled) dan `src/` (source)

---

## 📧 Kontak

Repository ini berisi tugas kuliah pribadi. Untuk pertanyaan atau kolaborasi, hubungi via GitHub Issues.

---

**Semester**: [Isi semester]  
**Mata Kuliah**: Pemrograman Berorientasi Objek  
**Dosen**: [Isi nama dosen]
