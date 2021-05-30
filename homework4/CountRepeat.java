import java.util.ArrayList;

public abstract class CountRepeat {

    public static void countRepeat(ArrayList array) {
//Создаем вспомогательный список со значениями количества каждого слова в списке подаваемом на вход,
//по-умолчанию заполняем его единицами потому что каждое слово встречается как минимум 1 раз
        ArrayList<Integer> countArr = new ArrayList<>();
        int cap = array.size();
        for (int i = 0; i < cap; i++) {
            countArr.add(1);
        }
//Проходим по списку и сравниваем хэш.
        for (int i = 0; i < array.size() && countArr.get(i) != 0; i++) {     //если слово определилось как дублируещее в countArr для него будет ноль и для него проверки не будет
            for (int j = 1 + i; j < array.size(); j++) {
                if (array.get(i).hashCode() == array.get(j).hashCode()) {   //Если хэши равны
                    int add = countArr.get(i) + 1;                          //добавляем 1 к соотв. элементу во вспомогательном списке
                    countArr.set(i, add);
                    countArr.set(j, 0);                                     //записываем в countArr ноль на месте того слова которое дублирует проверяемое
                }
            }
        }
        for (int i = 0; i < countArr.size(); i++) {
            if (countArr.get(i) != 0) {
                System.out.println("Количество слов \"" + array.get(i) + "\"" + " равно " + countArr.get(i));
            }
        }
    }
}
