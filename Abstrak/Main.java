package Abstrak;

public class Main {
     public static void main(String[] args) {
        // membuat objek dari class Triangle
        Shape segitiga = new triangle(3, 6);

        // membuat objek dari class Circle
        Shape lingkaran = new Circle(20);
        
        System.out.println("Luas Segitiga: " + segitiga.getArea());
        System.out.println("Luas Lingkaran: " + lingkaran.getArea());
    }
}
