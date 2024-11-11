import java.util.Scanner;

public class BioskopWithScanner05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baris, kolom;
        String nama;
        int pilihan;
        boolean valid; 

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit ");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukan nama: ");
                    nama = input.nextLine();
                    valid = false;

                    while (!valid) {
                        System.out.print("Masukan baris (1-4): ");
                        baris = input.nextInt();
                        System.out.print("Masukan kolom (1-2): ");
                        kolom = input.nextInt();
                        input.nextLine();

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Nomor baris atau kolom tidak tersedia. Silakan masukkan nomor baris (1-4) dan kolom (1-2) yang benar.");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah terisi. Silakan pilih kursi lain.");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data berhasil dimasukkan.");
                            valid = true;
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n=== Daftar Penonton ===");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.printf("Baris %d, Kolom %d: %s\n", i + 1, j + 1, penonton[i][j]);
                            } else {
                                System.out.printf("Baris %d, Kolom %d: ***\n", i + 1, j + 1);
                            }
                            
                        }
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih.");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
                    break;
            }
        }
    }
}
