package nl.bioinf.nomi.fiddle;

public class Fiddle {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int z = 4;
        System.out.println(x + 3 * 5 - y-- + z / 4);

        int i = 21;
        int j = (i%3==0?--i/2:++i*2);
        System.out.println("j = " + j);
    }
}
