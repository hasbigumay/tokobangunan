/*
Nama    : Audrey Era Goldenia
NIM     : 1810511084
 */
package tokobangunan;

public class Semen extends Material{
    private String merk;

    public Semen(String namaProduk, int hargaSatuan, double berat, boolean isCat, boolean isBroke,String merk) {
        super(namaProduk, hargaSatuan, berat, isCat, isBroke);
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("Merk: "+getMerk());
    }
    
}
