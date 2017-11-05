package ru.itis;
1иии
public class Sem1{
    public static void main(String[] args) {
        double h=0.709,b=2,x1=b+h;
        int n=6;
        int []a={-160,0,14};
        double [] y=new double[n];
        double min=(1-5.7*Math.cos(a[0]-x1)/(2.6+Math.cos(a[0]+x1)*Math.cos(a[0]+x1))),pr=1;
        for (int i=0;i<3;i++){
           System.out.println("При а"+(i+1));
            for(int m=0;m<n;m++){
                x1=b+(m+1)*h;
                y[m]=(1-5.7*Math.cos(a[i]-x1)/(2.6+Math.cos(a[i]+x1)*Math.cos(a[i]+x1)));
                if(y[m]<min){
                    min=y[m];
                }
                pr*=Math.abs(y[m]);
            }
            System.out.println("Наименьший y="+min);
            System.out.println("Произведение y="+pr);
        }
    }
}
