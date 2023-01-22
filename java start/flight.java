import java.util.Scanner;

public class flight {
    public static void main( String[] args) {
        driver d = new driver();
        d.setBusinessPrice(3000);
        d.setEconomyPrice(1500);
        System.out.println("enter the class you want: ");
        Scanner sc = new Scanner(System.in);
        String get =sc.nextLine();
        System.out.println("how many persons are travelling ");
        int count =sc.nextInt();
        int eco;
        int bus;
        if(get.equals("economyclass")||get.equals("E")){
            eco=d.getEconomyPrice();
            System.out.println("the total  price for economy class is "+ eco*count);

        }
        else if(get.equals("businessclass")||get.equals("B")){
            bus= d.getBusinessPrice();
            System.out.println("the total price for business class is "+ bus*count);
        }
        else{
            System.out.println("wrong class");
        }
                
        sc.close();
    }
    
}

class driver{
    int economyPrice;
    int businessPrice;
    public void setEconomyPrice(int economyPrice)
    {
        this.economyPrice = economyPrice;
    }

    public void setBusinessPrice(int businessPrice)
    {
        this.businessPrice = businessPrice;
    }
    public int getEconomyPrice(){
        return this.economyPrice;
    }
    public int getBusinessPrice(){
        return this.businessPrice;

    }
}