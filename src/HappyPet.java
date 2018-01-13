//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



import javax.swing.JOptionPane;

public class HappyPet {
	static // 2. Create a happinessLevel variable to store the pet's happiness number.
	//    Initialize to zero.
int happyLevel = 0;
	static String  pet;
	public static void main(String[] args) {
		Object[] c = {"cuddle it"," feed it","give it water","take a walk with it", "groom it"  };
		// 1. Ask the user what kind of pet they want to buy, and store in variable
  pet = JOptionPane.showInputDialog("What kind of pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
	for (int i = 0; i < 5; i++) {
		
	
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (Egg: cuddle, food, water, take a walk, groom, clean up pop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", " ",
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,c,c[0]);

			// 5. Use user input to call the appropriate method created in step 4.
if(task==0) {
	pet();
}
else if(task==1) {
	food();
}
else if(task==2) {
	water();
}
else if(task==3) {
	walk();
}
else if(task==4) {
	groom();
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if(happyLevel==5) {
	JOptionPane.showMessageDialog(null, "You really love your pet!");
	break;
}}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (egg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	 static void pet() {
		JOptionPane.showMessageDialog(null, "Your "+ pet +" is happy!");
		happyLevel++;
	}
	static void food() {
		JOptionPane.showMessageDialog(null, "Your "+pet+" is no longer starving!");
		happyLevel++;
	}
	static void water() {
		JOptionPane.showMessageDialog(null, "Your "+pet+" is no longer dehydrated!");
		happyLevel++;
	}
	static void walk() {
		JOptionPane.showMessageDialog(null, "Your "+pet+" has got its daily exercise!");
		happyLevel++;
	}
	static void groom() {
		JOptionPane.showMessageDialog(null, "Your "+pet+" is looking fancy!");
		happyLevel++;
	}
}