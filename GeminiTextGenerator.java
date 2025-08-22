import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class GeminiTextGenerator {
    public static void main(String[] args) {
        try {
            String apiKey = "AIzaSyA7A5PBSLhXN2Mm2xsuBF7A5Oe5Lv1sgvA";  // Replace with your new key
            String endpoint = "https://generativelanguage.googleapis.com/v1beta/models/gemini-pro:generateContent?key=" + apiKey;

            URL url = new URL(endpoint);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            conn.setDoOutput(true);

            String prompt = "Write a short story about a robot that learns emotions.";
            String jsonInput = "{ \"contents\": [{ \"parts\": [{ \"text\": \"" + prompt + "\" }] }] }";

            OutputStream os = conn.getOutputStream();
            os.write(jsonInput.getBytes("UTF-8"));
            os.close();

            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                System.out.println("Response:");
                System.out.println(response.toString());
            } else {
                System.out.println("POST request failed. Response code: " + responseCode);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
