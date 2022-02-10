package ru.vtb.konkin.homework5;

public class IndexStorage {
    private final int size;

    public IndexStorage(int size) {
        this.size = size;
    }

    public int size() {
        return size;
    }

    private int calcValue(int index) {
        return (index % 2 == 0) ? index : -index;
    }

    public int get(int index) {
        return calcValue(index);
    }

    public int[] getArray() {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = calcValue(i);
        }
        return array;
    }

    public int[] reverse() {
        int[] array = getArray();
        for (int i = 0; i < array.length / 2; i ++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        return array;
    }
}
