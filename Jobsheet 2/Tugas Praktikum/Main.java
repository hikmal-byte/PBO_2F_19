public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);

        System.out.println("=== Hasil Perhitungan Circle ===");
        System.out.println("Radius        : " + 5);
        System.out.println("Luas (Area)   : " + circle1.area());
        System.out.println("Keliling (Circumference) : " + circle1.circumference());
    }
}