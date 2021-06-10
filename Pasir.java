/*
Nama    : Audrey Era Goldenia
NIM     : 1810511084
 */
package tokobangunan;

public class Pasir extends Material {
    private String jenis;
    private String warna;

    public Pasir(String namaProduk, int hargaSatuan, double berat, boolean isCat, boolean isBroke, String jenis, String warna) {
        super(namaProduk, hargaSatuan, berat, isCat, isBroke);
        this.jenis = jenis;
        this.warna = warna;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("Jenis: "+getJenis());
        System.out.println("Warna: "+getWarna());
    }
    
}
