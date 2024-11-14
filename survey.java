public class survey {
    public static void main(String[] args) {
        
        int[][] dataSurvey = new int[][]{
            {4, 5, 3, 5, 5, 4},  // Responden 1
            {3, 4, 2, 3, 5, 4},  // Responden 2
            {5, 4, 4, 5, 3, 4},  // Responden 3
            {3, 3, 4, 2, 4, 3},  // Responden 4
            {4, 5, 5, 4, 4, 5},  // Responden 5
            {1, 3, 3, 4, 1, 3},  // Responden 6
            {4, 4, 5, 5, 3, 5},  // Responden 7
            {5, 5, 4, 2, 5, 5},  // Responden 8
            {3, 2, 3, 4, 3, 2},  // Responden 9
            {4, 5, 3, 4, 5, 5}   // Responden 10
        };

        int jmlRespondent = dataSurvey.length;
        int jmlPertanyaan = dataSurvey[0].length;

        
        System.out.println("======= Rata-rata Responden =======\n");

        for (int i = 0; i < jmlRespondent; i++) {
            int skor = 0;
            for (int j = 0; j < jmlPertanyaan; j++) {
                skor += dataSurvey[i][j];
            }
            
            double rata2 = (double) skor / jmlPertanyaan;
            System.out.println("Rata-rata responden ke-" + (i+1) + " : " + rata2);
        }

        
        System.out.println("\n======= Rata-rata Pertanyaan =======\n");

        for (int j = 0; j < jmlPertanyaan; j++) {
            int skor = 0;
            for (int i = 0; i < jmlRespondent; i++) {
                skor += dataSurvey[i][j];
            }
            double rata2 = (double) skor / jmlRespondent;
            System.out.println("Rata-rata pertanyaan ke-" + (j+1) + " : " + rata2);
        }

        
        System.out.println("\n======= Rata-rata Keseluruhan =======\n");

        int skorKeseluruhan = 0;
        for (int i = 0; i < jmlRespondent; i++) {
            for (int j = 0; j < jmlPertanyaan; j++) {
                skorKeseluruhan += dataSurvey[i][j];
            }
        }
        double rataKeseluruhan = (double) skorKeseluruhan / 
        (jmlRespondent * jmlPertanyaan);

        System.out.println("Rata-rata keseluruhan : " + rataKeseluruhan);
    }

}