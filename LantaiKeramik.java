/*
Nama    : Audrey Era Goldenia
NIM     : 1810511084
 */
package tokobangunan;

public class LantaiKeramik extends Bangunan{
    private int pLantai;
    private int lLantai;
    private String jLantai;

    public LantaiKeramik(String namaProduk, int hargaSatuan, double berat, boolean isCat, boolean isExchange, int pLantai, int lLantai, String jLantai) {
        super(namaProduk, hargaSatuan, berat, isCat, isExchange);
        this.pLantai = pLantai;
        this.lLantai = lLantai;
        this.jLantai = jLantai;
    }

    public int getpLantai() {
        return pLantai;
    }

    public void setpLantai(int pLantai) {
        this.pLantai = pLantai;
    }

    public int getlLantai() {
        return lLantai;
    }

    public void setlLantai(int lLantai) {
        this.lLantai = lLantai;
    }

    public String getjLantai() {
        return jLantai;
    }

    public void setjLantai(String jLantai) {
        this.jLantai = jLantai;
    }
    
    public void display(){
        super.display();
        System.out.println("Ukuran: "+getpLantai()+"x"+getlLantai()+"cm");
        System.out.println("Jenis: "+getjLantai());
    }
    
    
}
