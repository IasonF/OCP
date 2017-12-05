package Practice7;

import java.util.ArrayDeque;
import java.util.Deque;

public class IntegerStack {
    private Deque<Integer> data = new ArrayDeque<>();

    public void push (Integer element){
        data.addFirst(element);
    }

    public Integer peek() {
        return data.peekFirst();
    }

    public Integer pop() {
        if (data.isEmpty())
            System.out.println("Stack is empty");
        return data.removeFirst();
    }

    @Override
    public String toString() {
        return "IntegerStack{" +
                "data=" + data +
                '}';
    }
}
