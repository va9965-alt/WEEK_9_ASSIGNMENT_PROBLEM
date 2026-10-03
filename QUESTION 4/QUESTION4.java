import java.io.*;
public class QUESTION4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        double total = 0;
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            String[] parts = line.trim().split("\\s+");
            String cab = parts[0];
            double km = Double.parseDouble(parts[1]);
            String time = parts[2];
            double rate = switch (cab) {
                case "MINI" -> 10.0;
                case "SEDAN" -> 14.0;
                case "SUV" -> 18.0;
                default -> 0.0;
            };
            double fare = Math.max(100.0, km * rate);
            if (time.equals("NIGHT")) {
                if (cab.equals("MINI")) {
                    System.out.printf("%s: night service not available%n", cab);
                    continue;
                }
                fare *= 1.2;
            }
            total += fare;
            System.out.printf("%s: %.2f%n", cab, fare);
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
