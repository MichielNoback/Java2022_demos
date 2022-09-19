package nl.bioinf.nomi;

import java.util.Arrays;

public class Main {
    public static int power = 2;
    public String name = null;

    public static void main(String[] args) {
        System.out.println("args = " + Arrays.toString(args));
        Main m = new Main();
        for (int i = 0; i < args.length; i++) {
            System.out.println("i = " + i);
            System.out.println("arg = " + args[i]);
        }

        for (String arg: args) {
            System.out.println("arg 2 = " + arg);
        }
//        Main main = new Main();
//        main.powerTheNumber(2);
    }

    public int powerTheNumber(int i) {
        return (int)Math.pow(i, power);
    }
}
