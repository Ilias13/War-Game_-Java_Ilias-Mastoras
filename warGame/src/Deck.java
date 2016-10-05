/**
 * This class creates a Deck of any type of Card
 * @author Ilias Mastoras
 *
 */
public class Deck {   
	int SIZE = 52;
	public Card [] myDeck = new Card [SIZE];
	Card card;
    
	/**
	 * Constructor that accepts the user's card type choice  
	 * @param choice The user's choice of card type
	 */
	public Deck (String choice) {
	  createDeck(choice);
	}
	
	/**
	 * Method that gets the card type choice and creates the Deck 
	 * @param choice The user's choice of card type
	 */
    public void createDeck (String choice) {  
	  int count = 0;
	  
	  /*
	   * The nested loop runs through the CardValues and CardSuit
	   * values. Depending on the choice, a new card from the specified 
	   * card type is initialized and stored in the Card array.
	   */
      for ( CardSuits i : CardSuits.values() ) { 
    	  for( CardValues j : CardValues.values() ){ 
	    	 
	    	  if( choice.equals("war")) {
	    	     card = new Card(i,j);
	    	  } else {
	    		  card = new PeaceCard(i,j);
	    	  }
		    myDeck[count] = card;
		    count++; 
		 }
      }
   }
   
    /**
     * Selects a random card from the Card array.
     * Then, the value in the position of this random card is set to null.
     * The null positions of the array can't be selected.
     * @return A random card. 
     */
   public Card draw(){
	 int num;
	 Card temp; // Temporary Card that will store the random selected Card
	 
	 do {
	     num = (int) ( Math.random() * 52 );
	 } while ( myDeck[num] == null );
	
	 temp = myDeck[num]; 
	 myDeck[num] = null;
	
	 return temp;	
   }

}