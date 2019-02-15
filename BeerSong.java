/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersong;

/**
 *
 * @author vorce
 */
public class BeerSong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    public static void Ninety_Nine_Bottles_of_Beer() {
        int bottles=99;
        int nb;
        while (bottles>1){
            nb= bottles -1;       
            System.out.println(bottles+ " bottles of beer on the wall," + bottles +" bottles of beer");
            System.out.println("take one down pass it around,"+ nb + " bottles of beer on the wall");
            bottles--;
        } 
        bottles =1;
        System.out.println(bottles+ " bottle of beer on the wall," + bottles +" bottle of beer");
        System.out.println("take one down pass it around,no more bottles of beer on the wall");                      
    }
}
