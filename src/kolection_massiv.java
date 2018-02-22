import java.util.Scanner;

public class kolection_massiv {
    int i = 0; //индекс для масива - к-во элементов
    int array[];
    int count = 0;

    public kolection_massiv(int i) {
        this.i = i;
        array = new int[i];
       // count=i;                             //остановился на этом
    }


    public void printout()// вывод матрицы
    {

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + "\t");
    }

    public void rand() {
        for (int i = 0; i < array.length; i++)
            array[i] = generator_(-5, 9);

    }


    //генератор случайный чисел в заданом промежутке
    public static int generator_(int x, int y) // x-генерировать число от заданого числа  y-генерировать число от заданого числа
    {
        int rand;
        rand = ((int) (Math.random() * (y - x) + x));
        return rand;

    }


    protected void add() {
        System.out.println("Введите элемент  след масивав");
        Scanner read = new Scanner(System.in);
        int addd = read.nextInt();
        count += 1;
        if (count == array.length) {
            int array2[] = new int[count * 2];
            for (int j = 0; j < array.length; j++) {
                array2[j] = array[j];
            }
            array2[count] = addd;
            array = array2;
        } else
            array[count] = addd;
    }

    protected void add_INDEX() {
        System.out.println("Введите индекс  след масивав");
        Scanner read = new Scanner(System.in);
        int add_index = read.nextInt();
        System.out.println("Введите число которое вы хотите добавить в индекс " + add_index);
        int add_num = read.nextInt();

        if (add_index >= array.length) {
            int array2[] = new int[add_index + 1];
            for (int j = 0; j < array.length; j++) {
                array2[j] = array[j];
            }
            array2[add_index] = add_num;
            array = array2;
        } else
            array[add_index] = add_num;
    }

    protected void del_Index() {
        System.out.println("Введите  индекс удаляемого элемента ");
        Scanner read = new Scanner(System.in);
        int del_index = read.nextInt();
        int array2[] = new int[array.length - 1];
        for (int j = 0; j < array.length; j++) {
            if (j < del_index)
                array2[j] = array[j];
            else
                array2[j - 1] = array[j];

        }
        array = array2;
    }

    protected void clean_colection() {
        System.out.println("вы очищаете колекцию");
        for (int j = 0; j < array.length; j++) {
            array[j] = 0;

        }

    }

    protected void presence() {
        System.out.println("поиск элемента в масиве");
        System.out.println("Введите  значение искомого элемента ");
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int index = -1;
        for (int j = 0; j < array.length; j++) {

            if (array[j] == num)
                index = j;


        }
        if (index == -1)
            System.out.println("элемент не найден");
        else
            System.out.println("элемент найден. его индекс " +index);
    }




}
