package nl.bioinf.nomi.enums;

public class EnumsDemo {
//    public static final String AMINO_ACID_PROLINE = "Poline";

    public static void main(String[] args) {
        AminoAcid aa1 = AminoAcid.PROLINE;
        System.out.println("aa1 = " + aa1);

        AminoAcid aa2 = AminoAcid.createFromCodon("CCC");
        System.out.println("aa2 = " + aa2);

        AminoAcid.createFromCodon("ATG");
    }
}
