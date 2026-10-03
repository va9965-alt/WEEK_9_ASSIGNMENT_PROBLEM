import java.io.*;
public class QUESTION2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        double grandTotal = 0;
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            String[] parts = line.trim().split("\\s+");
            String type = parts[0];
            double weight = Double.parseDouble(parts[1]);
            double value = Double.parseDouble(parts[2]);
            double charge = switch (type) {
                case "STANDARD" -> 40 + (10 * weight);
                case "EXPRESS" -> 80 + (15 * weight);
                case "FRAGILE" -> (40 + (10 * weight)) + 50;
                default -> 0.0;
            };
            double insurance = type.equals("STANDARD") ? 0 : 0.02 * value;
            double total = charge + insurance;
            grandTotal += total;
            System.out.printf("%s: Charge=%.2f Insurance=%.2f Total=%.2f%n", type, charge, insurance, total);
        }
        System.out.printf("Grand Total: %.2f%n", grandTotal);
    }
}
