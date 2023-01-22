package file_handling;
import java.io.*;

public class serialization {
    public static void main(String[] args) {
        try{
        jet j = new jet("b-787", "deccan-airlines");
        System.out.println("before serialization");
        j.print();
        File f = new File("obj.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(j);
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println("after serialization");
        jet k = (jet) ois.readObject();
        k.print();
        ois.close();

        oos.close();
        }catch(Exception e){
            System.out.println("error maame"+e);
        }
        System.out.println("maame nee worry pannate naa paathukuren");


    }

}

class jet implements Serializable {
    
    String flightmodel;
    String airline;

    jet(String flightmodel, String airline) {
        this.flightmodel = flightmodel;
        this.airline = airline;
    }

    void print() {
        System.out.println("details are as follows \n" + flightmodel + "\n" + airline);
    }

}
