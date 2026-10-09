public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga sg = new Segitiga();

        System.out.println("Total Sudut (1 param) : " + sg.totalSudut(60));
        System.out.println("Total Sudut (2 param) : " + sg.totalSudut(60, 40));

        System.out.println("Keliling (3 sisi)     : " + sg.keliling(3, 4, 5));
        System.out.println("Sisi Miring (2 sisi)  : " + sg.keliling(3, 4));        
    }
}
