import java.util.Stack;

/**
 * Created by Bob_JIANG on 8/13/2015.
 */
public class Problem5 {
    class MyQueue {
        Stack<Integer> si1 = new Stack<>();
        Stack<Integer> si2 = new Stack<>();

        // Push element x to the back of queue.
        public void push(int x) {
            si1.push(x);
        }

        // Removes the element from in front of queue.
        public void pop() {
            if(!si2.empty()) {
                si2.pop();
            }
            else {
                while(!si1.empty()) {
                    si2.push(si1.peek());
                    si1.pop();
                }
                si2.pop();
            }
        }

        // Get the front element.
        public int peek() {
            if(!si2.empty()) {
                return si2.peek();
            }
            else {
                while(!si1.empty()) {
                    si2.push(si1.peek());
                    si1.pop();
                }
                return si2.peek();
            }
        }

        // Return whether the queue is empty.
        public boolean empty() {
            return si1.empty() && si2.empty();
        }
    }

    //Standard approach with two stacks
    public static void main(String[] args) {

    }
}
