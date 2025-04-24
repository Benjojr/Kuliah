public class ProgressBarWithCountdown {
    public static void main(String[] args) {
        int totalTimeInSeconds = 60; // Total waktu 1 menit (60 detik)
        int progress = 0;

        System.out.println("Progress Bar with Countdown:");

        for (int i = 0; i <= totalTimeInSeconds; i++) {
            // Hitung persentase
            progress = (i * 100) / totalTimeInSeconds;

            // Hitung waktu tersisa
            int remainingTime = totalTimeInSeconds - i;

            // Tampilkan progress bar dengan countdown
            System.out.print("\r[" + generateBar(progress) + "] " + progress + "% | Time left: " + remainingTime + "s");

            // Tunggu 1 detik
            try {
                Thread.sleep(1000); // 1000 ms = 1 detik
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nProgress completed!");
    }

    // Fungsi untuk membuat visualisasi progress bar
    private static String generateBar(int progress) {
        int barLength = 50; // Panjang bar
        int filledLength = (progress * barLength) / 100;

        StringBuilder bar = new StringBuilder();
        for (int i = 0; i < barLength; i++) {
            if (i < filledLength) {
                bar.append("=");
            } else {
                bar.append(" ");
            }
        }
        return bar.toString();
    }
}
