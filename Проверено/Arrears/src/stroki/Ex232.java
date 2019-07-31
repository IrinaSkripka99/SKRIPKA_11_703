package stroki;

public class Ex232 {
    public static void main(String[] args) {
        String str = "12312";
        String str1 = " ";
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    k++;
                }
            }
            if (k < 1){
                str1 += str.charAt(i);
            }
            else k=0;
        }
        System.out.print(str1);
    }
}
