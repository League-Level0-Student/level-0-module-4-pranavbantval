import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String n = JOptionPane.showInputDialog("What test score did you get?");
	int x = Integer.parseInt(n);
	if(x>=90) {
		JOptionPane.showMessageDialog(null, "Great job!");
	}
	else if (x>=80&&x<90) {
		JOptionPane.showMessageDialog(null, "Good job!");
	}
	else if (x>=70&&x<80) {
		JOptionPane.showMessageDialog(null, "You passed nice job.");
	}
	else {
		JOptionPane.showMessageDialog(null, "Better luck next time.");
	}
}
}
