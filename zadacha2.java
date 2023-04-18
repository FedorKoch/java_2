import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class zadacha2 {
    public static void main(String[] args) {
        
        String pathFile = "dt.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(pathFile))) {

            String line;

            while ((line = br.readLine()) != null) {

                StringBuilder result = new StringBuilder();

                String[] parts = line.split(",");

                for (String part : parts) {

                    String[] kv = part.split(":");

                    if (kv[0].equals("\"фамилия\"")) {

                        result.append("Студент ").append(kv[1].replaceAll("\"", "")).append(" ");

                    } else if (kv[0].equals("\"оценка\"")) {

                        result.append("получил ").append(kv[1].replaceAll("\"", "")).append(" ");

                    } else if (kv[0].equals("\"предмет\"")) {
                        result.append("по предмету ").append(kv[1].replaceAll("\"", "")).append(".");
                    }
                }
                System.out.println(result.toString());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
