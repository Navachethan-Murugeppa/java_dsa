package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<Integer>(15);

        arrList.add(10);
        arrList.add(20);
        arrList.add(1,15);
        arrList.add(25);
        arrList.add(30);
        arrList.add(40);
        arrList.add(50);
// add(index,value) method inserts the value at the given index
        System.out.println("Initial size of arraylist: " + arrList.size());
        System.out.println(arrList);
        // Iteration Methods
// Method 1
        for(int i=0;i<arrList.size();i++){
            System.out.println("Element at index "+ i + " : " + arrList.get(i));
        }
// Method 2
        for (int  iter : arrList) {
            System.out.println("Value: " + iter);
            
        }
// Method 3
        Iterator<Integer> it = arrList.iterator();

        while(it.hasNext()){
            System.out.println("Value using iterator: " + it.next());
        }
        // To find an element   // int char, boolean are primitive types
        // Integer, Character, Boolean are wrapper classes or object types 
        for(Integer i : arrList){
            if(i.equals(30)){
                System.out.println("Element found: " + i);
            }
        }
        // To remove an element
        arrList.remove(3); // removes element at index 3
        System.out.println("Arraylist after removing element at index 3: " + arrList);

        ArrayList<String> strList = new ArrayList<String>();
        strList.add("Hello");
        strList.add("World");
        System.out.println("Initial size of string arraylist: " + strList.size());
        System.out.println(strList);
        System.out.println(strList.get(0)); // Accessing element at index 0

        
    }
    
}
