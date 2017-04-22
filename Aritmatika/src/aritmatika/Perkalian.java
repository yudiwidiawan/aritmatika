/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmatika;

/**
 *
 * @author makan
 */
public class Perkalian extends Number implements Operations{

    @Override
    public float operate(int x, int y) {
        return x*y;
    }

    @Override
    public void display() {
        System.out.println("Contoh perkalian 5x5 : " + operate(5,5));
    }
    
}
