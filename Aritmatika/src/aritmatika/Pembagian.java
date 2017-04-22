/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmatika;

/**
 *
 * @author Falah
 */
public class Pembagian extends Number implements Operations {
  
    @Override
	public float operate(int x, int y){
		return x/y;
	}

	@Override
	public void display(){
		this.x=3;
		this.y=2;
		System.out.println("Contoh pertambahan 3/2 :" + operate(x,y));
	}
}
