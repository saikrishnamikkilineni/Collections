import java.util.HashMap;
import java.util.Map;

public class Address {

  public static void main(String args[]) {

    Map<String, Long> hm = new HashMap<>();

    // Add method
    hm.put("sai", 2177619658L);
    hm.put("viswa", 4178765789L);
    hm.put("arvind", 7898765678L);
    hm.put("keerthi", 6578765348L);
    hm.put("srihitha", 1234567876L);

    System.out.println("Display the Add methods :" + hm);

    // Delete Method
    hm.remove("viswa");
    System.out.println(" Deleted and remaining will display :" + hm);

    // Update Methdod
    Long num = 2177619658L;
    if (hm.containsKey("sai")) {

      hm.replace("sai", 4208765679L);
      System.out.println("Updated :" + hm);
    }

    else {
      System.out.println("Not Updated :" + hm);
    }

    // Search for a contact by name

    String name = "keerthi";
    if (hm.containsKey(name)) {

      System.out.println("Contact found :" + name + "-" + hm.get(name));

    } else {
      System.out.println("Contact Not Found");
    }

  }
}