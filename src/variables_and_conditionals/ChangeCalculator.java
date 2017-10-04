package variables_and_conditionals;

/** 
I have a pocket full of change. I hate doing math. Make me a program that will calculate 
how much money I have without me having to use my brain.
*/

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

    public static void main(String[] args) {
String Question=JOptionPane.showInputDialog("How Many Nickels Do You Have");
        // Ask the user how many nickels they have
int Nickels=Integer.parseInt(Question);
        // Convert their answer to an int using Integer.parseInt()
String QUESTION=JOptionPane.showInputDialog("How Many Dimes Do You Have");
        // Ask the user how many dimes they have, and convert their answer
int Dimes=Integer.parseInt(QUESTION);
        // Ask the user how many quarters they have, and convert their answer
String QuEsTiOn=JOptionPane.showInputDialog("How Many Quarters Do You Have");
        // Calculate how much money the user has and save it in a double variable 
int Quarters=Integer.parseInt(QuEsTiOn);
        // Tell the user how much money they have
double TotalMoney=Nickels*0.05+Dimes*0.10+Quarters*0.25;
    System.out.println(TotalMoney);
   JOptionPane.showMessageDialog(null,TotalMoney);     } 
}
