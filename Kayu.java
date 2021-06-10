/*
Nama    : Audrey Era Goldenia
NIM     : 1810511084
 */
package tokobangunan;

public class Kayu extends Material{
    private int panjangKayu;
    private int lebarKayu;
    private int tinggiKayu;
    private String jenisKayu;

    public Kayu(String namaProduk, int hargaSatuan, double berat, boolean isCat, boolean isBroke, int panjangKayu, int lebarKayu, int tinggiKayu, String jenisKayu) {
        super(namaProduk, hargaSatuan, berat, isCat, isBroke);
        this.panjangKayu = panjangKayu;
        this.lebarKayu = lebarKayu;
        this.tinggiKayu = tinggiKayu;
        this.jenisKayu = jenisKayu;
    }

    public int getPanjangKayu() {
        return panjangKayu;
    }

    public void setPanjangKayu(int panjangKayu) {
        this.panjangKayu = panjangKayu;
    }

    public int getLebarKayu() {
        return lebarKayu;
    }

    public void setLebarKayu(int lebarKayu) {
        this.lebarKayu = lebarKayu;
    }

    public int getTinggiKayu() {
        return tinggiKayu;
    }

    public void setTinggiKayu(int tinggiKayu) {
        this.tinggiKayu = tinggiKayu;
    }

    public String getJenisKayu() {
        return jenisKayu;
    }

    public void setJenisKayu(String jenisKayu) {
        this.jenisKayu = jenisKayu;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("Ukuran: "+getPanjangKayu()+"x"+getLebarKayu()+"x"+getTinggiKayu()+"m");
        System.out.println("Jenis: "+getJenisKayu());
    }    
}
