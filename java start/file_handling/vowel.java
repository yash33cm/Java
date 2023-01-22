package file_handling;
import java.io.*;
import java.util.Scanner;
public class vowel {
   public static String fileToString(String filePath) throws Exception {
      Scanner sc = new Scanner(new File(filePath));
      StringBuffer sb = new StringBuffer();
      String input = new String();
      while (sc.hasNextLine()) {
         input = sc.nextLine();
         sb.append(input);
      }
      return sb.toString();
   }
   public static void main(String args[]) throws Exception {
      String str = fileToString("sample.txt");
      File f= new File("result.txt");
      FileWriter filewrite =new FileWriter(f);
      String words[] = str.split(" ");
      for(int i = 0; i < words.length; i++) {
         char ch = words[i].charAt(0);
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' ') {
             filewrite.write(words[i]+" ");

             
            }
            
      }
      filewrite.close();
      
   }
}