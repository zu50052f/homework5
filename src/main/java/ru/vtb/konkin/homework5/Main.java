package ru.vtb.konkin.homework5;

import java.util.Arrays;

public class Main {

    /*
    1. Создайте класс `ru.vtb.konkin.homework5.IndexStorage` с
        тремя методами -
            `size()`,
            `get(int index)`
            `reverse`.
        размер заполняется конструктором,
        get` возвращает индекс или -индекс в зависимости от чётности).
        `reverse()`, который возвращает массив, заполненный элементами в обратном порядке.
        Сделайте этот класс без хранения массивов в полях.

    2. Создайте ему наследника `ArrayIndexStorage`, который бы
        принимал в конструкторе один параметр - массив интов, в котором хранил бы все данные.
        `get(int index)` должен возвращать значение ячейки массива под номером этого индекса.

    Обеспечьте корректную работоспособность всех методов, причём сделайте оба класса
    так, чтобы для этого не пришлось переопределять `reverse` в `ArrayIndexStorage`
     */

    public static void main(String[] args) {
        callAllMethods(new IndexStorage(10));
	    callAllMethods(new ArrayIndexStorage(new int[]{0, 1, 2, 3, 4}));
    }

    private static void callAllMethods(IndexStorage indexStorage) {
        System.out.printf("Class:%s%n" +
                        ">> size:%d%n" +
                        ">> index value:%d%n" +
                        ">> Reverse array:%s%n%n",
                indexStorage.getClass().getSimpleName(),
                indexStorage.size(),
                indexStorage.get(3),
                Arrays.toString(indexStorage.reverse()));
    }
}
