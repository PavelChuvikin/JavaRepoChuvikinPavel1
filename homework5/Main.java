import java.io.*;
import java.nio.charset.StandardCharsets;


public class Main {

    public static void main(String[] args) throws IOException {

//Cоздаем экземпляр AppData
        AppData app = new AppData();
//Заполняем значениями
        app.fillData(100);
//Создаем файл
        File file = new File("./file.csv");
        file.createNewFile();
//Записываем в файл заголовки и значения appData
        try (OutputStream out = new FileOutputStream(file)) {
            for (int i = 0; i < app.getHeaders().length; i++) {
                out.write((app.getHeaders()[i] + ";").getBytes(StandardCharsets.UTF_8));
            }
            out.write("\n".getBytes(StandardCharsets.UTF_8));
            for (int i = 0; i < app.getData().length; i++) {
                for (int j = 0; j < app.getData().length; j++) {
                    out.write((app.getData()[i][j] + ";").getBytes(StandardCharsets.UTF_8));

                }
                out.write("\n".getBytes(StandardCharsets.UTF_8));
            }
        }
//Читаем файл и выводим на консоль
        try (BufferedReader in = new BufferedReader(new FileReader(file))) {
            String string = null;
            while ((string = in.readLine()) != null) {
                System.out.println(string);
            }
        }



    }
}
