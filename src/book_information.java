public class book_information {

    public void chemistry() {
        System.out.println("");
        String[] chem ={"Organic chemistry","Physical chemistry","Bio chemistry","Inorganic chemistry","Polymer chemistry"};

        System.out.println("The books are available in the chemistry department are as follows:");
        for (String s : chem) {

            System.out.println(s);
        }
    }
    public void physics(){
        System.out.println("");
        String[] phy ={"Mechanics","Dynamics","Solid state physics","Quantum physics","Electromagnetism"};
        System.out.println("The books available in physics department are as follows:");
        for (String s : phy) {
            System.out.println(s);
        }
    }


    public void biology(){
        System.out.println("");
        String[] bio ={"Zoology","Botany","Medical science"};
        System.out.println("The books available in biology department are as follows:");
        for (String s : bio) {
            System.out.println(s);
        }
    }

}
