public class TestStack{

    public static void main(String[] args){

        Stack st = new Stack(5);
        System.out.println(st);
        st.push(89);
        st.push(13);
        st.push(9);
        st.printStack();
        System.out.println(st);
        st.pop();
        st.printStack();
        System.out.println(st);

    }
}
