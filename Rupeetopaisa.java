public class Rupeetopaisa {
    public static void main(String[] args) {
        
        double n = 56.50;
        int RS = (int)n;
        double paisa = (n-RS)*100;

        System.out.println("\nRS = " + RS);
        System.out.println("\npaise = " + (int)paisa);


    }
}
