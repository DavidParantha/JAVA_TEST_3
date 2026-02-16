package dev.underthis.Abstraction.test3;
import java.util.Scanner;
public class Question1Array {
    public static void Question1Array(int[]no) {
        if (no==null||no.length==0) {
            System.out.println("Invalid Array");
            return;
        }
        int min=no[0];
        int max=  no[0];
        for (int i=1;i<no.length;i++) {
            if (no[i] <min) {
                min =no[i];
            }
            else if(no[i]>max) {
                max=no[i];
            }
        }
        System.out.println("Min.no:"+min+",Max,no:"+max);
    }
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter no.of elements:");
        int size=scanner.nextInt();
        if(size<=0){
            System.out.println("Invalidarray size");
            return;
        }
        int[]numbers=new int[size];
        System.out.println("Enter"+size+"no:");
        for(int i=0;i<size;i++){
            numbers[i]=scanner.nextInt();
        }
        Question1Array(numbers);
        scanner.close();
    }
}

