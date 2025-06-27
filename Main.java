import com.trend.cloudone.amaas.AMaasClient;
import com.trend.cloudone.amaas.AMaasException;

public class Main {
    public static void main(String[] args) {
        try {
            // AMaasClient(String region, String apiKey, long timeoutInMillis)
            AMaasClient client = new AMaasClient("us-east-1", "<V1_API_Key>", 10000); // 10 sec timeout

            try {
                String scanResult = client.scanFile("hello.txt");

                if (scanResult != null) {
                    System.out.println("Scan result: " + scanResult);
                }
            } finally {
                client.close();
            }

        } catch (AMaasException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
