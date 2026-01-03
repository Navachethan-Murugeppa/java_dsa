package Array;
import java.util.*;
public class learn_array {
    int[] arr = null;

    public learn_array(int size){
        arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    public void insert(int index, int value){
        try{
            if(arr[index]==Integer.MIN_VALUE){
                arr[index]=value;
            }else{
                System.out.println("This index is already occupied");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to insert value");
        }
    }
    public static void main(String[] args) {
        int[] num = new int[5];
        num[0] = 10;
        num[1] = 20; // if values are not assigned, default value is 0
        num[2] = 30;
        num[3] = 40;
        num[4] = 50;

        for (int i =0; i<num.length;i++){
            System.out.println(num[i]);
        }
        System.out.println(Arrays.toString(num));

        // Insert elements in array

        learn_array arr = new learn_array(5);
        arr.insert(0,100);
        arr.insert(1,200);
        arr.insert(1,300); // This index is already occupied
        arr.insert(5,400); // Invalid index to insert value
        System.out.println(Arrays.toString(arr.arr));


    }
}