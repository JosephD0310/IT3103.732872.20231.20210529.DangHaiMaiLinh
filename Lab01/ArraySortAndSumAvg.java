package lab01;

import java.util.Scanner;
public class ArraySortAndSumAvg {
    // Sort array
    public static void Sort(int a[], int n){
        for (int i=0;i<n;i++)
            for(int j=i;j<n;j++)
                if(a[i]>a[j]){
                    int tg = a[i];
                        a[i] = a[j];
                        a[j] = tg;
                }
        System.out.print("Sorted Array: ");
        for (int i=0;i<n;i++) System.out.print(a[i]+", ");
        System.out.println("\n");    }
    // Print Sum and Average
    public static void SumAndAverage(int a[], int n){
        double sum=0;
        for (int i=0;i<n;i++) sum+=a[i];
        System.out.print("Sum: " + sum + "\nAverage: " + sum/n);
        System.out.println("\n");
    }
    // Print Array input
    public static void PrintArray(int a[], int n){
        System.out.print("Inputed Array: ");
        for (int i=0;i<n;i++) System.out.print(a[i]+", ");
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] a=new int[100] ;
        for (int i=0;i<n;i++){
            System.out.print("Enter element " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }
        scanner.close();
        
        PrintArray(a,n);
        Sort(a, n);
        SumAndAverage(a,n);
    }
}