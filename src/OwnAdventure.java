import javax.swing.JOptionPane;

public class OwnAdventure {
public static void main(String[] args) {
	Object[] b = {"the park", "the pool"};
	Object[] c = {"cook", "play video games"};
	int a =	JOptionPane.showConfirmDialog(null, "You just woke up. Do you want to go for a walk?", "", JOptionPane.YES_NO_OPTION);
if (a==0) {
	int bInt = JOptionPane.showOptionDialog(null, "Where do you want to go?", " ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, b, b[0]);
}
else if(a==1) {
	JOptionPane.showOptionDialog(null, "What indoor activity do you want to do?", " ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, c, c[0]);	
}

}
}
