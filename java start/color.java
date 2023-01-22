import java.io.*;
import java.util.*;


class ColorMismatchException extends Exception{
    ColorMismatchException(String s){
        super(s);
    }
}

public class color {
    public static void main(String[] args) {
        try{
        Scanner scan=new Scanner(System.in);
        String in=scan.nextLine();
        String[] codes=new String[5];
        File f=new File("colors.txt");
        Scanner reader=new Scanner(f);
        int i=0;
        while(reader.hasNextLine()){
            codes[i++]=reader.nextLine();
        }
        for(i=0;i<5;i++){
            if(codes[i].equals(in))
            break;
        }
        if(i == 5)
        throw new ColorMismatchException("Color code not found");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}