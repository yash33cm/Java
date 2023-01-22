
import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) throws Exception{

        Socket s = new Socket("localhost",6666);
        DataInputStream in =new DataInputStream(s.getInputStream());
        DataOutputStream out =new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String msg_in="",msg_out=""; 
        while(!msg_in.equals("end")){
            msg_out=br.readLine(); 
            out.writeUTF(msg_out); 
            out.flush();
            msg_in=in.readUTF();
            System.out.println(msg_in);//printing server's message
            }
        s.close();
            }
           
            

    }

