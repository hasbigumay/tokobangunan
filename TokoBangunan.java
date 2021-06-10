/*
Nama    : Audrey Era Goldenia
NIM     : 1810511084
 */
package tokobangunan;

public class TokoBangunan {
    private String namaProduk;
    private int hargaSatuan;
    private double berat;
    private boolean isCat;
    private static int produkCount = 0;
    private int produkNum;
    private static int produkPrice = 0;

    public TokoBangunan(String namaProduk, int hargaSatuan, double berat, boolean isCat) {
        this.namaProduk = namaProduk;
        this.hargaSatuan = hargaSatuan;
        this.berat = berat;
        this.isCat = isCat;
        this.produkNum = produkCount++;
        this.produkPrice += hargaSatuan;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public boolean isIsCat() {
        return isCat;
    }

    public void setIsCat(boolean isCat) {
        this.isCat = isCat;
    }

    public static int getProdukCount() {
        return produkCount;
    }

    public static void setProdukCount(int produkCount) {
        TokoBangunan.produkCount = produkCount;
    }

    public int getProdukNum() {
        return produkNum;
    }

    public void setProdukNum(int produkNum) {
        this.produkNum = produkNum;
    }

    public static int getProdukPrice() {
        return produkPrice;
    }

    public static void setProdukPrice(int produkPrice) {
        TokoBangunan.produkPrice = produkPrice;
    }
 
    public void display(){
        System.out.println("No Produk: "+produkNum);
        System.out.println("Produk : "+getNamaProduk());
        System.out.println("Harga Satuan: "+getHargaSatuan());
        System.out.println("Berat: "+getBerat());
        if(isIsCat()==true){
            System.out.println("Produk dapat dicat");
        }
        else{
            System.out.println("Produk tidak dapat dicat");
        }
        System.out.println("Jumlah Produk: "+produkCount);
        System.out.println("Nilai Keseluruhan: "+produkPrice);
    }
    
}
