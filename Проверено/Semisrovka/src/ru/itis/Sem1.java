package ru.itis;

public class Sem1{
    public static void main(String[] args) {
        double h=0.709,b=2,x1=b+h;
        int n=6;
        int []a={-160,0,14};
        double [] y=new double[n];
        double min=(1-5.7*Math.cos(a[0]-x1)/(2.6+Math.cos(a[0]+x1)*Math.cos(a[0]+x1))),pr=1;
        for (int i=0;i<3;i++){
           System.out.println("При а"+(i+1));
            for(int j=0;j<n;j++){
                x1=b+(j+1)*h;
                y[j]=(1-5.7*Math.cos(a[i]-x1)/(2.6+Math.cos(a[i]+x1)*Math.cos(a[i]+x1)));
                if(y[j]<min) min=y[j];
                pr*=Math.abs(y[j]);
            }
            System.out.println("Наименьший y="+min);
            System.out.println("Произведение y="+pr);
        }
    }
}
