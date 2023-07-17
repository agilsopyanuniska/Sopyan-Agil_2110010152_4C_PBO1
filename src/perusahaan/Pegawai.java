
package perusahaan;
//class
public class Pegawai {
    //atribut dan enkapsulasi
    protected String nama,nip,gol;       
    //constructor
    public Pegawai(String nama, String nip, String gol) {
        this.nama = nama;
        this.nip = nip;
        this.gol = gol;
    }
    //Polymorphysm overloading
    public Pegawai(){
        
    }
    // setter/mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public void setGol(String gol) {
        this.gol = gol;
    }    
    // getter/accessor
    public String getGol() {
        return gol;
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }
    
    public void hasil(){
        System.out.println("Nama : " + nama);
        System.out.println("NIP : " + nip);
        System.out.println("Gol : " + gol);
    }
    
}
