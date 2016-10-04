
public class PeaceCard extends Card{
	
	public PeaceCard(){
		
	}
	
	public PeaceCard(CardSuits suit, CardValues value) {
		super(suit,value);
	}
	
	
	public boolean winner(Card checkCard) { 
        boolean result = false;
        int valueWinner, suitWinner;
   
        valueWinner = this.getCardValue().compareTo(checkCard.getCardValue());
   
        if(valueWinner < 0) {
	        result = true;
        }
   
        if(valueWinner > 0) {
	        result = false;
        }
   
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
