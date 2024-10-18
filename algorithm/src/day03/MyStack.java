package day03;

import java.util.ArrayList;

public class MyStack<T> {
    private ArrayList<T> stack;

    public MyStack() {
        stack = new ArrayList<>();
    }

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("스택이 비어 있습니다.");
        }
        return stack.remove(stack.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("스택이 비어 있습니다.");
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("스택 크기: " + stack.size());  // 출력: 3
        System.out.println("최상위 요소: " + stack.peek());  // 출력: 30

        System.out.println("팝한 요소: " + stack.pop());  // 출력: 30
        System.out.println("팝한 요소: " + stack.pop());  // 출력: 20

        System.out.println("스택이 비어 있는가? " + stack.isEmpty());  // 출력: false

        stack.pop();  // 10 제거
        System.out.println("스택이 비어 있는가? " + stack.isEmpty());  // 출력: true
    }
}
