import java.io.*;
import java.util.*;
public class arr {

    public static int setmini(int min,int arr[]){

        for(int i=0; i<=arr.length-1; i++){
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int setmax(int max,int arr[]){

        for(int i=0; i<=arr.length-1; i++){
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {

        int arr[] = {43,6,1,2,75,90};
        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        
        System.out.println("min :"+setmini(min,arr));
        System.out.println("max :"+setmax(max, arr));



    }

}