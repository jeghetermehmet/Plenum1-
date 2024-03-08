import java.util.ArrayList;

public class Annonse {
    String annonsetekst;
    ArrayList<Bud> buder;
    
    Annonse(String annonsetekst){
        this.annonsetekst = annonsetekst;
        this.buder = new ArrayList<>();
    }
    void giBud (String navn , int belop){
        Bud bud = new Bud(navn, belop);
        buder.add(bud);
    }
    int antBud() {
        return buder.size();
    }
    Bud budhoyestebud(){
        Bud hoyestebud = null;
        for(Bud bud : buder){
            if (hoyestebud == null || bud.hentbudStr() > hoyestebud.hentbudStr()){
                hoyestebud = bud;
            }
        }
        return hoyestebud;
    }
    public void kraftBud(String navn, int belop, int maks) {
        Bud hoyesteBud = this.budhoyestebud();

        if (belop > hoyesteBud.hentbudStr()) {
            giBud(navn, belop);
        } else {
            int nyttHoyeste = hoyesteBud.hentbudStr() + 1;
            if (maks < nyttHoyeste) return;

            giBud(navn, nyttHoyeste);
        }
    }
    public void skrivAnnonse() {
        System.out.println("Annonseinfo: " + annonsetekst + "\nAnnonsen inneholder "
                           + antBud() + " bud");
    }

    public void skrivHoyeste() {
        Bud bud = budhoyestebud();

        if (bud != null) bud.skrivBud();
    }
}
