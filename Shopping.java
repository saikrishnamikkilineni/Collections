import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

class Shopping {
  Scanner sc=new Scanner(System.in);

   ArrayList<Cart> al= new ArrayList<Cart>();
  int num=0;


//Add Method
  
public void add() {

  System.out.println("Enter the customer name :");
  String name=sc.next();
  System.out.println("Enter the pen price :");
  int Pen=sc.nextInt();
  System.out.println("Enter the Book price :");
  int Book=sc.nextInt();
  System.out.println("Enter the Bottle price :");
  int Bottle=sc.nextInt();

  //create a new cart object
  Cart  cart = new Cart();
  cart.setCustomer_name(name);
  cart.setI_Pen(Pen);
  cart.setI_Book(Book);
  cart.setI_Bottle(Bottle);

  //add the cart objects to arraylist
  al.add(num,cart);
  num++;

  System.out.println("Customer name :"+cart.getCustomer_name());
  System.out.println("Pen Price:"+cart.getI_Pen());
  System.out.println("Book Price :"+cart.getI_Book());
  System.out.println("Bottle Price :"+cart.getI_Bottle());
  System.out.println("Number of items :"+num);

}

//Delete method
public void delete() {
System.out.println("Enter the customer name : ");
 String customer=sc.next();
  ListIterator<Cart> iterator = al.listIterator();
  while(iterator.hasNext()){
    Cart cart=iterator.next();
    if(customer.equals(cart.getCustomer_name())) {

      iterator.remove();
      num--;
      break;
    }
  }
}


  //display all items
public void display() {
for(Cart cart: al) {

  System.out.println("Customer name :"+cart.getCustomer_name());
  System.out.println("pen price :"+cart.getI_Pen());
  System.out.println("Book price :"+cart.getI_Book());
  System.out.println("Bottle price :"+cart.getI_Bottle());
  System.out.println("Number of customers :"+num);
}
  
}


public void total() {
System.out.println("Enter the person name to calculate the cart :");
String  person=sc.next();
  ListIterator<Cart> iterator = al.listIterator();
  while(iterator.hasNext()) {

    Cart cart=iterator.next();
    if(person.equals(cart.getCustomer_name())) {

      int Item1=cart.getI_Pen();
      int Item2=cart.getI_Book();
      int   Item3=cart.getI_Bottle(); 

      int total=Item1+Item2+Item3;
      System.out.println(person + " cart total price is :"+total);      
      
    }
      }


  
}


  
  


public void viewOptions() {

  int option=0;
  while(option!=5) {
  System.out.println("============================Welcome to Shopping Cart=============================");
    System.out.println("1.Add items in the cart");
    System.out.println("2.remove item in the cart");
    System.out.println("3.Display all items in the cart");
    System.out.println("4.calculate the total cost of items in the cart");
    System.out.println("5.Exit");
    option=sc.nextInt();
    if(option==1) {

      add();
    }

    else if(option==2) {
      delete();
    }

    else if(option==3) {

      display();
    }
    else if(option==4) {
      total();
    }
    
  }
  
}



  
  public static void main(String args[]) {
  Shopping obj= new Shopping();
    obj.viewOptions(); 
   
   
  
  } 
 
}

  
