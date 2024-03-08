import java.util.ArrayList;

public class Kategori {
    String navn;
    ArrayList<Annonse> annonser;
    
    Kategori(String navn){
        this.navn = navn;
        this.annonser = new ArrayList<>();
    }
    void oprettnyAnnonse(String annonsetekst){
        Annonse nyAnnonse = new Annonse(annonsetekst);
        annonser.add(nyAnnonse);
    }
    ArrayList<Annonse> hentAnnonse(){
     return annonser;

    }
    public void skriveAnnonser() {
        System.out.println("Annonser for kategori: " + navn);
        for (Annonse annonse : annonser) {
            annonse.skrivAnnonse();
            System.out.println();
        }
    }
}
