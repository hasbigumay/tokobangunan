/*
Nama    : Audrey Era Goldenia
NIM     : 1810511084
 */
package tokobangunan;

public class Bangunan extends TokoBangunan{
    private boolean isExchange;

    public Bangunan(String namaProduk, int hargaSatuan, double berat, boolean isCat, boolean isExchange) {
        super(namaProduk, hargaSatuan, berat, isCat);
        this.isExchange = isExchange;
    }

    public boolean isIsExchange() {
        return isExchange;
    }

    public void setIsExchange(boolean isExchange) {
        this.isExchange = isExchange;
    }
    
    @Override
    public void display(){
        super.display();
        if(isIsExchange()==true){
            System.out.println("Produk dapat ditukar");
        }
        else{
            System.out.println("Produk tidak dapat ditukar");
        }
    }  
}
