package tokobangunan;
  
public class TokoBangunanTest {
    public static void main(String[] args){
    Kayu k01 = new Kayu("Kayu",210000,2,true,false,3,4,5,"Kamper");
    Kayu k02 = new Kayu("Kayu",185000,2,true,false,3,4,5,"Borneo");
    Kayu k03 = new Kayu("Kayu",100000,2,true,true,3,4,5,"Meranti");
    k01.display();
    k02.display();
    k03.display();
    System.out.println("");
    
    Pasir p01 = new Pasir("Pasir",300000,2,false,false,"Beton","Hitam");
    Pasir p02 = new Pasir("Pasir",250000,2,false,false,"Elod","Putih");
    Pasir p03 = new Pasir("Pasir",150000,2,false,false,"Mundu","Merah");
    p01.display();
    p02.display();
    System.out.println("");
    
    Semen s01 = new Semen("Semen",56000,40,false,false,"Holcim");
    Semen s02 = new Semen("Semen",58000,40,false,false,"Tiga Roda");
    Semen s03 = new Semen("Semen",56000,40,false,false,"Padang");
    s01.display();
    System.out.println("");
    
    Pintu d01 = new Pintu("Pintu",1500000,2,true,false,1,2,3,"Kayu Meranti");
    Pintu d02 = new Pintu("Pintu",1500000,2,true,false,1,2,3,"Lempengan Alumunium");
    d01.display();
    d02.display();
    System.out.println("");
    
    LantaiKeramik l01 = new LantaiKeramik("Lantai Keramik",100000,2,false,false,3,4,"KW 1");
    l01.display();
    
    } 
}
