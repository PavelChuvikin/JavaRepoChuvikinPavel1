import java.util.Scanner;

public class СhangeArrayElements {

    public static void main (String[] args){

         int[] array = {1,2,3,4,5,6,7};

        try {
            int[] arrayResult = changeElement(array);
            for (int i = 0; i < arrayResult.length; i++) {
                System.out.print(arrayResult[i]);
            }
        }
        catch (NullPointerException e){
            System.out.println("Невозможно напечатать массив");
        }

    }

    public static int[] changeElement(int[] array) throws Error{

        Scanner in = new Scanner(System.in);
        System.out.println("Введите номера элементов массива которые меняем местами:");
        int i = in.nextInt();
        int j = in.nextInt();

      try{
          int a = array[i-1];
          int b = array[j-1];
          array[i-1]= b;
          array[j-1]= a;
          return array;

      }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за пределы массива");
            return null;
        }
    }
}
