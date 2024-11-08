import java.util.Scanner;
public class Modif1SIAKAD20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Siswa : ");
        int jmlSiswa = sc.nextInt();

        System.out.print("Masukkan Jumlah Mata Kuliah : ");
        int jmlMatkul = sc.nextInt();
        sc.nextLine();

        int[][] nilai = new int[jmlSiswa][jmlMatkul];

        for (int i = 0; i < jmlSiswa; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPersiswa = 0;

            for (int j = 0; j < jmlMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + " : ");
                nilai[i][j] = sc.nextInt();
                totalPersiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata : " + totalPersiswa/jmlMatkul);
        }
        System.out.println();

        System.out.println("==================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah");

        for (int j = 0; j < jmlMatkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jmlSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j+1) + " : " + totalPerMatkul/jmlMatkul);
        }
        System.out.println("==================================");
    
    sc.close();
    }
}
