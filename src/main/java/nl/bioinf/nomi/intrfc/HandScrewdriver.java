package nl.bioinf.nomi.intrfc;

public class HandScrewdriver implements Screwable {
    @Override
    public void doScrew(Screw theScrew) {
        System.out.println(this.getClass().getSimpleName() + " is screwing the screw");
    }
}
