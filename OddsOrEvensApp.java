/**
* The OddsOrEvensApp is to resolve the edx Microsoft Java Odds or Evens project
* https://courses.edx.org/courses/course-v1:Microsoft+DEV276x+2T2017
*
 */
import java.util.*;

class OddsOrEvensApp{
    public static void main(String[] args) {

        playGame();

    }

    public static void playGame(){
        Scanner input = new Scanner(System.in);

        //Greeting + Setup
        System.out.println("Let's play a game called 'Odds and Evens'");
        System.out.print("What is your name? ");
        String playerName = input.nextLine();

        String playerChar;
        do{
            System.out.print("Hi " + playerName + ", which do you choose? (O)dds or (E)vens? ");
            playerChar = input.nextLine();
        } while ((!playerChar.equals("O")) && (!playerChar.equals("E")));

        String playerSide = (playerChar.equals("E"))? "even" : "odd";
        
        if(playerSide.equals("even")){
            System.out.println(playerName + " has picked evens! The computer will be odds.");            
        } else {
            System.out.println(playerName + " has picked odds! The computer will be evens.");
        }

        System.out.println("--------------------------");

        //Play Round
        System.out.print("How many 'fingers' do you put out? ");
        int playerNumber = input.nextInt();

        Random rand         = new Random();
        int computerNumber  = rand.nextInt(6);

        System.out.println("The computer plays " +  computerNumber + " fingers");

        System.out.println("--------------------------");
        System.out.println();

        //Compute the winner and display results
        int total = ( computerNumber + playerNumber ) ;
        String totalMod     = ((total % 2 ) == 0) ? "even" : "odd";

        System.out.println( playerNumber + " + " +  computerNumber + " = " + total );
        System.out.println( total + " is ..." + totalMod );

        String winnerString = "That means ";
        if(totalMod.equals(playerSide)  ){
            winnerString = winnerString + playerName +" wins! :)";
        }else{
            winnerString = winnerString + "the computer wins! :)";                
        }

        System.out.println(winnerString);
        System.out.println("--------------------------");
        System.out.println();

        
    }



}