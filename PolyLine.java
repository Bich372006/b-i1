import java.util.ArrayList;
import java.util.List;

    public class PolyLine {
        private List<Point> points = new ArrayList<>();

        // Constructor mặc định
        public PolyLine() {
        }

        // Constructor nhận danh sách các điểm
        public PolyLine(List<Point> points) {
            this.points = new ArrayList<>(points);
        }

        // Thêm một điểm bằng tọa độ x, y
        public void appendPoint(int x, int y) {
            points.add(new Point(x, y));
        }

        // Thêm một đối tượng Point
        public void appendPoint(Point point) {
            points.add(point);
        }

        // Tính tổng độ dài các đoạn thẳng
        public double getLength() {
            double length = 0.0;
            for (int i = 1; i < points.size(); i++) {
                Point p1 = points.get(i - 1);
                Point p2 = points.get(i);
                length += Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
            }
            return length;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            for (Point p : points) {
                sb.append(p.toString());
            }
            sb.append("}");
            return sb.toString();
        }
    }


