import java.util.Scanner;

class product
{
    void inputofproducts()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter name of Product");
       String name = sc.next();
       System.out.println("enter quantity of Product");
       int quantity = sc.nextInt();
       System.out.println("enter price of product");
       int price = sc.nextInt() ;
       String abx = (name+quantity+price);
       System.out.println("Entered Product is:"+name);
       System.out.println("Entered Quantity is:"+quantity);
       System.out.println("Entered Price is:"+price);


   }

}
class mainmethod extends product
{
    public static void main(String[] args)
    {
        mainmethod p = new mainmethod();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Products");
        int n = sc.nextInt();
        for (int i=0;i<n;i++)
        {
            p.inputofproducts();
        }
        for (int i=0;i<n;i++)
        {
            System.out.println(p.inputofproducts());
        }


    }
}
