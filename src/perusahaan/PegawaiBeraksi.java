package perusahaan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PegawaiBeraksi {
    public static void main(String[] args) {        
     //Error Handling   
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
     
     }
     catch (InputMismatchException e) {
            System.err.println("Input jam Kerja salah! Mohon masukkan angka");
     }catch(Exception e){
         System.err.println("Kesalahan Umum : " + e.getMessage()); 
     } 
   
     
    }
}
