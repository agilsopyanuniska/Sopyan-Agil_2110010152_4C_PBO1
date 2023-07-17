
package perusahaan;

//Inheritance
public class PegawaiDetail extends Pegawai {
    protected double gaji; 
    protected int jamKerja;
    //Polymorphism Overriding
    public PegawaiDetail(String nama, String nip, String gol) {
        super(nama, nip,gol);
    }
    
    public PegawaiDetail(){
        
    }
    
    public void hitungGajiI(int jamKerja){
       gaji = jamKerja * 10000;
    }
    
    public void hitungGajiII(int jamKerja){
       gaji = jamKerja * 15000;
    }
    
    public void hitungGajiIII(int jamKerja){
       gaji = jamKerja * 20000;
    }
    
    //Polymorphism Overriding
    public void hasil(){
        super.hasil(); 
        System.out.println("Gaji : Rp. "  + gaji);
    }
    
    
    
}
