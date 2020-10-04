import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    System.out.println ("Does the animal have feathers?");
    String featherAnswer = input.nextLine();
    if(featherAnswer.equals("yes")){
      
      System.out.println("Does the animal swim?");
      String animalSwim = input.nextLine();
      if(animalSwim.equals("yes")){
        System.out.println("This is a duck.");
      }
      else if(animalSwim.equals("no")){
        System.out.println("This is a hen.");
      }
       else if(featherAnswer.equals("no")){
        System.out.println("Does the animal have legs?");
        String animalLegs = input.nextLine();
        if(animalLegs.equals("yes")){
          System.out.println("This is a lizard.");
        }
        else if(animalLegs.equals("no")){
          System.out.println("This is a snake.");
        }
      }
    }
  }
}
