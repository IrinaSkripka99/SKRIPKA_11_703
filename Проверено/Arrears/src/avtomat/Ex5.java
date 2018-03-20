package avtomat;

public class Ex5 {
    public static void main(String[] args) {
        String str = "1111111";
        String str1 = "110110";
        Proverka(str);
        Proverka(str1);
    }

    public static void Proverka(String str) {
        int state = 0;
        boolean f = true;
        for (int i = 0; i < str.length() && f; i++) {
            switch (state) {
                case 0:
                    state++;
                    break;
                case 1:
                    state++;
                    break;
                case 2:
                    if (str.charAt(i) == '0') state = 0;
                    else f = false;
                    break;
            }
        }
        if (f) System.out.println("ok");
        else System.out.println("no");
    }
}
