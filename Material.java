/*
Nama    : Audrey Era Goldenia
NIM     : 1810511084
 */
package tokobangunan;

public class Material extends TokoBangunan {
    private boolean isBroke;

    public Material(String namaProduk, int hargaSatuan, double berat, boolean isCat, boolean isBroke) {
        super(namaProduk, hargaSatuan, berat, isCat);
        this.isBroke = isBroke;
    }

    public boolean isIsBroke() {
        return isBroke;
    }

    public void setIsBroke(boolean isBroke) {
        this.isBroke = isBroke;
    }
    
    @Override
    public void display(){
        super.display();
        if(isIsBroke()==true){
            System.out.println("Produk mudah rusak");
        }
        else{
            System.out.println("Produk tidak mudah rusak");
        }
    }
    
    
}
