public class Deck {   
	int SIZE = 52;
	public Card [] myDeck = new Card [SIZE];
	Card card;

	public Deck (String choice) {
	  createDeck(choice);
	}
	
    public void createDeck (String choice) {  
	  int count = 0;
	  
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
	   
   public Card draw(){
	 int num;
	 Card temp;
	 do {
	     num = (int) ( Math.random() * 52 );
	 } while ( myDeck[num] == null );
	
	 temp = myDeck[num];
	 myDeck[num] = null;
	
	 return temp;	
   }

}