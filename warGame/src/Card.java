/**
 * This class creates a Card object with its specific characteristics
 * @author Ilias Mastoras
 *
 */
public class Card {
  
	private CardValues cardValue; 
    private CardSuits cardSuit;
    
    /**
     * default constructor
     */
    public Card(){
   
    }
    
    /**
     * Card constructor who stores the suit and value
     * in this cardSuit and cardValue
     * @param suit The suit of this Card
     * @param value The value of this Card
     */
    public Card(  CardSuits suit, CardValues value ) {
        cardSuit = suit;
	    cardValue = value;
    }
     
    /**
     * Gives access to cardValue
     * @return this cardValue
     */
    public CardValues getCardValue() {
	    return cardValue;
    }
    
    /**
     * Gives access to cardSuit
     * @return this cardSuit
     */
    public CardSuits getCardSuit(){
	    return cardSuit;
    }

    /**
     * Compares this Card with the parameter Card
     * and returns the comparison's result
     * @param checkCard The Card object that is going to be compared with this Card
     * @return true if this Card is higher or false if this Card is lower
     */
    public boolean winner(Card checkCard) { 
        boolean result = false;
        int valueWinner, suitWinner;
        
        /* 
         * valueWinner stores the result of the value comparison.
         * Depending on the valueWinner, the if statements will
         * store the appropriate value in result variable  
        */
        valueWinner = this.getCardValue().compareTo(checkCard.getCardValue());
         
        if(valueWinner > 0) {
	        result = true;
        }
   
        if(valueWinner < 0) {
	        result = false;
        }
        
        /*
         * If the values are equal,
         * compare the suits. The result of the comparison
         * will be stored in suitWinner variable.
         * Depending on the suitWinner, the if statements will
         * store the appropriate value in result variable.   
         */
        if(valueWinner == 0) {
	        suitWinner = this.getCardSuit().compareTo(checkCard.getCardSuit());
   
            if(suitWinner > 0) {
	            result = true;
            }
            
            if(suitWinner < 0) {
	            result =  false;
            }
        }
      return result;
    }

    public String toString() {
        String cSuit="";
	    
        /*
         * A specific String name will represent
         * each cardSuit.
         */
        switch (cardSuit) {
           
           case HEART:
           cSuit = "Hearts" ;
           break;
             
           case DIAMOND:
           cSuit = "Diamonds";
           break;
                  
           case SPADE: 
           cSuit = "Spades";
           break;
       
           case CLUB:
           cSuit = "Clubs";
           break;
       }
	 
	 return cardValue +" of " +cSuit;
    }
}