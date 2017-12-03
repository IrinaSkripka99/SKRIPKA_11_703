package ru.itis;

public class Class2{
        public static void main(String[] args) {
            int[] x = {2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 7};
            int k = 0;
            if (x[0]!=x[1]) k++;
            if (x[11]!=x[12]) k++;
            for (int i = 1; i < x.length-2; i++){
                if (x[i]!=x[i-1] && x[i]!=x[i+1]) k++;
            }
            System.out.println(k);
        }
}

