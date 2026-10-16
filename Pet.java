import java.util.Scanner;  // Import the Scanner class
//Theerun Kaliappan
//(10/15/26)
//Selects what animal someone would have as a pet based on their favourite
//color, season, and name
class Main {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter your favourite color(red, green, or blue)");
    String favouriteColor = myScanner.nextLine();
    System.out.println("Enter your favourite season (winter, spring, summer, fall)");
    String favouriteSeason = myScanner.nextline();
    System.out.println("Enter your name");
    String personsName = myScanner.nextLine();  // Read user input
    System.out.println("Name is: " + personsName);  // Output user input
    
    if (favouriteColor.isEmpty() || favouriteSeason.isEmpty || personsName.isEmpty()) {
    returnRespose = "Enter your responses";
    System.out.println (returnRespone);
    }
    else if ("abcdefghijklmnopqrstuvwxyz".indexOf(pass.substring(i, i + 1).toLowerCase()) >= 0) && (favouriteColor.toLowerCase.equals("red") || favouriteColor.toLowerCase.equals("green") || favouriteColor.toLowerCase.equals("blue") || favouriteSeason.toLowerCase.equals("winter") || favouriteSeason.toLowerCase.equals("spring") || favouriteSeason.toLowerCase.equals("summer") || favouriteSeason.toLowerCase.equals("fall"))++; {
                //this is a letter
    }
    if (favouriteColor.toLowerCase().equals("blue") && favouriteSeason.toLowerCase.equals("fall")) {
    pet = "alligator";
  }
    if (favouriteColor.toLowerCase().equals("blue") && favouriteSeason.toLowerCase.equals("spring")) {
    pet = "osterich";
  }
    if (favouriteColor.toLowerCase().equals("green") && (!name.toLowerCase.startsWith("a") && !name.toLowerCase.startsWith("e") && !name.toLowerCase.startsWith("o") && !name.toLowerCase.startsWith("u") && favouriteSeason.toLowerCase.equals("winter"))) {
  pet = "giraffe";
    }
    if (!favouriteSeason.toLowerCase().equals("fall") && !pet.equals("giraffes")) {
  pet = "dog";
    }
    if (favouriteColor.toLowerCase().equals("red") && personsName.toLowerCase().startsWith("a") || name.toLowerCase.startsWith("e") || name.toLowerCase.startsWith("o") || name.toLowerCase.startsWith("u")) {
  pet = "porcupine";
    }
    else {
  pet = "panda";
    }
    if (favouriteSeason.toLowerCase().equals("summer") && !pet.equals("dog") && !pet.equals("panda") && !pet.equals("porcupine")) {
  pet = "pony";
    }
    if (!favouriteSeason.toLowerCase().equals("summer") && !favouriteSeason.toLowerCase().equals("fall") && !name.toLowerCase().startsWith("a") && !name.toLowerCase.startsWith("e") && !name.toLowerCase.startsWith("o") && !name.toLowerCase.startsWith("u")) {
  pet = "axolotl";    
    }
  }
}