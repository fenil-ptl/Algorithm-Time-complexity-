import java.sql.Time;
import java.util.Scanner;
import java.util.Random;

class Selectionsort {
    void selectionsort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallestnumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallestnumber;
        }
    }
}

public class selection_sort {
    public static void main(String arg[])
   {
        Selectionsort b=new Selectionsort();
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=i+1;
        }   
        int b1[]=new int[n];
        int j=n;    
        for(int i=0;i<n;i++)
        {
            b1[j-1]=a[i];
            j=j-1;
        }   
        int c[]=new int[n];
        for(int i=0;i<n;i++)
        {
            c[i]=rand.nextInt(1000);
        }
        long StartingTime=System.nanoTime();
        System.out.println("\nStarting Time for executing selection sort ="+StartingTime);
        b.selectionsort(a);
        long EndingTime=System.nanoTime();
        System.out.println("\nEnding Time completion selection sort="+EndingTime);
        System.out.println("\nTime taken by best case innanoseconds="+(EndingTime-StartingTime));
        long StartingTime1=System.nanoTime();
        System.out.println("\nStarting Time for executing selection sort="+StartingTime1);
        b.selectionsort(c);
        long EndingTime1=System.nanoTime();
        System.out.println("\nEnding Time completion selection sort="+EndingTime1);
        System.out.println("\nTime taken by average case innanoseconds="+(EndingTime1-StartingTime1));
        long StartingTime2=System.nanoTime();
        System.out.println("\nStarting Time for executing selection sort="+StartingTime2);
        b.selectionsort(b1);
        long EndingTime2=System.nanoTime();
        System.out.println("\nEnding Time completion selection sort ="+EndingTime2);
        System.out.println("\nTime taken by worst case innanoseconds="+(EndingTime2-StartingTime2));
    }
}
