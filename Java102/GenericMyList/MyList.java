package GenericMyList;

import java.util.Arrays;

public class MyList<T> {

    private int capacity;
    private Object[] array;
    private int size = 0;

    public MyList() {
        capacity = 10;
        array = new Object[capacity];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        array = new Object[capacity];
    }


    public boolean isEmpty() {
        if ( size == 0 ) {
            return true;
        }
        return false;
    }
    //array element first index
    public int indexOf(T t) {
        int indexOf = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == t) {
                indexOf = i;
                break;
            }
        }
        return indexOf;
    }
    public int lastIndexOf(T t) {
        int indexOf = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == t) {
                indexOf = i;
                break;
            }
        }
        return indexOf;
    }

    public T[] toArray() {

        return (T[]) array;
        
    }

    public void clear() {
        this.size = 0;
        this.array = new Object[size];
    }

    public MyList<T> subList(int start,int finish) {
        MyList<T> subList = new MyList<>();
        for (int i = start; i <= finish; i++) {
            subList.add((T)array[i]);
            }
        return  subList;
    }
        
    public void remove(int index) {

        if (index > this.size) {
            System.out.println("null");
           
        } else {
            size--;
            for (int i = index + 1, j = index; i <= capacity - index; i++, j++) {
                this.array[j] = this.array[i];
            }
        }

    }

    public void set(int index, T data) {
        if (index > this.size) {
            System.out.println("null");
           
        } else {
            array[index] = data;
        }

        toString();
    }

    @Override
    public String toString() {
        Object temp[] = new Object[size];

        for (int i = 0; i < size; i++) {
            temp[i] = this.array[i];
        }

        return Arrays.toString(temp);
    }

    public Object get(int index) {
        return array[index];
    }

    public int size() {
        return size;
    }

    public void add(T data) {
        if (size == capacity) {
            growSize();
        }
        array[size++] = data;

    }

    public void growSize() {
        Object temp[] = null;
        temp = new Object[capacity * 2];

        for (int i = 0; i < capacity; i++) {
            temp[i] = this.array[i];
        }

        array = temp;
        setCapacity(capacity * 2);
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
