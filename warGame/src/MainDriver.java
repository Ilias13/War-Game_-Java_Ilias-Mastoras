import java.util.Scanner;
public class MainDriver {
    public static void main(String [] args) {
   	
     String choice = gameChoice();
	 
	 Card p1 = new Card();
     Card p2 = new Card();
     Deck playerONEdeck ;
     Deck playerTWOdeck;
	
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
	 int count = 0, p1Counter = 0, p2Counter = 0, tieCounter = 0;
	
	 do{
		p1 = playerONEdeck.draw();
	    p2 = playerTWOdeck.draw(); 
	
	    System.out.println(p1);
	    System.out.println(p2);
	
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
