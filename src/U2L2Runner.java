public class U2L2Runner {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(150, 200);
        rect.setWidth(125);
        rect.parameters();
        rect.printRectangleInfo();

        Rectangle rect1 = new Rectangle(100);
        rect1.setWidth(125);
        int parameter2 = 2 * rect1.getWidth() + 2 * rect1.getLength();
        rect1.printRectangleInfo();

        Rectangle rect2 = new Rectangle();
        rect2.setWidth(125);
        int parameter3 = 2 * rect2.getWidth() + 2 * rect2.getLength();
        rect2.printRectangleInfo();

    }
}
