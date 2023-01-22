public class arrray {
    int rollno[] = new int[4];
    public arrray(){

    }
    public   arrray(int[] arr){
        for(int i=0 ;i<4;i++){
            this.rollno[i]=arr[i];
        }
    }
    public arrray copyObject(arrray un){
        for(int i=0;i<4;i++){
            this.rollno[i] = un.rollno[i];
        }
            return un;

    }
    public void printarr(){
        for(int i=0;i<4;i++){
            System.out.println(rollno[i]);
        }

    }

    public static void main(String[] args) {
        int mylist[] ={103,108,107,109};
        arrray arr = new arrray(mylist);

        arr.printarr();
        arrray std = new arrray().copyObject(arr);
        System.out.println("now the copied data in another object is");
        std.printarr();
        
    }
    
}
