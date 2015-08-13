import java.util.Stack;

/**
 * Created by Bob_JIANG on 8/13/2015.
 */
public class Problem4 {
    public static class state {
        int step;
        char firstele, secondele, thirdele;

        state(int _step, char _firstele, char _secondele, char _thirdele) {
            step = _step;
            firstele = _firstele;
            secondele = _secondele;
            thirdele = _thirdele;
        }
    }

    public static void move(char firstele, char secondele) {
        System.out.println("move " + firstele + " to " + secondele);
    }

    public static void hanoi(int n) {
        Stack<state> ss = new Stack<>();
        ss.push(new state(n, 'A', 'B', 'C'));
        while(!ss.empty()) {
            state temp = ss.pop();
            if(temp.step == 1) {
                move(temp.firstele, temp.thirdele);
            }
            else {
                ss.push(new state(temp.step - 1, temp.secondele, temp.firstele, temp.thirdele));
                ss.push(new state(1, temp.firstele, temp.secondele, temp.thirdele));
                ss.push(new state(temp.step - 1, temp.firstele, temp.thirdele, temp.secondele));
            }
        }
    }

    //Notice the use of stack requires reverse order of calls made in recursive function. Also notice the use of push
    // instead of just move. It's because when we're using stacks manually, we don't have a automatic stack environment
    // setup to preserve variables
    public static void main(String[] args) {
        hanoi(3);
    }
}
