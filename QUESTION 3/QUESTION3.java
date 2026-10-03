import java.io.*;
public class QUESTION3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        double total = 0;
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            String[] parts = line.trim().split("\\s+");
            String type = parts[0];
            String name = parts[1];
            double fee = switch (type) {
                case "DAY_SCHOLAR" -> 40000 + 12000;
                case "HOSTELLER" -> 40000 + 60000;
                case "SCHOLAR" -> 20000 + 12000;
                default -> 0.0;
            };
            total += fee;
            System.out.printf("%s: %.2f%n", name, fee);
        }
        System.out.printf("Total Collected: %.2f%n", total);
    }
}
