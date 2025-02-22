public class Main {
    public static void main(String[] args) {
        MyIntStack stack = new MyIntStack(5); // Tạo stack với dung lượng 5

        // Thêm phần tử vào stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60); // Stack đầy, không thể push

        stack.display(); // In stack

        // Xem phần tử đỉnh (peek)
        System.out.println("Top element: " + stack.peek());

        // Lấy phần tử ra khỏi stack (pop)
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        stack.display(); // In stack sau khi pop

        // Kiểm tra stack rỗng
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
