package nl.bioinf.nomi.entities;

public class LocalClassDemo {
    private Walkable mouse = new Walkable(){
        @Override
        public void walk() {

        }
    };

    public static void main(String[] args) {
        var zombie = new Walkable() {
            @Override
            public void walk() {
                System.out.println("zombie walking");
            }
        };
    }
}
