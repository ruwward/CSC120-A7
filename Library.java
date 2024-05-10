/* This is a stub for the Library class */
import java.util.Hashtable;

public class Library extends Building{

  private Hashtable<String, Boolean> collection;

  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    collection = new Hashtable<String, Boolean>();
    System.out.println("You have built a library: 📖");
  }
  
  public void addTitle(String title){ // append title to collection
    collection.put(title, true);
  }

  public String removeTitle(String title){ // return the title that we removed
    collection.remove(title);
    return title;
  }

  public void checkOut(String title){ // changes boolean linked to title in collection to false
    collection.replace(title, false);
  }

  public void returnBook(String title){ // changes boolean linked to title in collection to true
    collection.replace(title, true);
  }

  public boolean containsTitle(String title){ // returns true if the title appears as a key in the Libary's collection, false otherwise
    return collection.containsKey(title);
  }
  
  public boolean isAvailable(String title){ // returns true if the title is currently available, false otherwise
   return collection.get(title);
  }

  public void printCollection(){ // prints out the entire collection in an easy-to-read way (including checkout status)
    System.out.println(collection.toString());
  }

  public void showOptions() {
    super.showOptions();
    System.out.println(" + addTitle(title) \n + removeTitle(title) \n + checkOut(title) \n + returnBook(title)\n + containsTitle(title)\n + isAvailable(title)\n + printCollection()");
  }

  public void goToFloor(int n){
    super.goToFloor(n);
  }

  public static void main(String[] args) {
    Library library = new Library("Northampton Public Library", "522 Main St", 4);
    library.addTitle("One Fish Two Fish");
    library.printCollection();
    library.showOptions();
  }
  
}