import java.util.Scanner;
public class Modif4BioskopWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("============================");
            System.out.println("        Pilihan menu        ");
            System.out.println("1. Input data penonton      ");
            System.out.println("2. Tampilkan daftar Penonton");
            System.out.println("3. Exit                     ");
            System.out.println("============================");
            System.out.println();
            System.out.print("Pilih menu : ");
            int menu = sc.nextInt();
            sc.nextLine();
    
            if (menu == 1) {
                boolean real = false;

                while (real) {
                    System.out.print("Masukkan nama : ");
                    String nama = sc.nextLine();

                    System.out.print("Masukkan baris (1-4): ");
                    int baris = sc.nextInt();

                    System.out.print("Masukkan kolom (1-2): ");
                    int kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Tidak Valid");
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi suda ditempati, pilih kursi yang lain!!");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton");
                    
                        real = true;
                    }
                }
            } else if (menu == 2) {
                System.out.println("Berhasil Masuk ke Daftar Penonton: ");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.println("Baris " + (i+1) + " Kolom " + (j+1) + " : " + penonton[i][j]);
                        } else {
                            System.out.println("Baris " + (i+1) + " Kolom " + (j+1) + " : ***");
                        }
                    }
                }
            } else if (menu == 3) {
                System.out.println("Keluar dari program");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Coba masukkan kembali");
            }
            System.out.println("\nKembali ke menu utama..\n");
            }
            sc.close();
    }
}
