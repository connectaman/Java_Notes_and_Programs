package IterativeStatements.forloop;

public class Pattern2 {
    public static void main(String[] args) {
        int term=6;
        for(int i=1;i<=term;i++){
            for(int j=term;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();//new line
        }
    }
}
