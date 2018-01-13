import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		Object[] b = { "the park", "the beach" };
		Object[] c = { "cook", "play video games" };
		int bint = 0;
		int dint = 0;
		int a = JOptionPane.showConfirmDialog(null,
				"You just woke up from a late night nap. Do you want to go for a walk?", "", JOptionPane.YES_NO_OPTION);
		if (a == 0) {
			bint = JOptionPane.showOptionDialog(null, "Where do you want to go?", " ", JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, b, b[0]);dint = 2;
		} else if (a == 1) {
			dint = JOptionPane.showOptionDialog(null, "What indoor activity do you want to do?", " ",
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, c, c[0]);bint = 2;
		}

		if (bint == 0) {
			JOptionPane.showMessageDialog(null,
					"You had a great time at the park, but now you are exhausted. You decided to go to sleep.");
		} else if (bint == 1) {
			JOptionPane.showMessageDialog(null,
					"You had a great time at the beach, but now you are exhausted. You decided to go to sleep");
		}
		if (dint == 0) {
JOptionPane.showMessageDialog(null,
		"You made a great meal for dinner, but you are exhausted. You decided to go to sleep");
		}
		else if(dint==1) {
			JOptionPane.showMessageDialog(null,
					"You had a great time playing video games, but you are exhausted. You decided to go to sleep");
		}
	}
}
