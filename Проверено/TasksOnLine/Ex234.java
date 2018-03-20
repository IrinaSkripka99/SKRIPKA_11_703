package TasksOnLine;

import java.util.Scanner;

public class Ex234 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        Check(s1);
    }
    public static void Check(String s1){
        boolean good=true;
        for (int i = 0; i <s1.length() && good; i++) {
            if(s1.charAt(i)!='0' || s1.charAt(i)!='1'){
                good=false;
            }
        }
        if(good) System.out.println(Integer.parseInt(s1,2));
        else System.out.println("Число введено не верно");
    }
}
