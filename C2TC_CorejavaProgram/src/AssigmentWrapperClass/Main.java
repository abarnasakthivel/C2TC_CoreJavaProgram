package AssigmentWrapperClass;

public class Main {
    public static void main(String[] args) {
        // Testing AirIndia
        AirIndia ai = new AirIndia(3, 1500.0);
        System.out.println("AirIndia Amount: ₹" + ai.calculateAmount());

        // Testing Indigo
        Indigo ind = new Indigo(2, 1800.0);
        System.out.println("Indigo Amount: ₹" + ind.calculateAmount());
    }
}