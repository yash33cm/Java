
class thread1 extends Thread{
    int i=0;

    public void run(){
        while(i<300){
            System.out.println("i am good boy");
            i=i+1;
        }
    }
}

class thread2 extends Thread{
    int j=0;
    public void run(){
        while(j<300){
            System.out.println("i am very very very bad boy");
        j=j+1;
        }
    }
}











public class multithread {
     public static void main(String[] args) {
        
   
    thread1 t1 =new thread1();
    thread2 t2 =new thread2();
    t1.start();
    t2.start();
     }
    
}
