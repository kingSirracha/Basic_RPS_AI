import javax.sql.rowset.serial.SQLOutputImpl;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GameUI {

    private Scanner input =  new Scanner(System.in);
    private int selection = 0;



    public int aiSelection() {
        selection = 0;
        while (selection == 0) {
            System.out.println("Select your AI Opponent");
            System.out.println("[1] AI 1");
            System.out.println("[2] AI 2");

            try{
                selection = input.nextInt();
            } catch(InputMismatchException e){
                // clears out the error causing input
                System.out.println("Please input an integer");
                input.next() ;
            }

            if (selection == 0 || selection > 2 || selection < 0){
                System.out.println("Please type 1 or type 2 for your selection");
                selection = 0;
            }
        }
        return selection;
    }

    public int chooseOption(){
        selection = 0;
        while( selection == 0 ) {
            System.out.println("Select your move\n[1] Rock\n[2] Paper\n[3] Scissors");

            try{
                selection = input.nextInt();
            } catch(InputMismatchException e){
                // clears out the error causing input
                System.out.println("Please input an integer");
                input.next() ;
            }

            if (selection == 0 || selection > 3 || selection < 0){
                System.out.println("Please type 1, 2, or 3 for your selection");
                selection = 0;
            }

        }
        return selection;
    }

    public int tryAgain(){
        selection = 0;
        while( selection == 0 ) {
            System.out.println("Do you wish to play another game?\n[1] Yes\n[2] No");

            try{
                selection = input.nextInt();
            } catch(InputMismatchException e){
                // clears out the error causing input
                System.out.println("Please input an integer");
                input.next() ;
            }

            if (selection == 0 || selection > 2 || selection < 0){
                System.out.println("Please type 1, 2, or 3 for your selection");
                selection = 0;
            }

        }
        return selection;
    }

}
