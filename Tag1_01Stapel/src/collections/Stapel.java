package collections;

public class Stapel<HERBERT> {

    private static final int DEFAULT_SIZE = 10;
    private HERBERT []data;
    private int index;

    public Stapel() {
        this(DEFAULT_SIZE);
    }

    public Stapel(int size) {
        data = (HERBERT[])new Object[size > 1? size: DEFAULT_SIZE];
        index = 0;
    }


    public void push(HERBERT value)
    {
        if(isFull()) return;
        data[index++] = value;
    }

    public HERBERT pop(){
        if(isEmpty()) return null;
        return data[--index];
    }

    public boolean isEmpty(){

        return index <= 0;
    }

    public boolean isFull(){
        
        return index >= data.length;
    }
}
