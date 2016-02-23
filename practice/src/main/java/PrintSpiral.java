import java.util.List;

/**
 * Created by karthik on 1/15/16.
 */
public class PrintSpiral {
    public void printSpiral(int[][] a) {
        boolean row = true;
        int rowOffset = 0;
        int colOffset = 0;

        int rowMin = 0;
        int rowMax = a.length -1;

        int colMin = 0;
        int colMax = a[0].length - 1;

        int i=0;

        while( i < a.length * a[0].length) {
            System.out.println(a[rowOffset][colOffset]);

            if(colOffset>colMin && colOffset < colMax && rowOffset == rowMin) {
                colOffset++;
            } else if(colOffset == colMax && rowOffset < rowMax) {
                rowOffset++;
                rowMin++;
            } else if(colOffset == colMax && (rowOffset > rowMin)) {
                colOffset--;
            } else if(colOffset > colMin && rowOffset == rowMax) {
                colMax--;
            } else if(colOffset == colMin && rowOffset == rowMax) {
                rowOffset--;
                rowMax--;
            } else if(colOffset == colMin && rowOffset > rowMin) {
                rowOffset--;
            } else if(colOffset == colMin && rowOffset == rowMin) {
                colMin++;
            }
            i++;
        }
    }
}
