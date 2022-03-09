package src.geometries;

import src.primitives.Point;
import src.primitives.Ray;
import src.primitives.Vector;

/**
 * A tube is a cylinder with a circular cross section
 * @author David Ochana & Aviad Klein
 */
public class Tube implements Geometry {
    final Ray axisRay;
    final double radius;

    public Tube(Ray axisRay, double radius) {
        if(radius<=0)
            throw new IllegalArgumentException("This radius unlegal!");

        this.axisRay = axisRay;
        this.radius = radius;
    }

    @Override
    public Vector getNormal(Point point) {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Tube)) return false;

        Tube tube = (Tube) o;


        return this.axisRay.equals(tube.axisRay)&&this.radius==tube.radius;
    }



    @Override
    public String toString() {
        return "Tube{" +
                "axisRay=" + axisRay +
                ", radius=" + radius +
                '}';
    }

    /**
     * Get the radius of the circle
     *
     * @return The radius of the circle.
     */
    public Double getRadius() {
        return radius;
    }

    /**
     * Returns the ray that is used to determine the axis of rotation
     *
     * @return The axisRay is being returned.
     */
    public Ray getAxisRay() {
        return axisRay;
    }
}
