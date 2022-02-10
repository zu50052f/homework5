package ru.vtb.konkin.homework5;

public class ArrayIndexStorage extends IndexStorage {
    private final int[] array;

    public ArrayIndexStorage(int[] array) {
        super(array.length);
        this.array = array;
    }

    @Override
    public int get(int index) {
        return array[index];
    }

    @Override
    public int[] getArray() {
        return this.array;
    }
}
