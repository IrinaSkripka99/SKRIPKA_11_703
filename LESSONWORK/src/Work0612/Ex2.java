package Work0612;

public class Ex2 {
    public static void main(String[] args) {
        char[] array = {'б', 'э', 'э', '!'};
        int state = 0;
        boolean f = true;
        int i = 0;
        while (f) {
            switch (state) {
                case 0:
                    if (array[i] == 'б') {
                        i++;
                        state++;
                        break;
                    }
                case 1:
                    if (array[i] == 'э') {
                        i++;
                        break;
                    }
                    if(array[i]!='э')
                        state++;
                case 2:
                    if (array[i] == '!') {
                        i++;
                        state++;
                       f = false;
                        break;
                    }

            }
        }
        System.out.println("Все хорошо");
    }
}
