import java.sql.Time;
import java.util.Scanner;
import java.util.Random;

class Bubblesort {
    void bubblesort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

public class bubble_sort {
    public static void main(String arg[])
    {
        Bubblesort b=new Bubblesort();
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
        System.out.println("\nStarting Time for executing Bubble sort ="+StartingTime);
        b.bubblesort(a);
        long EndingTime=System.nanoTime();
        System.out.println("\nEnding Time for Completing Bubble sort="+EndingTime);
        System.out.println(" Best Case For Bubble Sort " );
        System.out.println("\nTime taken by best case in nanoseconds for bubblesort="+(EndingTime-StartingTime));
        long StartingTime1=System.nanoTime();
        System.out.println("\nStarting Time for executing Bubble sort ="+StartingTime1);
        b.bubblesort(c);
        long EndingTime1=System.nanoTime();
        System.out.println("\nEnding Time for Completing Bubble sort ="+EndingTime1);
        System.out.println(" Avg case for Bubble sort ");
        System.out.println("\nTime taken by average case in nanoseconds bubblesort="+(EndingTime1-StartingTime1));
        long StartingTime2=System.nanoTime();
        System.out.println("\nStarting Time for executing Bubble sort="+StartingTime2);
        b.bubblesort(b1);
        long EndingTime2=System.nanoTime();
        System.out.println("\nEnding Time for Completing Bubble sort="+EndingTime2);
        System.out.println("\nTime taken by worst case in nanoseconds bubble sort="+(EndingTime2-StartingTime2));
    }
}