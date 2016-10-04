public class Card {
  
	private CardValues cardValue;
    private CardSuits cardSuit;

    public Card(){
    
    }
    public Card(  CardSuits suit, CardValues value ) {
        cardSuit = suit;
	    cardValue = value;
    }

    public CardValues getCardValue() {
	    return cardValue;
    }

    public CardSuits getCardSuit(){
	    return cardSuit;
    }

    public boolean winner(Card checkCard) { 
        boolean result = false;
        int valueWinner, suitWinner;
   
        valueWinner = this.getCardValue().compareTo(checkCard.getCardValue());
   
        if(valueWinner > 0) {
	        result = true;
        }
   
        if(valueWinner < 0) {
	        result = false;
        }
   
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