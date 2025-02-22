import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tạo danh sách điểm ban đầu
        List<Point> initialPoints = new ArrayList<>();
        initialPoints.add(new Point(1, 2));
        initialPoints.add(new Point(3, 4));

        // Khởi tạo PolyLine với danh sách điểm
        PolyLine polyline = new PolyLine(initialPoints);

        // Thêm điểm mới
        polyline.appendPoint(5, 6);
        polyline.appendPoint(new Point(7, 8));

        // In thông tin PolyLine
        System.out.println("Polyline: " + polyline);
        System.out.println("Total Length: " + polyline.getLength());
    }
}
