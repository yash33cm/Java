public class automobile {
    public static void main(String[] args) {
        car c =new car("lowspecs",4);
        c.speed();
        bugati b =new bugati("highspecs",6);
        b.speed();
        }    
}
class car{
    String engine;
    int wheels;
    car(){};
    car(String engine,int wheels){
        this.engine=engine;
        this.wheels=wheels;
    }
    public void speed(){
        System.out.println("car usually runs fast with engine \t"+engine+"\tin\t"+wheels+"\twheels");
    }
}
class bugati extends car{
    String engine;
    int wheels;
    bugati(String engine,int wheels){
        super();
        this.engine=engine;
        this.wheels=wheels;
    }
    @Override
    public void speed(){
        System.out.println("fastest\t"+engine+"\tin\t"+wheels+"\twheels");
    }
   


   
}
