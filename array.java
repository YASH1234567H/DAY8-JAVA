import java.util.*;
 class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ns[]=new int[n];
        for(int i=0;i<n;i++)
        ns[i]=sc.nextInt();
        int max=ns[0];
        for(int i=1;i<n;i++)
        {
            if(ns[i]>max)
            {
                max=ns[i];
            }
        }
        System.out.println("max element"+max);
    }
}