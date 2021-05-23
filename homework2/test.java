

public class test {

    public static void main(String[] args) {

        String array[][] = new String[4][4];
        array[0][0]= "1";
        array[0][1]= "1";
        array[0][2]= "1";
        array[0][3]= "1";
        array[1][0]= "1";
        array[1][1]= "1";
        array[1][2]= "1";
        array[1][3]= "е";
        array[2][0]= "1";
        array[2][1]= "1";
        array[2][2]= "1";
        array[2][3]= "1";
        array[3][0]= "1";
        array[3][1]= "1";
        array[3][2]= "1";
        array[3][3]= "1";
ArrayCheckMethod(array);
    }

    static void ArrayCheckMethod (String array[][]){
        if ((array.length !=4) || (array[0].length !=4)) throw new MyArraySizeException();
        int sum = 0;
for (int i = 0;i< array.length; i++){
    for (int j = 0;j< array.length; j++){
        try {
            sum = sum + Integer.parseInt(array[i][j]);
        }
        catch (NumberFormatException e) {
            throw new MyArrayDataException(i, j);
        }
    }
}
 System.out.println(sum);

    }
}
