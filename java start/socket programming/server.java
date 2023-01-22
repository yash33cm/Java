import java.io.*;
import java.net.*;





public class server {
    public static void main(String[] args)throws Exception {
        ServerSocket ss =new ServerSocket(6666);
        Socket s = ss.accept();

        DataInputStream in =new DataInputStream(s.getInputStream());
        DataOutputStream out =new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String msg_in="",msg_out=""; 
        while(!msg_in.equals("end")){
            msg_in=in.readUTF();
            System.out.println(msg_in);//printing client's message
            msg_out=br.readLine(); 
            out.writeUTF(msg_out); 
            out.flush();

            }
        s.close();
        ss.close();
        
    }
}
