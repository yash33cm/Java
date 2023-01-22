public class abstraction {
    public static void main(String[] args) {
    mobile mi =new redmi();
        mi.charge();
        mi.display();
        
        
    }
    
}
abstract class mobile{
    void display(){System.out.println("display vera lvl thakid thakida");};
    abstract void charge();

}

class redmi extends mobile{
    void charge(){
        System.out.println("super fast charge redmi phones");
    }
    @Override
    void display(){
        System.out.println("display little bit thagida thagida");
    }
    void print(){
        System.out.println("hey mam i m doing abstractipon ");
    }
}
