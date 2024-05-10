/* This is a stub for the Cafe class */
public class Cafe extends Building {

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }
    
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
        if(this.nCoffeeOunces<nCoffeeOunces){  
            restock();
        }
        else if(this.nSugarPackets<nSugarPackets){  
            restock();
        }  
        else if(this.nCreams<nCreams){  
            restock();
        }  
        else if(nCups<1){  
            restock();
        }
    }

    private void restock(){
        this.nCoffeeOunces = 300;
        this.nSugarPackets = 100;
        this.nCreams = 100;
        this.nCups = 30;
        System.out.println("restock complete!");
    }

    public void showOptions() {
        super.showOptions();
        System.out.println(" + sellCoffee(size, nSugarPackets, nCreams)");
    }

    public void goToFloor(int n){
        System.out.println("You may not leave the first floor!");
      }
    public static void main(String[] args) {
        Cafe pete = new Cafe("Pete's", "123 Main St", 2, 170, 6, 43, 27);
        pete.sellCoffee(12, 3, 0);
        pete.sellCoffee(24, 4, 2);
        pete.sellCoffee(12, 5, 2);
        pete.showOptions();
    }
    
}
