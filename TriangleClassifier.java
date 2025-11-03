package Unit3.U3Assignments;

public class TriangleClassifier {
    public static void main(String[] args) {
        System.out.println(sideLengths(3, 4, 5));
        System.out.println(sideLengths(5, 5, 5));
        System.out.println(sideLengths(2, 2, 5));
        System.out.println(sideLengths(5, 5, 8));
        System.out.println(sideLengths(6, 8, 10));
    }

    public static String sideLengths(int a, int b, int c) {

        int a2 = a * a;
        int b2 = b * b;
        int c2 = c * c;

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                if (a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2) {
                    return "Equilateral Right Triangle";
                } else {
                    if (a2 + b2 < c2 || a2 + c2 < b2 || b2 + c2 < a2) {
                        return "Equilateral Obtuse Triangle";
                    }
                    return "Equilateral Acute Triangle";
                }
            } else {
                if (a == b || b == c || a == c) {
                    if (a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2) {
                        return "Isosceles Right Triangle";
                    } else {
                        if (a2 + b2 < c2 || a2 + c2 < b2 || b2 + c2 < a2) {
                            return "Isosceles Obtuse Triangle";
                        }
                        return "Isosceles Acute Triangle";
                    }
                }
                if (a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2) {
                    return "Scalene Right Triangle";
                } else {
                    if (a2 + b2 < c2 || a2 + c2 < b2 || b2 + c2 < a2) {
                        return "Scalene Obtuse Triangle";
                    }
                    return "Scalene Acute Triangle";
                }
            }
        }
        return "Not a valid triangle";
    }
}
