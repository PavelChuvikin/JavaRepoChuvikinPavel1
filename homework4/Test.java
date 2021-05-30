import java.util.*;

public class Test {


    public static void main(String[] args) {
//Задание 1.
        //Создаем список слов
        ArrayList<String> array = new ArrayList(Arrays.asList("один", "два", "три", "четыре", "пять",
                                                              "один", "слон", "три", "чайник", "пять",
                                                              "один", "два", "ноль", "четыре", "пять",
                                                              "один", "два", "чайник", "четыре", "пять"));
//Печатаем только уникальные слова
        Set<String> set = new HashSet<>(array);
        System.out.println(set);
//Печатаем список с количеством повторов
        CountRepeat.countRepeat(array);


//Задание 2.
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "+7914778911");
        phoneBook.add("Петров", "+79147565454");
        phoneBook.add("Иванов", "+791478644");
        phoneBook.add("Иванов", "+7910000644");


        phoneBook.get("Иванов");


    }
}


