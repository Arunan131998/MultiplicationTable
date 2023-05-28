package FirstProgram;

public class PrintNumbers {
    public void printNumber(int iNumber){
        System.out.printf("Printing the numbers upto %d",iNumber).println();
        for (int i=1; i<=iNumber;i++){
            System.out.println(i);
        }
    }

    public void printSquareNumber(int iNumber){
        System.out.printf("Printing the square of numbers upto %d",iNumber).println();
        for (int i=1; i<=iNumber;i++){
            System.out.println(i*i);
        }
    }
}
