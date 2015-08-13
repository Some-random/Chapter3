/**
 * Created by Bob_JIANG on 8/13/2015.
 */
public class Problem1 {
    //Let's be honest, the idea is just retarded... I put my thoughts in comments...
    public static void main(String[] args) {
        //First implementation: To get a space (not time) efficient implementation, I will:
        //1) Define two stacks beginning at the array endpoints and growing in opposite directions.
        //2) Define the third stack as starting in the middle and make it an alternating sequence for subsequent pushes
        //The resulting stack structure will be something like: Elem 6 | Elem 4 | Elem 2 | Elem 0 | Elem 1 | Elem 3 | Elem 5 |
        //And I will just define a mapping function to find the next push position
        //3) Redefine the Push op, so that when the operation is going to overwrite other stack, I will adjust the
        // middle stack accordingly by using new offset and new mapping function

        //By use the above structure, I need to store the stack top for the first two stacks, and the beginning
        // and end of the third stack in another structure.


        //Second implementation: just insert the elements sequencially and try to remember the former index for all
        // three of the stacks when you want to push another element into the stack. This way I will define a new
        // structure to store former index and the data. The array will also become the array of that data structure.
        //The problem with this implementation is: it's wasting too much space. Because the head for the three stacks
        //are always increasing
    }
}
