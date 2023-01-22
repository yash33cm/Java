import java.io.*;
import java.net.*;

public class exp_9_Server{
    public static void main(String[] args) throws Exception{

        ServerSocket s = new ServerSocket(5000);
        Socket socket = s.accept();
        InetAddress ia = InetAddress.getByName("localhost");
        File f = new File("data.txt");
        FileInputStream fs = new FileInputStream(f);
        BufferedInputStream bs = new BufferedInputStream(fs);

        OutputStream o =socket.getOutputStream();
        byte[] content;
        long filelength = f.length();
        long current = 0;
        long start = System.nanoTime();
        while(current!=filelength){

            int size = 10000;
            if(filelength - current >= size){current += size;}
            else{
                size = (int)(filelength - current);
                current = filelength;
            }
            content = new byte[size];
            bs.read(content, 0, size);
            o.write(content);
            System.out.println("Sending file... "+(current*100)/filelength+"%complete");
        }
        o.flush();
        socket.close();
        s.close();
        System.out.println("File send successful...");
    }
}
