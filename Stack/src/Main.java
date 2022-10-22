public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.contains(3));

        stack.remove(1);

        System.out.println(stack.contains(3));

        System.out.println(stack.peek());
        System.out.println(stack.get(1));
    }
}