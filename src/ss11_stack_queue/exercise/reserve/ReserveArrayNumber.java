package ss11_stack_queue.exercise.reserve;

public class ReserveArrayNumber<T> {
    public static void main(String[] args) {
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        java.util.Stack<Integer> stack1 = new java.util.Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("stack ban đầu là: " + stack);
        while (!stack.isEmpty()) {
            stack1.push(stack.pop());
        }
        System.out.println("Stack sau khi đảo ngược mảng: " + stack1);


    }
}


