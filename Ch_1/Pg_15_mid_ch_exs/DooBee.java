package Ch_1.Pg_15_mid_ch_exs;

// Question:-

/* 
Given the output:
% java DooBee
DooBeeDooBeeDo

Fill in the missing code:
public class DooBee {
public static void main(String[] args) {
int x = 1;
while (x < _____ ) {
System.out._________("Doo");
System.out._________("Bee");
x = x + 1;
}
if (x == ______ ) {
System.out.print("Do");
}
}
}*/

//Solution:-
public class DooBee {
    public static void main(String[] args) {
     int x=1;
     while(x<3){  //3
         System.out.print("Doo"); //print
         System.out.print("Bee"); //print
         x=x+1;
     }
     if(x==3){ //3
         System.out.print("Do");
     }
    } 
 }
 