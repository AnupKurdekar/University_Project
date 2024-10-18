import java.io.*;

class arr2{
    public static int[] reverse(int arr[],int length){

        int temp[] = new int[length];
        
        for(int i=0; i<=length-1; i++){
            temp[i] = arr[length-1-i];
        }
        for(int i=0; i<=temp.length-1; i++){
            arr[i] = temp[i];
        }
        return arr;
        
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        int size = arr.length;
        int[] res = reverse(arr,size);

        for(int i=0; i<=res.length-1; i++){
            System.out.println(res[i]);
        }
    }

}