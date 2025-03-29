import java.util.*;
class Task2{
    public static void main(String[]ar){
        int[]a={58,70,745,166,2,1000};
        for(int i=0;i<a.length;i++){
            if(a[i]>=200){
                System.out.println("Quality is high: "+a[i]);
            }
            else if(a[i]>50&&a[i]<200){
                System.out.println("Quality is medium: "+a[i]);
            }
            else{
                System.out.println("Quality is low: "+a[i]);
            }
        }
        
        System.out.println("Using for loop");
        for(int i=1;i<=10;i++){
            if(i!=5)
            System.out.print(i+" ");
        }
        System.out.println();
        
        System.out.println("Using while loop");
        int t=0;
        while(t<=100){
            t+=10;
            System.out.print(t+" ");
        }
    }
}
