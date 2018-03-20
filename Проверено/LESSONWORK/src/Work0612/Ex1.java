package Work0612;

public class Ex1 {
    public static void main(String[] args) {
        String str="бээ!";
        char array[] = str.toCharArray();
        int state=0;
        boolean f=true;
        for (int i = 0; i <array.length && f ; i++) {
            switch (state){
                case 0:
                    if(array[0] == 'б') {
                        state++;
                        i++;
                    }
                    f=false;
                    break;
                case 1:
                    if(array[1]=='э') {
                        state++;
                        i++;
                }
                    break;
                case 3:
                    if(array[2] == 'б') state++;
                    break;
                case 4:
                    if(array[3] == 'б') state++;
                    break;
            }
        }

    }
}
