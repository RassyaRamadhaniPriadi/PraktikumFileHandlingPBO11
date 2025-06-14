import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = "students.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Umur: ");
            String umur = scanner.nextLine();
            System.out.print("Masukkan Prodi: ");
            String prodi = scanner.nextLine();

            String line = nim + "," + nama + "," + umur + "," + prodi;
            bw.newLine();
            bw.write(line);

            System.out.println("Data berhasil ditambahkan ke students.csv!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
