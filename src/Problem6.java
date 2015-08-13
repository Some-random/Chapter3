import java.util.Stack;

/**
 * Created by Bob_JIANG on 8/13/2015.
 */
public class Problem6 {
    static int c = 0;

    public static Stack sortStack(Stack<Integer> si) {
        if(si.size() <= 1) {
            return si;
        }
        int i = 0;
        Stack<Integer> left = new Stack<>();
        Stack<Integer> right = new Stack<>();
        while(!si.empty()) {
            i++;
            c++;
            if(i % 2 == 0) {
                left.push(si.pop());
            }
            else {
                right.push(si.pop());
            }
        }
        left = sortStack(left);
        right = sortStack(right);

        while(!left.empty() || !right.empty()) {
            if(left.empty()) {
                si.push(right.pop());
            }
            else if(right.empty()) {
                si.push(left.pop());
            }
            else if(left.peek() <= right.peek()) {
                si.push(right.pop());
            }
            else if(left.peek() > right.peek()) {
                si.push(left.pop());
            }
        }

        Stack<Integer> reverseStack = new Stack<>();
        while(!si.empty()) {
            c++;
            reverseStack.push(si.pop());
        }

        return reverseStack;
    }

    //the bubble sort approach, take O(n * n) time
    public static Stack<Integer> sort(Stack<Integer> s) {
        Stack<Integer> r = new Stack<Integer>();
        while(!s.isEmpty()) {
            int tmp = s.pop();
            while(!r.isEmpty() && r.peek() > tmp) {
                s.push(r.pop());
            }
            r.push(tmp);
        }
        return r;
    }

    //Using the same idea as the solution. Mergesort probably is the best sorting algorithm in this case. Pay attention
    // to the minStack technique and the necessity of reverse the stack
    public static void main(String[] args) {
        Stack<Integer> si = new Stack<>();
        si.push(1);
        si.push(5);
        si.push(2);
        si.push(3);
        si = sort(si);
        while(!si.empty()) {
            System.out.print(si.pop() + " ");
        }

        /*
        for (int k = 1; k < 100; k++) {
            c = 0;
            Stack<Integer> s = new Stack<Integer>();
            for (int i = 0; i < 10 * k; i++) {
                int r = AssortedMethods.randomIntInRange(0, 1000);
                s.push(r);
            }
            s = sortStack(s);
            int last = Integer.MAX_VALUE;
            while(!s.isEmpty()) {
                int curr = s.pop();
                if (curr > last) {
                    System.out.println("Error: " + last + " " + curr);
                }
                last = curr;
            }
            System.out.println(c);
        }*/
    }
}
