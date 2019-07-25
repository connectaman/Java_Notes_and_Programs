package Variables;

public class Narrowing {
    public static void main(String[] args){
        float f=10.5f;
        //int a=f;  //Compile time error
        int a=(int)f;
        System.out.println(f);
        System.out.println(a);
    }
}

// the output is :  10.5
//                  10

