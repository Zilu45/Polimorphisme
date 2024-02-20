
package Abstrak;

public class triangle extends Shape {
     private float base;
    private float height;

    public triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    
    @Override
    float getArea() {
        return 0.5f * base * height;
    }
    
}
