package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args){
        int i;
        Scanner scan = new Scanner(System.in);
        List<Integer> val = new ArrayList<>();
        System.out.println("Enter 5 Values");
        for(i=0;i<5;i++){
            val.add(scan.nextInt());
        }
        System.out.println("Enter key value: ");
        int key = scan.nextInt();
        if(val.contains(key)){
            System.out.println(key+ " is present in the list " + val);
        }else{
            System.out.println(key+ " is not present in the list " + val);
        }
       // System.out.println(val);

    }

}
