package gfg;

import java.util.Scanner;

public class Rectangle_overlap {

    public static class Rectangle{
        int x,y;
        public Rectangle(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter 1");
        Rectangle r1 = new Rectangle(S.nextInt(), S.nextInt());
        System.out.println("Enter 2");
        Rectangle l1 = new Rectangle(S.nextInt(), S.nextInt());
        System.out.println("Enter 3");
        Rectangle r2 = new Rectangle(S.nextInt(), S.nextInt());
        System.out.println("Enter 4");
        Rectangle l2 = new Rectangle(S.nextInt(), S.nextInt());
        S.close();
        if(isOverlap(r1, l1, r2, l2)) {
            System.out.println("Rectangles overlap");
        } else {
            System.out.println("Rectangles do not overlap");
        }
    }
    public static boolean isOverlap(Rectangle r1, Rectangle l1, Rectangle r2, Rectangle l2){

        if(l1.x >= r2.x || l2.x >= r1.x) {
            return false; // No overlap in x-axis
        }
        if(l1.y >= r2.y || l2.y >= r1.y) {
            return false; // No overlap in y-axis
        }
        return true; // Overlap exists
    }
}
