import java.util.Scanner;

class product
{
    Scanner sc = new Scanner(System.in);
    int n;
    String[] name;
    String[] addname;
    int quantity[];
    int addquantity[];
    int price[];
    int addprice[];
    void numberofproducts()
    {
        System.out.println("Enter number of products");
        n = sc.nextInt();
        name=new String[n];
        addname=new String[n];
        quantity = new int[n];
        addquantity = new int[n];
        price = new int[n];
        addprice = new int[n];

    }
    void products()
   {
       for (int i=0;i<n;i++)
       {
           System.out.println("Enter name of Product");
            name[i] = sc.next();
       }
       for (int i=0;i<n;i++)
       {
           System.out.println("enter quantity for "+name[i] + ":");
            quantity[i]= sc.nextInt();
       }
       for (int i=0;i<n;i++)
       {
           System.out.println("enter price for "+name[i] + ":");
           price[i]= sc.nextInt();
       }
   }
   void output()
   {
       for (int i=0;i<n;i++)
       {
           System.out.println((i+1)+")"+"Product::"+"Quantity::"+"Price");
           System.out.println(name[i]+"::"+quantity[i]+"::"+price[i]);
       }
   }
   int choice;
    int s;
   void addproduct()
   {
       System.out.println("Do you wish to add product if yes then enter '1' else enter '0' ");
       choice = sc.nextInt();
       if(choice==1 || choice==0)
       {
           if (choice == 1) {
               System.out.println("number of products you want to increase");
               s = sc.nextInt();
               addname = new String[(n + s)+2];
               System.out.println(addname.length);
               addquantity = new int[(n + s)+2];
               addprice = new int[(n + s)+2];
               int t = n+s;
               System.arraycopy(this.name, 0, addname, 0, name.length);
               System.arraycopy(this.quantity, 0, addquantity, 0, quantity.length);
               System.arraycopy(this.price, 0, addprice, 0, price.length);
               System.out.println("enter the product");
               addname[t-1] = sc.next();
               System.out.println("enter the quantity");
               addquantity[t-1] = sc.nextInt();
               System.out.println("enter the price");
               addprice[t-1] = sc.nextInt();
           }
       }
   }
   void output3()
   {
      if(choice==1)
      {
          for (int i=0;i<n+s;i++)
          {
              System.out.println("your products with increased items are");
              System.out.println((i+1)+")"+"Product::"+"Quantity::"+"Price");
              System.out.println(addname[i]+"::"+addquantity[i]+"::"+addprice[i]);
          }
      }
   }

}

class mainmethod extends product
{
    public static void main(String[] args)
    {
        mainmethod p = new mainmethod();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Name");
        String Name = sc.next();
        System.out.println("Please Enter your Mobile no");
        long no = sc.nextLong();
        System.out.println("please enter 1 for male and 0 for female");
        int g = sc.nextInt();
        p.numberofproducts();
        p.products();
        p.output();
        p.addproduct();
        p.output3();
        if(g==1)
        {
            System.out.println("Thank you,Mr." + Name + " for shopping with us");
        }
        else
        {
            System.out.println("Thank you,Mrs." + Name + " for shopping with us");
        }
        




    }
}
