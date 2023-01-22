import java.io.*;
import java.net.*;





public class server {
    public static void main(String[] args)throws Exception {
        ServerSocket ss =new ServerSocket(6666);
        Socket s = ss.accept();
        System.out.println("connection succesfull \n ");

        DataInputStream in =new DataInputStream(s.getInputStream());
        DataOutputStream out =new DataOutputStream(s.getOutputStream());
      
        String msg_in= in.readUTF();
        String msg_out=msg_in.substring(3, 6);
        out.writeUTF(msg_out);
       
        s.close();
        ss.close();
        
    }
}
