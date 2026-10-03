import java.io.*;
public class QUESTION1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        double total = 0;
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            String[] parts = line.trim().split("\\s+");
            String seat = parts[0];
            int count = Integer.parseInt(parts[1]);
            double price = switch (seat) {
                case "REGULAR" -> 150.0;
                case "PREMIUM" -> 250.0;
                case "RECLINER" -> 400.0;
                default -> 0.0;
            };
            double amount = (price + 20) * count;
            total += amount;
            System.out.printf("%s: %.2f%n", seat, amount);
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
