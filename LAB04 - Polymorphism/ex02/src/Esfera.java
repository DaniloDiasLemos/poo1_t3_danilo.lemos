public class Esfera extends FormaTridimensional {
    public double getArea(double pi, double r) {
        return (4 * pi) * (r * r);
    }

    public double getVolume(double pi, double r) {
        return (4 / 3) * pi * (r * r * r);
    }
    
}
