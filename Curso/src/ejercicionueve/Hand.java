package ejercicionueve;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Hand {
	Card1 [] cart = new Card1[5];
	int cant = 0;
	
	public void agregarCarta(Card1 cartas) {
		
		cart[cant] = cartas;
		cant++;
		
	}
	public void mostrarMazo () {
		for ( int i = 0; i<cant; i++) {
			System.out.print(cart[i] + "  / ");
					}
	}
	

}
