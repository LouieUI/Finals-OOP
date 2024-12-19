import java.util.Scanner;


class Rectangle {
    public void showDescription() {
        System.out.println("This is a rectangle.");
    }
}


class Square {
    public void showDescription() {
        System.out.println("This is a square.");
    }
}


class Parallelogram {
    public void showDescription() {
        System.out.println("This is a parallelogram.");
    }
}


class Rhombus {
    public void showDescription() {
        System.out.println("This is a rhombus.");
    }
}


class Trapezoid {
    public void showDescription() {
        System.out.println("This is a trapezoid.");
    }
}

public class RunQuad {
    public static void main(String[] args) {
        
        System.out.print("Press R for Rectangle, S for Square, P for Parallelogram, H for Rhombus, T for Trapezoid: ");
        
        
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);
        
        switch (choice) {
            case 'R':
                Rectangle rectangle = new Rectangle();
                rectangle.showDescription();
                break;
            case 'S':
                Square square = new Square();
                square.showDescription();
                break;
            case 'P':
                Parallelogram parallelogram = new Parallelogram();
                parallelogram.showDescription();
                break;
            case 'H':
                Rhombus rhombus = new Rhombus();
                rhombus.showDescription();
                break;
            case 'T':
                Trapezoid trapezoid = new Trapezoid();
                trapezoid.showDescription();
                break;
            default:
                System.out.println("Invalid choice. Please select R, S, P, H, or T.");
        }
        
        
    }
}




