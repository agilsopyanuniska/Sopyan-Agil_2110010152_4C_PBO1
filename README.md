# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi penghitungan gaji pegawai berdasarkan golongan menggunakan Java sebagai tugas akhir dari mata kuliah 
pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama, NIP, Jam Kerja  dan Golongan pegawai, dan memberikan output berupa informasi yang 
berisi nama, NIP, Golongan, dan Gaji pegawai.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, 
Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Pegawai`, `PegawaiDetail`, dan `PegawaiBeraksi` adalah contoh dari class.

```bash
public class Pegawai {
    ...
}

public class PegawaiDetail extends Pegawai {
    ...
}

public class PegawaiBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `pegawai[i] = new PegawaiDetail(nama,nip,gol);` adalah contoh pembuatan object.

```bash
pegawai[i] = new PegawaiDetail(nama,nip,gol);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `nip` dan `gol` adalah contoh atribut.

```bash
String nama,nip,gol; 
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Pegawai` dan
    `PegawaiDetail`.

```bash

public Pegawai(String nama, String nip, String gol) {
        this.nama = nama;
        this.nip = nip;
        this.gol = gol;
}
    
public Pegawai(){
        
}

public PegawaiDetail(String nama, String nip, String gol) {
        super(nama, nip,gol);
}
    
public PegawaiDetail(){
        
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`, `setNip`, dan `setGol` adalah contoh method mutator.

```bash
public void setNama(String nama) {
        this.nama = nama;
}

public void setNip(String nip) {
        this.nip = nip;
}
    
public void setGol(String gol) {
        this.gol = gol;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNip`, dan `getGol` adalah contoh method accessor.

```bash
public String getGol() {
         return gol;
}

public String getNama() {
         return nama;
}

public String getNip() {
         return nip;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut pada class Pegawai dan class PegawaiDetail menjadi protected agar class anak,
    class lain di dalam package yang sama, dan method pada class Pegawai bisa mengaksesnya. Pada kode class Pegawai, atribut `nama`, `nip` dan `gol`
   yang dienkapsulasi. Sedangkan pada class PegawaiDetail atribut `gaji` dan `jamKerja` yang dienkapsulasi.

```bash
//class Pegawai
protected String nama,nip,gol;

//class PegawaiDetail
protected double gaji; 
protected int jamKerja; 
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PegawaiDetail` mewarisi `Pegawai` dengan sintaks `extends`.

```bash
public class PegawaiDetail extends Pegawai {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode
    dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding.
    Pada kode ini, method `Pegawai` di `Pegawai` merupakan overloading method `Pegawai(String nama, String nip, String gol)` dan `hasil` di `PegawaiDetail` merupakan
    override dari method `hasil` di `Pegawai`.

```bash
public Pegawai(){
        
}

public void hasil(){
        super.hasil(); 
        System.out.println("Gaji : Rp. "  + gaji);
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` untuk
    menyeleksi inputan dari atribut gol.

```bash
switch(gol){
                case "I":
                    //Object
                     pegawai[i] = new PegawaiDetail(nama,nip,gol);
                     
                     pegawai[i].hitungGajiI(jamKerja);
                     break;
                case "II":
                    //Object
                    pegawai[i] = new PegawaiDetail(nama,nip,gol);
                    
                    pegawai[i].hitungGajiII(jamKerja);
                     break;
                case "III":
                    //Object
                    pegawai[i] = new PegawaiDetail(nama,nip,gol);
                    
                    pegawai[i].hitungGajiIII(jamKerja);
                     break;
                default:
                    System.out.println("Golongan tidak valid");
                    System.exit(0);
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `while`  untuk
    meminta input dan loop `for`  menampilkan data.

```bash
int i = 0;
while(i<pegawai.length){
            //Inputan
            System.out.println("Data Pegawai ke-" + (i+1));
            System.out.print("Masukkan Nama pegawai : ");
            String nama = input.nextLine();
       
            System.out.print("Masukkan NIP pegawai : ");
            String nip = input.nextLine();
            
            System.out.print("Masukkan jumlah jam kerja: ");
            int jamKerja = input.nextInt();
            input.nextLine();
            
            System.out.print("Masukkan Golongan (I,II,III): ");
            String gol = input.nextLine();
            
            // percabangan/seleksi
            switch(gol){
                case "I":
                    //Object
                     pegawai[i] = new PegawaiDetail(nama,nip,gol);
                     
                     pegawai[i].hitungGajiI(jamKerja);
                     break;
                case "II":
                    //Object
                    pegawai[i] = new PegawaiDetail(nama,nip,gol);
                    
                    pegawai[i].hitungGajiII(jamKerja);
                     break;
                case "III":
                    //Object
                    pegawai[i] = new PegawaiDetail(nama,nip,gol);
                    
                    pegawai[i].hitungGajiIII(jamKerja);
                     break;
                default:
                    System.out.println("Golongan tidak valid");
                    System.exit(0);
            }
           
            i++;   
}

for (PegawaiDetail data : pegawai) {
            //Outputan
            data.hasil();
            System.out.println();
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk
    menerima input dan method `hasil` dengan method `System.out.println` untuk menampilkan output.

```bash
//input
Scanner input = new Scanner(System.in);
System.out.print("Masukkan Nama pegawai : ");
String nama = input.nextLine();
       
System.out.print("Masukkan NIP pegawai : ");
String nip = input.nextLine();
            
System.out.print("Masukkan jumlah jam kerja: ");
int jamKerja = input.nextInt();
input.nextLine();
            
System.out.print("Masukkan Golongan (I,II,III): ");
String gol = input.nextLine();

//output
data.hasil();
System.out.println();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini,
     `PegawaiDetail[] pegawai = new PegawaiDetail[2];` adalah contoh penggunaan array.

```bash
PegawaiDetail[] pegawai = new PegawaiDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try{
     //IO Sederhana
         Scanner input = new Scanner(System.in);
      //array   
         PegawaiDetail[] pegawai = new PegawaiDetail[2];
        
      //Perulangan
         int i = 0;
         while(i<pegawai.length){
            //Inputan
            System.out.println("Data Pegawai ke-" + (i+1));
            System.out.print("Masukkan Nama pegawai : ");
            String nama = input.nextLine();
       
            System.out.print("Masukkan NIP pegawai : ");
            String nip = input.nextLine();
            
            System.out.print("Masukkan jumlah jam kerja: ");
            int jamKerja = input.nextInt();
            input.nextLine();
            
            System.out.print("Masukkan Golongan (I,II,III): ");
            String gol = input.nextLine();
            
            // percabangan/seleksi
            switch(gol){
                case "I":
                    //Object
                     pegawai[i] = new PegawaiDetail(nama,nip,gol);
                     
                     pegawai[i].hitungGajiI(jamKerja);
                     break;
                case "II":
                    //Object
                    pegawai[i] = new PegawaiDetail(nama,nip,gol);
                    
                    pegawai[i].hitungGajiII(jamKerja);
                     break;
                case "III":
                    //Object
                    pegawai[i] = new PegawaiDetail(nama,nip,gol);
                    
                    pegawai[i].hitungGajiIII(jamKerja);
                     break;
                default:
                    System.out.println("Golongan tidak valid");
                    System.exit(0);
            }
           
            i++;   
        }        
        System.out.println("===============DATA PEGAWAI===============");
        //Perulangan
        for (PegawaiDetail data : pegawai) {
            //Outputan
            data.hasil();
            System.out.println();
        }
     
}catch (InputMismatchException e) {
            System.err.println("Input jam Kerja salah! Mohon masukkan angka");
}catch(Exception e){
         System.err.println("Kesalahan Umum : " + e.getMessage()); 
} 
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Sopyan Agil
NPM: 2110010152
