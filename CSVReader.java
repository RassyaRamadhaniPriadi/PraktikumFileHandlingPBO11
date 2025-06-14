import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        String csvFile = "students.csv";
        String line;
        String csvSplitBy = ",";
        int rowCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine(); // Lewati header
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue; // Lewati baris kosong

                String[] data = line.split(csvSplitBy);
                if (data.length >= 4) {
                    System.out.println("NIM: " + data[0] + ", Nama: " + data[1] + ", Umur: " + data[2] + ", Prodi: " + data[3]);
                    rowCount++;
                }
            }
            System.out.println("Jumlah baris data (tanpa header): " + rowCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

