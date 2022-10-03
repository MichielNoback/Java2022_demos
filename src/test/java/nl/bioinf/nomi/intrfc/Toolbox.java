package nl.bioinf.nomi.intrfc;

import java.util.ArrayList;
import java.util.List;

public class Toolbox {
    private List<Screwable> screwables = new ArrayList<>();

    public void addScrewDriver(Screwable screwable) {
        this.screwables.add(screwable);
    }
}
