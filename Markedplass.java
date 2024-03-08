import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Markedplass {
    String navn;
    HashMap<String, Kategori> kategorier;

    Markedplass(String navn){
        this.navn = navn;
        this.kategorier = new HashMap<>();
    }
    void opprettnyKategori(String kategorinavn){
        kategorier.put(kategorinavn, new Kategori(kategorinavn));
    }
    Kategori hentKategori(String navn){
        return kategorier.get(navn);
    }
    void lesFraFil(String filnavn){
        Scanner sc;
        try{
            sc = new Scanner(new File(filnavn));
        } catch (FileNotFoundException e){
            System.out.println("Fant ikke filen...");
            return;
        }
        while (sc.hasNextLine()) {
            String[] data = sc.nextLine().split(",");
            String kategori = data[0];
            String annonsetekst = data[1];

            if(hentKategori(kategori) == null) opprettnyKategori(kategori);
            hentKategori(kategori).oprettnyAnnonse(annonsetekst);
        }
        sc.close();
    }
    public void skrivMarkedplassInfo() {
        System.out.println(navn + " bestaar av " + kategorier.size() + " kategorier");
    }
}
