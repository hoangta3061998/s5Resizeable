public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(6);
        shapes[1] = new Rectangle(3,4);
        shapes[2] = new Square(5);
        System.out.println("Before:");
        for(int i = 0; i < shapes.length ; i++){
            System.out.println(shapes[i]);
        }
        for(int i = 0 ; i < shapes.length ; i++){
            shapes[i].resize(Math.random()*100);
        }
        System.out.println("After:");
        for(int i = 0 ; i < shapes.length;i++){
            System.out.println(shapes[i]);
        }
    }
}
