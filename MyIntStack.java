public class MyIntStack {
        private int[] stack;   // Mảng lưu trữ phần tử
        private int top;       // Chỉ số đỉnh của stack
        private int capacity;  // Dung lượng của stack

        // Constructor: Khởi tạo stack với kích thước tối đa
        public MyIntStack(int capacity) {
            this.capacity = capacity;
            stack = new int[capacity];
            top = -1; // Stack rỗng ban đầu
        }

        // Kiểm tra stack có rỗng không
        public boolean isEmpty() {
            return top == -1;
        }

        // Kiểm tra stack có đầy không
        public boolean isFull() {
            return top == capacity - 1;
        }

        // Thêm một phần tử vào stack (Push)
        public void push(int value) {
            if (isFull()) {
                System.out.println("Stack is full! Cannot push " + value);
                return;
            }
            stack[++top] = value;
        }

        // Lấy phần tử trên đỉnh stack và xóa nó (Pop)
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty! Cannot pop.");
                return -1; // Giá trị mặc định nếu stack rỗng
            }
            return stack[top--];
        }

        // Xem phần tử trên đỉnh stack mà không xóa nó (Peek)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty! Cannot peek.");
                return -1;
            }
            return stack[top];
        }

        // Hiển thị toàn bộ stack
        public void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return;
            }
            System.out.print("Stack (top -> bottom): ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }


