public class Hovedprogram {
    public static void main(String[] args) {
        Markedplass markedplass = new Markedplass("Torget");
        markedplass.skrivMarkedplassInfo();

        markedplass.lesFraFil("annonsedata.csv");
        markedplass.skrivMarkedplassInfo();
        System.out.println();

        Kategori boker = markedplass.hentKategori("boker");
        boker.skriveAnnonser();
    }
    
}
