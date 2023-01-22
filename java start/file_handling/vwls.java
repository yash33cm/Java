package file_handling;

import java.io.*;

public class vwls {
    public static void main(String args[]) {
        try {
            File file = new File("vowels.txt");
            FileReader fr = new FileReader(file);
            char[] arr = new char[(int) file.length()];
            int len = (int) file.length();
            fr.read(arr);
            char[] arr1 = new char[100];

            for (int i = 0; i < len; i++) {
                if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                    int j = 0;
                    while (arr[j] != ' ') {
                        arr1[j++] = arr[i];
                        i++;
                        String output = new String(arr1);
                        System.out.println(output);
                    }
                }
            }
            fr.close();
        } catch (Exception e) {
            System.out.println("Exception:" + e);
        }
       
    }
}