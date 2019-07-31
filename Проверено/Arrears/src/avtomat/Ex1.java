package avtomat;

public class Ex1 {
    public static void main(String[] args) {
        String str="1111111";
        String str1="110111";
        Proverka(str);
        Proverka(str1);
    }

    public static void Proverka(String str){
        int state=0;
        for(int i = 0; i < str.length() && state < 2; i++){
            switch (state){
                case 0:
                    if(str.charAt(i) == '1') state++;
                    break;
                case 1:
                    if(str.charAt(i) == '0') state++;
                    break;
            }
        }
        if (state == 2) System.out.println("ok");
        else System.out.println("no");
    }
}
