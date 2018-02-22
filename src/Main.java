import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello OOP!");
        Scanner read = new Scanner(System.in);
        System.out.println("Введите размерность масива");
        int i = read.nextInt();
        kolection_massiv array =new kolection_massiv(i);

        array.rand();
        array.printout();
int exit=22;
        System.out.println("Введите операцию которую хотите осуществить");
        System.out.println("1. Добавить элемент.\n" +
                "2. Добавить элемент по индексу.\n" +
                "3. Удалить элемент по индексу.\n" +
                "4. Очистить коллекцию.\n" +
                "5. Получить размер коллекции(хвост не считаем).\n" +
                "6. Проверить, содержится ли элемент в коллекции.\n" +
                "7. Вернуть копию массива в коллекции (хвост обрезать).\n");
        int vubor =read.nextInt();

while (exit!=0) {
    switch (vubor) {
        case 1:
            array.add();
            break;
        case 2:
            array.add_INDEX();
            break;
        case 3:
            array.del_Index();
            break;
        case 4:
            array.clean_colection();
            break;
        case 5:
            System.out.println("error");
            break;
        case 6:
            array.presence();
            break;


    }
        System.out.println("Для прекращениее ввода наберите 0 -- ");

    exit=read.nextInt();

}
        System.out.println();
array.printout();
    }
}
