import java.util.Scanner;
public class Siakad05 {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);

        System.out.println("\n======================================");
        System.out.println("Rata-rata Nilai setiap mata kuliah");
        
        System.out.print("Input jumlah mahasiswa : ");
        int jumlahMahasiswa = input.nextInt();
        
        System.out.print("Input jumlah nilai yang akan di inputkan : ");
        int jumlahMatkul = input.nextInt();
        
        int[][] nilai = new int[jumlahMahasiswa][jumlahMatkul];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" +(i + 1));
            double totalPerSiswa = 0 ;
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = input.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPerSiswa/3);
        }

    }
}
