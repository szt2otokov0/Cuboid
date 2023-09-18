import java.util.Random;

public class Cuboid {
    public static void main(String[] args) {
        Random rnd = new Random();
        double a = rnd.nextDouble();
        double b = rnd.nextDouble();
        double c = rnd.nextDouble();

        double surface = 2*((a+b)+(a+c)+(b+c));
        double volume = a*b*c;

        System.out.println("Surface area = " + surface);
        System.out.println("Volume = " + volume);
    }
}