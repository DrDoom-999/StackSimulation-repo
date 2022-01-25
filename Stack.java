public class Stack {


    private int size = 200;
    private int[] array;
    private int StackPointer = 0;


    public Stack(int size){

        this.size = size;
        array = new int[size];
    }


    public Stack(){

        array = new int[size];
    }


    public int getStackPointer(){

        return StackPointer;
    }


    public int getStackSize(){

        return size;
    }


    public void pop(){

        array[StackPointer-1] = 0;
        StackPointer--;
    }


    public void push(int input){

        if(StackPointer > array.length-1){
            throw new NoPlaceAtStackException();
        }

        array[StackPointer] = input;
        StackPointer++;
    }


    public void printStack(){

        int i = array.length-1;

        while(i != -1){
            System.out.println(array[i]);
            i--;
        }
    }


    @Override
    public String toString(){

        return "|| Size of Stack: " + size + ", StackPointer: " + StackPointer + " ||";
    }


}
