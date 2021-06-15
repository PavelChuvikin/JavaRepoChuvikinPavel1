import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Person ivan1 = new Person("Ivan1");
        Person ivan2 = new Person("Ivan2");
        Person ivan3 = new Person("Ivan3");
        Person ivan4 = new Person("Ivan4");
        Person ivan5 = new Person("Ivan5");

        Discipline math = new Discipline("Math");
        Discipline history = new Discipline("History");
        Discipline physics = new Discipline("Physics");
        Discipline geography = new Discipline("Geography");
        Discipline astronomy = new Discipline("Astronomy");
//Ivan1 записался на 2 курса
        ivan1.addCourse(math);
        ivan1.addCourse(physics);
//Ivan2 записался на 1 курс
        ivan2.addCourse(history);
//Ivan3 записался на 3 курса
        ivan3.addCourse(physics);
        ivan3.addCourse(history);
        ivan3.addCourse(math);
//Ivan4 записался на 1 курс
        ivan4.addCourse(geography);
//Ivan5 записался на 1 курс
        ivan5.addCourse(geography);
//список студентов
        ArrayList<Person> students = new ArrayList<>(Arrays.asList(ivan1, ivan2, ivan3, ivan4, ivan5));
//Задание1______________________________________________________увы, лучше, чем это я не придумал. Как сделать в один стрим не знаю.
//список списков курсов к которому мы приводим список студентов через стрим
        List<List<Course>> coll = students.stream()
                .map(person -> person.getAllCourses())
                .distinct().collect(Collectors.toList()); //убираем дублирующиеся списки курсов
// формируем список курсов в которые будут включаться все курсы всех студентов
        ArrayList<Discipline> disciplines = new ArrayList<>();
// через for добавляем в disciplines курсы из coll
        for (int i = 0; i < coll.size(); i++) {
            for (int j = 0; j < coll.get(i).size(); j++) {
                 disciplines.add((Discipline) coll.get(i).get(j));
            }
        }
//список курсов для которго мы исключаем дубли и печатаем уже без дублей
        List<Discipline> dis = disciplines.stream()
                .distinct().collect(Collectors.toList());
        System.out.println("Списиок уникальных курсов: " + dis);

//Задание2_____________________________________________
        List<Student> coll1 =  students.stream()
        .sorted((o2, o1) -> o2.getAllCourses().size()-o1.getAllCourses().size() ) //сравниваем
        .collect(Collectors.toList()); //преобразуем обратно в коллекцию
         System.out.println(coll1.get(coll1.size()-1) +" "+ coll1.get(coll1.size()-2) +" "+ coll1.get(coll1.size()-3)); //выводим с конца списка т.к.
                                                                                                                        //сортировка была от меньшего к большему
// Задание3_________________________________________________

         Function<Discipline, List<Student>> function = new Function<Discipline, List<Student>>() {
             @Override
             public List<Student> apply(Discipline discipline) {
                 List<Student> students_of_dis = new ArrayList<>();
                 for (int i =0; i<students.size();i++){
                     if(students.get(i).getAllCourses().contains(discipline)){
                         students_of_dis.add(students.get(i));
                     }
                 }
                 return students_of_dis;
             }
         };
System.out.println("на курс " + math.getName() + " записаны: " + function.apply(math));
        }
      }






