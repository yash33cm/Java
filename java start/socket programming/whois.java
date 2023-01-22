import java.io.*;
import java.net.Socket;

public class whois {
    public static void main(String[] args)throws Exception {
        Socket s=new Socket("whois.markmonitor.com",43);
        OutputStream os =s.getOutputStream();
        PrintWriter p =new PrintWriter(os,true);
        p.println("amazon.com");
        InputStream is =s.getInputStream();
        BufferedReader br =new BufferedReader(new InputStreamReader(is));
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);

        }
        s.close();

    }
    
}
