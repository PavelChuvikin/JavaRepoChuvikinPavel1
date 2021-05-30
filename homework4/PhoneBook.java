import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    //фамилия будет строкой а номера будут списком для каждой фамилии потому что на одну фамилию может быть несколько номеров
    private final HashMap<String, List<String>> phonebook;

    public PhoneBook() {
        this.phonebook = new HashMap<String, List<String>>();
    }

    //Метод добавления абонента
    public void add(String name, String number) {
        List<String> phonenumbers = new ArrayList<>();

        if (this.phonebook.containsKey(name)) {
            phonenumbers = this.phonebook.get(name); //Если добавляемая фамилия уже есть в списке записываем соответствующий ей номер(а) в phonenumbers
            phonenumbers.add(number);                //Добавляем к ней номер нового абонента
            this.phonebook.put(name, phonenumbers);  //Добавляем в словарь фамилию и новый список телефонов
        } else {
            phonenumbers.add(number);           //Если добавляемой фамилии нет в списке добавляем номер нового абонента в phonenumbers
            this.phonebook.put(name, phonenumbers); //Добавляем в словарь фамилию и новый список телефонов
        }

    }

    public void get(String name) {

        if (this.phonebook.containsKey(name)) {

            System.out.println(name + " номер телефона: ");
            for (int i = 0; i < this.phonebook.get(name).size(); i++) {
                System.out.println(this.phonebook.get(name).get(i));
            }


        } else {
            System.out.println("Такого номера телефона нет в справочнике");

        }


    }


}
