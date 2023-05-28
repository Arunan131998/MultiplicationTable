package FirstProgram;

public class MultiTable {
       public void PrintTable(int iTable){
        System.out.printf("Printing the %d Table",iTable).println();
        for(int i=1; i<=10;i++){
            System.out.printf("%d * %d = %d",i,iTable,(i*iTable)).println();
        }
       }
}
