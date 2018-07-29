import java.util.*;

public class Triangle {

    private List<Integer> sides;

    public Triangle(int side1, int side2, int side3) {
        sides = Arrays.asList(side1, side2, side3);
        Collections.sort(sides);
    }

    public int perimeter() {
        return this.sides.stream().mapToInt(side -> side).sum();
    }

    public boolean isRightAngled() {
        return Math.pow(sides.get(0), 2) + Math.pow(sides.get(1), 2)
                == Math.pow(sides.get(2), 2);
    }
}
