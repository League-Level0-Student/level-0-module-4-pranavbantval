//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
      
        /*
         * Ask the user for these values using
         * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         */
 int x = JOptionPane.showConfirmDialog(null, "Is it a weekday?","",JOptionPane.YES_NO_OPTION);  
if(x==0) {
	isWeekday = true;
	
}
else {
	isWeekday = false;
}
if(isWeekday) {
	

int y = JOptionPane.showConfirmDialog(null, "Is it a vacation?", "",JOptionPane.YES_NO_OPTION);
if(y==0) {
isVacation = true;
}
else {isVacation=false;}
if(isVacation) {
	 JOptionPane.showMessageDialog(null, "Sleep in");
}

else {
	 JOptionPane.showMessageDialog(null, "Get up lazy bones");
}
   }
    
else{
	JOptionPane.showMessageDialog(null, "Sleep in");
}}}
	/*

          Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
          print “get up lazybones!” If it is a weekday, and we are on vacation,
          print “sleep in”.
         */
 
