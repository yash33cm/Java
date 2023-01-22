
import java.net.*;


public class address {
    public static void main(String[] args) throws Exception{
        InetAddress ip = InetAddress.getLocalHost();
        String hostname=ip.getHostName();
        String address=ip.getHostAddress();
        System.out.println("hostname="+hostname+"\nhostaddress="+address);

        ip = InetAddress.getByName(new URL("https://www.amazon.in/").getHost());
        String ghostname=ip.getHostName();
        String gaddress=ip.getHostAddress();
        System.out.println("hostname global="+ghostname+"\nhostaddress global="+gaddress);

    }
    
}
