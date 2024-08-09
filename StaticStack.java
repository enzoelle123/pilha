public class StaticStack {
    private int top = -1;
    private int[] data;

    public StaticStack(int size) {
        data = new int[size];
    }

    public void push(int value) {
        if (isFull()) {
            throw new StackOverflowError("A pilha está cheia");
        }
        data[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia");
        }
        return data[top--];
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void clear() {
        top = -1;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia");
        }
        return data[top];
    }

    public static void main(String[] args) {
        StaticStack stack = new StaticStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(50);

        System.out.println("Topo da pilha: " + stack.peek());

        System.out.println("Elemento removido: " + stack.pop());

        stack.clear(); 

        System.out.println("A pilha está vazia? " + stack.isEmpty());
    }
}
