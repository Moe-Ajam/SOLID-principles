class Rectangle {
    protected int width, height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
               "width=" + width +
               ", height=" + height +
               '}';
    }
}

class Square extends Rectangle
{
    public Square(){}

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    public Square(int size){
        width = height = size;
    }
}

class Demo2
{
    static void useIt(Rectangle r){
        int width = r.getWidth();
        r.setHeight(10);
        // area = width * 10
        System.out.println(
                "Expect area of " + (width * 10) + ", got " + r.getArea()
        );
    }

    public static void main(String[] args) {
        Rectangle rc = new Rectangle(2, 3);
        useIt(rc);
        Square sq = new Square();
        sq.setWidth(5);
        useIt(sq);
    }
}