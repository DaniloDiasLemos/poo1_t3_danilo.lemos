import java.lang.Math;
public class Tetraedro extends FormaTridimensional {
    public double getArea(double l) {
        return (l * l) * Math.sqrt(3);
    }

    public double getVolume(double pi, double aBase, double h) {
        return (1 / 3) * aBase * h;
    }
    
}
