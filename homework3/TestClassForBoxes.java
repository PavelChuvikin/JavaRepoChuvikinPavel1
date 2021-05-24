public class TestClassForBoxes {

    public static void main(String[] args){
//создаем яблоко и апельсин
        Apple Apple = new Apple();
        Orange Orange = new Orange();
//создаем коробки с нулем фруктов в каждой
        Box<String,Integer,Double, Integer> boxForApple = new Box<> (Apple.type, 0, Apple.weight, 1);
        Box<String,Integer,Double, Integer> boxForOrange1 = new Box<> (Orange.type, 0, Orange.weight, 2);
        Box<String,Integer,Double, Integer> boxForOrange2 = new Box<> (Orange.type, 0, Orange.weight, 3);
//добавляем фрукты
        addFruit(boxForApple, 10);
        addFruit(boxForOrange1,5);
//печатаем вес коробок используя метод getWeight
        System.out.println("в коробке " + boxForApple.getNumberOfBox() + " " + getWeight(boxForApple) + " кг");
        System.out.println("в коробке " + boxForOrange1.getNumberOfBox() + " " + getWeight(boxForOrange1) + " кг");
        System.out.println("в коробке " + boxForOrange2.getNumberOfBox() + " " + getWeight(boxForOrange2) + " кг");
//сравниваем вес коробок
        System.out.println(boxForApple.compare(boxForOrange1));
//пробуем переложить яблоки в коробку с апельсинами
        shiftFruit(boxForApple, boxForOrange2);
//пробуем переложить апельсины в пустую коробку с апельсинами
        shiftFruit(boxForOrange1, boxForOrange2);
//печатаем вес коробок используя метод getWeight
        System.out.println("в коробке " + boxForApple.getNumberOfBox() + " " + getWeight(boxForApple) + " кг");
        System.out.println("в коробке " + boxForOrange1.getNumberOfBox() + " " + getWeight(boxForOrange1) + " кг");
        System.out.println("в коробке " + boxForOrange2.getNumberOfBox() + " " + getWeight(boxForOrange2) + " кг");
    }
//метод расчета веса коробки
    public static double getWeight(Box boxForWeight) {
        double boxWeight = ((int) boxForWeight.getNumberOfFruit() * (double) boxForWeight.getWeightOfFruit());
        return boxWeight;
    }
//метод добавления фруктов
   public static void addFruit(Box box, int addFruit){
        box.setNumberOfFruit(addFruit + (int)box.getNumberOfFruit());
   }
//метод перекладывания фруктов
   private static void shiftFruit(Box fullBox, Box emptyBox){
       if(fullBox.getNameOfFruit() == emptyBox.getNameOfFruit()){
        emptyBox.setNumberOfFruit((int)emptyBox.getNumberOfFruit()+(int)fullBox.getNumberOfFruit());
        fullBox.setNumberOfFruit(0);
       }
  else {
    System.out.println("Нельзя смешивать яблоки и апельсины");
       }
   }

}
