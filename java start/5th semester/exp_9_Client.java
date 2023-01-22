import java.io.*;
import java.net.*;

public class exp_9_Client{

    public static void main(String[] args) throws Exception{
        Socket s = new Socket(InetAddress.getByName("Localhost"), 5000);
        byte[] content = new byte[10000];
        FileOutputStream f = new FileOutputStream("data1.txt");
        BufferedOutputStream b = new BufferedOutputStream(f);
        InputStream i = s.getInputStream();
        int bytesread = 0;

        while((bytesread=i.read(content))!=-1)
        b.write(content, 0, bytesread);
        b.flush();
        s.close();
        System.out.println("File save successful...");
    }
}

