public class Areaoftriangle {
    public static void main(String[] args) {
        
        double base = 10;
        double height = 50;

        double Area =  (1.0/2) * base * height; /*  cant use 1/2 coz its int calculataion is return 0 so calculation became 0 we can use (1.0/2)*base*height  or   [(base*height)/2] */

        System.out.println("\n Area of the triangle is = " + Area);
    }
}
