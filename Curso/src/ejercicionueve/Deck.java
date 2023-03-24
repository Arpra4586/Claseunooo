package ejercicionueve;

import java.util.Scanner;


public class Deck {
    Card1[] cardArray = new Card1[52];
    int  contar= 0;


Deck(){ //constructor
 int suits = 4;
 int cardType = 13;
 int cardCount = 0;
 for(int i = 1; i <= suits; i++)
 for(int j = 1; j <= cardType; j++){
        cardArray[cardCount] = new Card1(i,j);
     cardCount++;
      }
 }
public void print(){
for(int i = 0; i < cardArray.length; i++)
	
    System.out.println(cardArray[i]);
   }


public void mezclar() {
	
	
	Card1 cartica = new  Card1 (0 , 0);
	for ( int i = 0 ; i <52; i++) {
		int t = (int)(Math.random()*10+1);
		int num= t;
		cartica =cardArray[i];
		cardArray[i]=cardArray[num];
		cardArray[num]= cartica;
		
	}
}
	
	public Hand repartir () {
		
		
		Hand mano = new Hand();
		mano.agregarCarta(cardArray [contar]);
		contar++;
		mano.agregarCarta(cardArray[contar]);
		contar++;
		
		return mano;
		
		
	}
	

  }
