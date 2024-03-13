import java.sql.Time;
import java.util.Scanner;
import java.util.Random;

class Insertionsort {
    void insertionsort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}

public class insertion_sort {
    public static void main(String arg[]) {
        Insertionsort b = new Insertionsort();
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array for insertion sort :");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        int b1[] = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b1[j - 1] = a[i];
            j = j - 1;
        }
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = rand.nextInt(1000);
        }
        long StartingTime = System.nanoTime();
        System.out.println("\nStarting Time to execute insertion sort =" + StartingTime);
        b.insertionsort(a);
        long EndingTime = System.nanoTime();
        System.out.println("\nEnding Time to complete insertion sort =" + EndingTime);
        System.out.println("\nTime taken by best case innanoseconds=" + (EndingTime - StartingTime));
        long StartingTime1 = System.nanoTime();
        System.out.println("\nStarting Time to execute insertion sort =" + StartingTime1);
        b.insertionsort(c);
        long EndingTime1 = System.nanoTime();
        System.out.println("\nEnding Time to complete insertion sort =" + EndingTime1);
        System.out.println("\nTime taken by average case innanoseconds=" + (EndingTime1 - StartingTime1));
        long StartingTime2 = System.nanoTime();
        System.out.println("\nStarting Time to execute insertion sort =" + StartingTime2);
        b.insertionsort(b1);
        long EndingTime2 = System.nanoTime();
        System.out.println("\nEnding Time to complete insertion sort =" + EndingTime2);
        System.out.println("\nTime taken by worst case in    nanoseconds=" + (EndingTime2 - StartingTime2));
    }
}