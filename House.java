/* This is a stub for the House class */
import java.util.ArrayList;
public class House extends Building {

  private ArrayList<String> residents;
  private boolean hasDiningRoom;
  private boolean hasElevator;
  
  /**
* creates a new house
* @param hadDiningRoom t/f
*/
  public House(String name, String address, int nFloors, Boolean hasDiningRoom, Boolean hasElevator) {
    super(name, address, nFloors);
    residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  /**
* returns true/false if it has dining room
* @return t/f
*/
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }

  /**
* returns number of residents
* @return int of size of arraylist
*/
  public int nResidents() {
    return residents.size();
  }

  /**
* adds person to residents arraylist
* @param name of person
*/
  public void moveIn(String name){
    residents.add(name);
  }

  /**
* return the name of the person who moved out
* @param name of person
* @return name of person
*/
  public String moveOut(String name){
    residents.remove(name);
    return name;
  }

  /**
* resturns t/f if person lives in the house
* @param person
* @return t/f do they live there
*/
  public boolean isResident(String person){
    return residents.contains(person);
  }

  public void showOptions() {
    super.showOptions();
    System.out.println(" + hadDiningRoom() \n + nResidents() \n + moveIn(name) \n + moveOut(name)\n + isResident(name)");
  }

  public void goToFloor(int n){
    if (n - this.activeFloor > 1 || n - this.activeFloor < -1){ // if going up/down multiple flights
      if (hasElevator){
        super.goToFloor(n);
      }
      else {
        System.out.println("You cannot go up or down multiple floors, there is no elevator!");
      }
    }
    else {
      super.goToFloor(n);
    }
  }

  /**
* main, runs house method
* @param args
*/
  public static void main(String[] args) {
    House myHouse = new House("My House", "425 Main St", 3, true, false);
    myHouse.moveIn("Me!");
    System.out.println(myHouse.nResidents());
    myHouse.showOptions();
  }

}