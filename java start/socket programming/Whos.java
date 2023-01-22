import java.net.*;
import java.io.*;

public class Whos {

    public static void main(String[] args) {

        // if (args.length < 1) return;

        String domainName = "amazon.com";

        String hostname = "whois.markmonitor.com";
        int port = 43;
        try (Socket socket = new Socket(hostname, port)) {

            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            writer.println(domainName);

            InputStream input = socket.getInputStream();

            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (UnknownHostException ex) {

            System.out.println("Server not found: " + ex.getMessage());

        } catch (IOException ex) {
            System.out.println("I/O error: " + ex.getMessage());

        }

    }

}
