import java.io.*;
public class QUESTION5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        double total = 0;
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            String[] parts = line.trim().split("\\s+");
            String app = parts[0];
            double hours = Double.parseDouble(parts[1]);
            boolean saver = parts.length > 2 && parts[2].equals("SAVER");
            double power = switch (app) {
                case "FRIDGE" -> 150.0;
                case "AC" -> 1500.0;
                case "TV" -> 100.0;
                case "WASHER" -> 500.0;
                default -> 0.0;
            };
            if (saver && !(app.equals("AC") || app.equals("WASHER"))) {
                System.out.printf("%s: saver mode not supported%n", app);
                continue;
            }
            double units = (power * hours) / 1000.0;
            if (saver) {
                units *= 0.75;
            }
            double cost = units * 8;
            total += cost;
            System.out.printf("%s: Units=%.2f Cost=%.2f%n", app, units, cost);
        }
        System.out.printf("Total Cost: %.2f%n", total);
    }
}
