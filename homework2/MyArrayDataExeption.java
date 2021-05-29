 class MyArrayDataException extends RuntimeException {
     int i;
     int j;

 public  MyArrayDataException(int i, int j) {
       super("ошибка в строке " + i + ", столбце " + j);
       this.i = i;
       this.j = j;
   }
}