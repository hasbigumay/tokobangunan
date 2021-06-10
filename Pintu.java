/*
Nama    : Audrey Era Goldenia
NIM     : 1810511084
 */
package tokobangunan;

public class Pintu extends Bangunan {
    private int pPintu;
    private int lPintu;
    private int tPintu;
    private String bahan;

    public Pintu(String namaProduk, int hargaSatuan, double berat, boolean isCat, boolean isExchange, int pPintu, int lPintu, int tPintu, String bahan) {
        super(namaProduk, hargaSatuan, berat, isCat, isExchange);
        this.pPintu = pPintu;
        this.lPintu = lPintu;
        this.tPintu = tPintu;
        this.bahan = bahan;
    }

    public int getpPintu() {
        return pPintu;
    }

    public void setpPintu(int pPintu) {
        this.pPintu = pPintu;
    }

    public int getlPintu() {
        return lPintu;
    }

    public void setlPintu(int lPintu) {
        this.lPintu = lPintu;
    }

    public int gettPintu() {
        return tPintu;
    }

    public void settPintu(int tPintu) {
        this.tPintu = tPintu;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("Ukuran: "+getpPintu()+"x"+getlPintu()+"x"+gettPintu());
        System.out.println("Bahan: "+bahan);
    }
    
    
    
}
