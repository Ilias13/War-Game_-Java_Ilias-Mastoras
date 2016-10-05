import java.util.Scanner;
/**
 * This main class executes the War or Peace game.
 * @author Ilias Mastoras
 */
public class MainDriver {
    public static void main(String [] args) {
   	
     //the user selects the type of game who wants to play.
     String choice = gameChoice(); 
	 
     /* declaration of two Card and two Deck 
      * for the two players.
      */
	 Card p1 = new Card();
     Card p2 = new Card();
     Deck playerONEdeck ;
     Deck playerTWOdeck;
	
       /* The choice will start the specified game and will 
        * initialize the Deck with the appropriate card type.
        */
		 if( choice.equals("2")) {
			 System.out.println("\nLet's play PEACE!\n");
	         playerONEdeck = new Deck("peace");
	         playerTWOdeck = new Deck("peace");
	     } else {
	    	 System.out.println("\nLet's play WAR!\n");
		     playerONEdeck = new Deck("war");
	         playerTWOdeck = new Deck("war");	
	     }
	
	 boolean win = false;
	 // variables that hold the tie and the winning matches for each player.
	 int count = 0, p1Counter = 0, p2Counter = 0, tieCounter = 0;
	
	 do{
		// selects a random card for each player.
		p1 = playerONEdeck.draw();
	    p2 = playerTWOdeck.draw(); 
	
	    System.out.println(p1);
	    System.out.println(p2);
	    /*
	     * The comparison of the two cards starts.
	     * Depending on the card type, the appropriate
	     * winner method is called.
	     */
	      if (p1.equals(p2)) {
		    tieCounter++;
	      } else {
	     	   win = p1.winner(p2);
	
	           if (win == true) {
	             p1Counter++;	
	             System.out.println("\tPlayer 1 wins this round\n");
	           } else {
		         p2Counter++;
	             System.out.println("\tPlayer 2 wins this round\n");
	           }
	           count++;
	      }
	  } while (count != 52 );	 
	 
	 // The final result is printed.
	 if ( p1Counter > p2Counter ) {
		 System.out.println("\nPlayer 1 is the WINNER!!!   with score "
	                         +p1Counter +" - " +p2Counter
	                         +"  | number of ties: " +tieCounter);
	 }	 
	 if ( p2Counter > p1Counter ) {
		 System.out.println("\nPlayer 2 is the WINNER!!!   with score "
	                         +p2Counter +" - " +p1Counter
	                         +"  | number of ties: " +tieCounter); 
	 }
	 
	 if (p2Counter == p1Counter ) {
		 System.out.println("\nWe have a TIE.  score "+p2Counter +" - " +p1Counter); 
	 }
			 	 
 }
 
    /**
     * This method gets input from the user, the type
     * of game he/she wishes to play.
     * @return The user's choice of game.
     */
 public static String gameChoice(){
	 Scanner in = new Scanner (System.in);
	 String choice;
	
	   do{
		  System.out.print("Select 1 for WAR or 2 for PEACE : ");
	      choice =in.nextLine();
	   } while ( ( !choice.equals("1") ) && ( !choice.equals("2") ) ) ;
	
	 in.close();
	 return choice;	 
 }
    
}
