public class U2L2Runner {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(150, 200);
        rect.setWidth(125);
        System.out.println("The parameter for this rectangle is " + rect.parameters()+ ".");
        rect.printRectangleInfo();

        Rectangle rect1 = new Rectangle(100);
        rect1.setWidth(125);
        System.out.println("The parameter for this rectangle is " + rect1.parameters()+ ".");
        rect1.printRectangleInfo();

        Rectangle rect2 = new Rectangle();
        rect2.setWidth(125);
        System.out.println("The parameter for this rectangle is " + rect2.parameters()+ ".");
        rect2.printRectangleInfo();

    }
}
