package nl.bioinf.nomi.exc;

public class ExceptionDemo {
     private static int defaultXvalue = 1;

    public static void main(String[] args) {
        try {
            doFirst();
        } catch (DataProcessingException ex) {
            System.err.println("An error occurred; information: "
                    + ex.getMessage()
                    + "; cause = " + ex.getCause());
        }
    }

    public static void setDefaultXvalue(int defaultXvalue) {
        ExceptionDemo.defaultXvalue = defaultXvalue;
    }

    private static void doFirst() {
        doSecond();
    }

    private static void doSecond() {
        int x = defaultXvalue;
        try {
            int y = readNextLineOfFile();
            x = 42 / y;
        } catch (ArithmeticException ex) {
            //ex.printStackTrace();
            System.err.println("An error occurred; the input value was 0");
            System.err.println("Information: " + ex.getMessage());

            throw new DataProcessingException("Divide by zero", ex);
            //System.exits are evil!!
            //System.exit(1);
        }
        int z = x * x;
    }

    private static int readNextLineOfFile() {
        return 0;
    }
}