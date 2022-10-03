package nl.bioinf.nomi.intrfc;

public class Powerdrill implements Screwable{
    @Override
    public void doScrew(Screw theScrew) {
        System.out.println(this.getClass().getSimpleName() + " is screwing the screw");
    }

    public void drill() {
        System.out.println("drilling a hole");
    }
}
