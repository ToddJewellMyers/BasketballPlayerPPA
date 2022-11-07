// Todd J Myers
// 5/19/20
// CIS1181
// Practice problem 2 comparable basketball player ppa 
package practiceProblem2;

import java.util.ArrayList;
import java.util.Collections;

public class Driver 
{

public static void main(String[] args) 
{

//creating the objects within basketballplayer class 

BasketballPlayer player1=new BasketballPlayer("jay", "smith", 12.7);

BasketballPlayer player2= new BasketballPlayer("DeShaun", "smith", 12.8);

BasketballPlayer player3=new BasketballPlayer("DeShaun", "Taylor", 18.1);

// arraylist BasketballPlayer

ArrayList<BasketballPlayer> player=new ArrayList<BasketballPlayer>();

//putting player objects within arraylist

player.add(player1);

player.add(player2);

player.add(player3);

//Print the arraylist basketballplayer

System.out.println(player);

//Sort out the arrayList basketballplayer
Collections.sort(player);

// print out the sorted arraylist
System.out.println(player);

}

}
