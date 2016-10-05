/**
 * This class extends Card and creates
 * a PeaceCard type object.
 * @author Ilias Mastoras
 *
 */
public class PeaceCard extends Card{
	
	/**
	 * Default constructor
	 */
	public PeaceCard(){
		
	}
	
	/**
	 * PeaceCard constructor uses the super constructor
	 * and stores the suit and value
     * in this cardSuit and cardValue. 
     * @param suit The suit of this PeaceCard
     * @param value The value of this PpeaceCard
	 */
	public PeaceCard(CardSuits suit, CardValues value) {
		super(suit,value);
	}
	
	/**
     * Compares this PeaceCard with the parameter Card
     * and returns the comparison's result.
     * @param checkCard The Card object that is going to be compared with this PeaceCard.
     *                  checkCard will be PeaceCard type.
     * @return true if this PeaceCard is lower or false if this PeaceCard is higher.
	 */
	public boolean winner(Card checkCard) { 
        boolean result = false;
        int valueWinner, suitWinner;
   
        /* 
         * valueWinner stores the result of the value comparison.
         * Depending on the valueWinner, the if statements will
         * store the appropriate value in result variable.  
        */
        valueWinner = this.getCardValue().compareTo(checkCard.getCardValue());
   
        if(valueWinner < 0) {
	        result = true;
        }
   
        if(valueWinner > 0) {
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
   
            if(suitWinner < 0) {
	            result = true;
            }
            
            if(suitWinner > 0) {
	            result =  false;
            }
        }
      return result;
    }

}
