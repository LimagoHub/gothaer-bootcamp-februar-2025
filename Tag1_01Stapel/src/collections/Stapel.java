package collections;

public class Stapel<HERBERT> {

    private static final int DEFAULT_SIZE = 10;
    private HERBERT []data;
    private int index;

    public Stapel() throws StapelException {
        this(DEFAULT_SIZE);
    }

    public Stapel(int size) throws StapelException {
        try {
            data = (HERBERT[])new Object[size];
            index = 0;
        } catch (NegativeArraySizeException e) {
            throw new StapelException("init", e);
        }
    }


    public void push(HERBERT value) throws StapelException {

        try {
            data[index++] = value;
        } catch (RuntimeException e) {
            throw new StapelException("Overflow", e);
        }
    }

    public HERBERT pop() throws StapelException {
        if(isEmpty()) throw new StapelException("Underflow");
        return data[--index];
    }

    public boolean isEmpty(){

        return index <= 0;
    }

    public boolean isFull(){
        
        return index >= data.length;
    }
}
