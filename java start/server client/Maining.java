import java.util.Scanner;

public class Maining {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of rows and columns in the array: ");

    //Creates a temporary two-dimensional array whose size is the next two inputed integers
    int[][] temp = new int[input.nextInt()][input.nextInt()];

    //Populates the temp array with inputed values
    System.out.println("Enter the array: ");
    for(int i=0; i < temp.length; i++) {
        for(int j=0; j < temp[0].length; j++) {
            temp[i][j] = input.nextInt();
        }
    }
    input.close();

    //Creates a new Location object that is equal to the object returned from the locateLargest() method call
    Location location = Location.locateLargest(temp);               

    System.out.println("The location of the largest element is " + location.maxValue + " at (" + location.row + ", " + location.column + ")\n");
    location.rowsum(temp);

    System.out.println("\nmultithreading process begins:\n");
    thread1 t1 =new thread1();
    thread2 t2 =new thread2();
    t1.start();
    t2.start();


    }
}
 class Location {
    public int row=0, column=0;
    public double maxValue = 0;

    public Location() {
    }

    /*
     * Accepts a two-dimensional array as the parameter.
     * Creates a new Location object.
     * Returns a Location object with maxValue at position (0,0) unless a larger value is found.
     */
        public static Location locateLargest(int[][] a) {
        Location location = new Location();        
        location.maxValue=a[0][0];

            for(int i = 0; i < a.length; i++) {
                for(int j=0; j < a[i].length; j++) {
                    if(a[i][j] > location.maxValue) {
                        location.maxValue = a[i][j];
                        location.row = i;
                        location.column = j;
                    }
                }

            }

            return location;
       }

       public void rowsum(int[][] a){
        int rows = a.length;    
        int cols = a[0].length;
        int sumRow;
        for(int i = 0; i < rows; i++){    
            sumRow = 0;    
            for(int j = 0; j < cols; j++){    
              sumRow = sumRow + a[i][j];    
            }    
            System.out.println("Sum of " + (i+1) +" row: " + sumRow);    
        }    
       }

    }


    class thread1 extends Thread{
        int i=0;
    
        public void run(){
            while(i<100){
                System.out.println("This is thread1");
                i=i+1;
            }
        }
    }
    
    class thread2 extends Thread{
        int j=0;
        public void run(){
            while(j<100){
                System.out.println("this is thread 2");
            j=j+1;
            }
        }
    }
    
    
    
    
    
    