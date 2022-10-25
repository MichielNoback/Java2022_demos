package nl.bioinf.nomi.enums;

import java.util.HashMap;
import java.util.Map;

public enum AminoAcid {
    GLYCINE("Glycine", 400){
        @Override
        public String getThreeLetterCode() {
            return "Gly";
        }
    },
    PROLINE("Proline", 450),
    LYSINE("Lysine", 630);

    private final String name;
    private final double molecularWeight;

    private static Map<String, AminoAcid> codonsToAA = new HashMap<>();

    static {
        codonsToAA.put("GGG", AminoAcid.GLYCINE);
        codonsToAA.put("GGC", AminoAcid.GLYCINE);
        codonsToAA.put("GGT", AminoAcid.GLYCINE);
        codonsToAA.put("GGA", AminoAcid.GLYCINE);
        codonsToAA.put("CCC", AminoAcid.PROLINE);
        codonsToAA.put("AAA", AminoAcid.LYSINE);
    }

    public String getName() {
        return name;
    }

    public static Map<String, AminoAcid> getCodonsToAA() {
        return codonsToAA;
    }

    private AminoAcid(String name, double molecularWeight) {
        this.name = name;
        this.molecularWeight = molecularWeight;
    }

    @Override
    public String toString() {
        return "AminoAcid{" + name + "}";
    }

    //factory
    public static AminoAcid createFromCodon(String codon){
        if(codonsToAA.containsKey(codon)) return codonsToAA.get(codon);
        else throw new IllegalArgumentException("Unknown codon: " + codon);
    }

    public String getThreeLetterCode(){
        throw new IllegalArgumentException("Unknown");
    }


}
