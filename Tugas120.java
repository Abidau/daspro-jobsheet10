import java.util.Scanner;

public class Tugas120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int [10][6];
        int jml = 0;
        double rata = 0;
        double rataKeseluruhan = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print("Masukkan nilai indeks ke-" + i + ": ");
                a[i][j] = sc.nextInt();
            }
        } for (int i = 0; i < a.length; i++) {
            jml = 0;
            for (int j = 0; j < a[0].length; j++) {
                jml += a[i][j];
            }
            rata = jml / 6;
            System.out.println("Rata ratanya setiap resonden ke-" + i + " adalah " + rata);
        } jml = 0;
            for (int j = 0; j < a[0].length; j++) {
            jml = 0;
                for (int i = 0; i < a.length; i++) {
                    jml += a[i][j];
                }
                    rata = jml / 10;
                    System.out.println("Rata ratanya setiap pertanyaan ke-" + j + " adalah " + rata);
        } for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                rataKeseluruhan += a[i][j];
            }
        }
        double seluruhRata = rataKeseluruhan / 60;
        System.out.println("Rata ratanya keseluruhan adalah " + seluruhRata);
        sc.close();
    }
}
