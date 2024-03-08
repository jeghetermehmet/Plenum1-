class Bud{
    private String navn;
    private int budStr;
    Bud(String navn, int budStr){
        this.navn = navn;
        if (budStr >= 1){
            this.budStr = budStr;
        } else 
        this.budStr = 1;
    }
    String hentnavn(){
        return this.navn;
    }
    int hentbudStr(){
        return this.budStr;

    }
    public void skrivBud() {
        System.out.println("Bud: " + navn + " bydde " + budStr);
    }
}