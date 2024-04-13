import java.util.Base64;
public class encoding_decoding_url {
    public static void main(String[] args) {

                // Your URL
                String url = "https://www.intelliamiet.in/trikon/onepage";

                // Encode the URL using Base64
                String encodedUrl = Base64.getEncoder().encodeToString(url.getBytes());

                // Now you can use encodedUrl as the database path
                System.out.println("Encoded URL: " + encodedUrl);

                // Decode the encoded URL
                byte[] decodedBytes = Base64.getDecoder().decode(encodedUrl);
                String decodedUrl = new String(decodedBytes);
                System.out.println("Decoded URL: " + decodedUrl);
            }
        }