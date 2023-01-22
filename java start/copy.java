public class copy {
    public static void main(String[] args) {
        copycats c1 =new copycats(19, "yash");
        System.out.println("displaying first object value");
        c1.print();
        copycats c2 =c1;
        System.out.println("displaying copied object value:");
        c2.print();
        
    }
    
}
class copycats{
    String name ;
    int age;
    copycats(int age,String name){
        this.name=name;
        this.age=age;
    }
    void print(){
        System.out.println("my name is\t"+this.name+"\tand my age is\t"+this.age);
    }
}
