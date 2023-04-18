import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

public class zadacha1 {
    public static void main(String[] args) {
        int[] arr = { 10, 43, 81, 9, 29, 24, 7, 57, 40, 37 };
        arrSort(arr, "log_file.txt");
        System.out.println();
        System.out.println("Данные отсортированы: " + Arrays.toString(arr));

    }
    static int[] arrSort(int[] arrey, String nameFile) {
        File file = new File(nameFile);

        int n = 1;
        while (n < arrey.length) {
            for (int i = 0; i < arrey.length - n; i++) {

                if (arrey[i] > arrey[i + 1]) {
                    int numTemp = arrey[i];
                    arrey[i] = arrey[i + 1];
                    arrey[i + 1] = numTemp;

                }
                try {
                    FileWriter writer = new FileWriter(file, true);
                    writer.append(String.valueOf(arrey[i]));
                    writer.append("\n");
                    writer.flush();
                } catch (Exception ex) {
                    System.out.println("Что то пошло не так! ");
                }
            }
            n++;
        }
        return arrey;
    }
}