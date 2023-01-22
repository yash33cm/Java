package file_handling;
import java.io.*;
public class demofile {
    public static void main(String[] args) throws Exception{
        File f =new File("mom.txt");
        FileOutputStream fos =new FileOutputStream(f);
        DataOutputStream dos =new DataOutputStream(fos);
        dos.writeUTF("my mom and dad is the important in my life");


        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        String str = dis.readUTF();
        System.out.println(str);
        dis.close();
        dos.close();

    }
        
    }
    

