import java.util.Stack;

/**
 * Created by Bob_JIANG on 8/13/2015.
 */
public class Problem2 {
    public static class MinStack {
        Stack<Integer> si = new Stack<>();
        Stack<Integer> minsi = new Stack<>();

        public void push(int x) {
            if(minsi.empty() || x <= minsi.peek()) {
                minsi.push(x);
            }
            si.push(x);
        }

        public void pop() {
            int temp = si.peek();
            if(minsi.peek() == temp) {
                minsi.pop();
            }
            si.pop();
        }

        public int top() {
            return si.peek();
        }

        public int getMin() {
            return minsi.peek();
        }
    }

    //Standard approach, two stacks
    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(-3);
    }

}
