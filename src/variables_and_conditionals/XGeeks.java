package variables_and_conditionals;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

        // 1. Save the superpower for each person in a variable.
             String Hudaifa= "Turn into A duck";
             String  Kyren="Invisibility";
             String Deen="Flight";
             String Matin="Time Travel";
             String Dexter="Size Control";
             String Dave="Super Strength";
             String Matt="Breathe under water";
             String Jah="Ice Control";
             String Mike="Hiking 20 Miles In One Minute";
             String  DatBoi="DatBoi uses Memes 4 life,On you its Effective";
             // 2. Ask the user to enter a name. Store their answer in a variable.
                 String answer=JOptionPane.showInputDialog("Enter the person whose power you want to see");
                   
        // 3. Show the superpower in a pop-up, depending on the name entered. 
              if(answer.equals("Matin")){
            	  JOptionPane.showMessageDialog(null, Matin);
              }
              else if(answer.equals("Hudaifa")){
            		  JOptionPane.showMessageDialog(null, Hudaifa); 
            		 
            	  }
            	  
              else if(answer.equals("Kyren")){
            		  JOptionPane.showMessageDialog(null, Kyren); 
            		 
            	  }
              else  if(answer.equals("Dave")){
            		  JOptionPane.showMessageDialog(null, Dave); 
            		 
            	  }
              else  if(answer.equals("Matt")){
            		  JOptionPane.showMessageDialog(null, Matt); 
            		 
            	  }
            	  
              else  if(answer.equals("Dexter")){
            		  JOptionPane.showMessageDialog(null, Dexter); 
            		 
            	  }
              else  if(answer.equals("Deen")){
            		  JOptionPane.showMessageDialog(null, Deen); 
            		 
            	  }
            		
              else  if(answer.equals("Jah")){
            		  JOptionPane.showMessageDialog(null, Jah); 
            		  
            	  }
              else  if(answer.equals("Mike")){
            		  JOptionPane.showMessageDialog(null, Mike); 
            	  }
              else  if(answer.equals("DatBoi")){
        		  JOptionPane.showMessageDialog(null,DatBoi ); 
              }
              
              else{
            	  JOptionPane.showMessageDialog(null, "No Power M8");
              
             }
              
        		  
              
}
}



