import javax.swing.JOptionPane;

public class SimpleSorter {
public static void main(String[] args) {
	String num1 = JOptionPane.showInputDialog("Pick one number");
	String num2 = JOptionPane.showInputDialog("Pick another number");
	String num3 = JOptionPane.showInputDialog("Pick a third number");

int x =	Integer.parseInt(num1);
int y =	Integer.parseInt(num2);
int z =	Integer.parseInt(num3);

	if(x>y&&x>z) {
		System.out.print(x + " ");
		if(y>z) {
			System.out.print(y + " ");
			System.out.print(z + " ");
		}
		else if(z>y) {
			System.out.print(z + " ");
			System.out.print(y + " ");
		}
	}
	else if(y>x&&y>z) {
		System.out.print(y + " ");
		if(x>z) {
			System.out.print(x + " ");
			System.out.print(z + " ");
		}
		else if(z>x) {
			System.out.print(z + " ");
			System.out.print(x + " ");
		}
	}
	else if(z>y&&z>x) {
		System.out.print(z + " ");
		if(x>y) {
			System.out.print(x + " ");
			System.out.print(y + " ");}
			else	 if(y>x){
				 System.out.print(y + " ");
				 System.out.print(x + " ");
			}
	}


//backwards
if(x<y&&x<z) {
	System.out.print(x + " ");
	if(y<z) {
		System.out.print(y + " ");
		System.out.print(z + " ");
	}
	else if(z<y) {
		System.out.print(z + " ");
		System.out.print(y + " ");
	}
}
else if(y<x&&y<z) {
	System.out.print(y + " ");
	if(x<z) {
		System.out.print(x + " ");
		System.out.print(z + " ");
	}
	else if(z<x) {
		System.out.print(z + " ");
		System.out.print(x + " ");
	}
}
else if(z<y&&z<x) {
	System.out.print(z + " ");
	if(x<y) {
		System.out.print(x + " ");
		System.out.print(y + " ");}
		else	 if(y<x){
			 System.out.print(y + " ");
			 System.out.print(x + " ");
		}
}
}
}



