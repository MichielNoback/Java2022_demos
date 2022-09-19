package nl.bioinf.nomi;

import org.junit.jupiter.api.Test;

public class OperatorsDemo {

    @Test
    public void switchTest() {
        String cond = "A";
        doSwitch(cond);
    }

    private void doSwitch(String cond) {
        switch (cond) {
            case "A":
                System.out.println("A ");
            case "B":
                System.out.println("B "); return;
            case "C":
                System.out.println("C "); break;
            default:
                System.out.println("default");
        }
        System.out.println("end");
    }

}
