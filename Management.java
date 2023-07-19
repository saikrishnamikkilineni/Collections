import java.util.*;


public class Management {



  Scanner sc= new Scanner(System.in);
Map<String, Pj> hm = new HashMap<>();

Pj p=new Pj();

// Add method
  public void add() {
  System.out.println("Enter the product name :");
  String product=sc.next();
  System.out.println("Enter the price :");
  int price =sc.nextInt(); 
  System.out.println("enter the quantity :");
  int quantity=sc.nextInt(); 

  
  p.setprice(price);
  p.setqnty(quantity);
  hm.put(product,p);
  
System.out.println("Display the product details :"+hm);
  }

  //Delete method 

  public void delete() {
  System.out.println("Enter the product name to remove :");
  String name=sc.next();
  if(hm.containsKey(name)) {

    hm.remove(name);
    System.out.println("Deleted :"+hm);
  }
  }

  
  //Update method 
  public void update() {
  System.out.println("Enter the name to update :");
  String person=sc.next();
  if(hm.containsKey(person)) {
   System.out.println("enter quantity value :");
    int quantity =sc.nextInt();
    Pj p=hm.get(person);
    p.setqnty(quantity);
    hm.replace(person,p);
    System.out.println("Update methods :"+hm);
  }
  else  
  {
    System.out.println("Not Updated :"+hm);
  }

  }

  
// Availbility of product
  public void avail() {
  Iterator<String> itr=hm.keySet().iterator();
  while(itr.hasNext()){
    String name1=itr.next();
    Pj obj=hm.get(name1);
    if(obj.getqnty()>0)
    {
      System.out.println("The product "+name1+" is available");
    }
  
  else 
  {
    System.out.println("The product  is not available ");
  }
  
  }
  }


public void viewOptions() {

  int option=0;
  while(option!=5){
  System.out.println("Welcome to Product application");
  System.out.println("1.Add product details");
    System.out.println("2.Delete product details");
    System.out.println("3.update product details");
    System.out.println("4.Availbility of product");
    System.out.println("5.Exit");
    option=sc.nextInt();
    if(option==1) {
      add();
    }

    else if(option==2) {
      delete();
    }
    else if(option==3) {
      update();
    }
    else if(option==4) {
      avail();
    }
     }
}








public static void main(String args[]) {
  Management obj=new Management();
  obj.viewOptions();
}
}