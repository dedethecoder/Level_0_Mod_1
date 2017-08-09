package variables_and_conditionals;

import javax.swing.JOptionPane;

public class Testscore {
	public static void main(String[] args) {
		String answer=JOptionPane.showInputDialog("Enter your testscore");
		double score=Double.parseDouble(answer);
		
	if(score<=100&& score>=97) {
			System.out.println("A+");
		}
	else if(score<=96.9&& score>=93) {
		System.out.println("A");
	}
	else if(score<=92.9&& score>=90) {
		System.out.println("A-");
	}
	else if(score<=89.9&& score>=87) {
		System.out.println("B+");
	}
	else if(score<=86.9&& score>=83) {
		System.out.println("B");
	}
	else if(score<=82.9&& score>=80) {
		System.out.println(" B-");
	}
	else if(score<=79.9&& score>=77) {
		System.out.println("C+");
	}
	else if(score<=76.9&& score>=73) {
		System.out.println("C");
	}
	else if(score<=72.9&& score>=70) {
		System.out.println("C-");
	}
	else if(score<=69.9&& score>=67) {
		System.out.println("D+");
	}
	else if(score<=66.9&& score>=63) {
		System.out.println("D");
	}
	else if(score<=62.9&& score>=60) {
		System.out.println("D-");
	}
	else if(score<=59.9&& score>=0) {
		System.out.println("F");
	}
	else if(score<=106.9&& score>=101) {
		System.out.println("A+ plus a +");
	}
	else if(score<=110&& score>=106.9) {
		System.out.println("A+ plus a + ++");
	}
	else if(score<=114&& score>=110) {
		System.out.println("Is You Even Human");
	
	}
	else {
		System.out.println("Bruh You Know I Can't Do That");
	}
		
	}
	}
	

