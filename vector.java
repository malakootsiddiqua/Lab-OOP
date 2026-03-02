import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

class NumericVector implements Cloneable, Iterable<Double> {

    private List<Double> elements;

    // Default constructor → creates empty vector
    public NumericVector() {
        elements = new ArrayList<>();
    }

    // Constructor with initial values (defensive copy)
    public NumericVector(List<Double> data) {
        elements = new ArrayList<>(data); 
        // Copying list so external changes don't affect this object
    }

    // Add single value at end
    public void append(double value) {
        elements.add(value);
    }

    // Get value at index
    public double valueAt(int index) {
        return elements.get(index);
    }

    // Update value at index
    public void update(int index, double newValue) {
        elements.set(index, newValue);
    }

    // Return dimension of vector
    public int dimension() {
        return elements.size();
    }

    // Vector addition
    public NumericVector plus(NumericVector other) {
        if (dimension() != other.dimension()) {
            throw new IllegalArgumentException("Dimensions must match");
        }

        List<Double> result = new ArrayList<>();

        for (int i = 0; i < dimension(); i++) {
            result.add(valueAt(i) + other.valueAt(i));
        }

        return new NumericVector(result);
    }

    // Vector subtraction
    public NumericVector minus(NumericVector other) {
        if (dimension() != other.dimension()) {
            throw new IllegalArgumentException("Dimensions must match");
        }

        List<Double> result = new ArrayList<>();

        for (int i = 0; i < dimension(); i++) {
            result.add(valueAt(i) - other.valueAt(i));
        }

        return new NumericVector(result);
    }

    // Dot product
    public double dot(NumericVector other) {
        if (dimension() != other.dimension()) {
            throw new IllegalArgumentException("Dimensions must match");
        }

        double sum = 0;

        for (int i = 0; i < dimension(); i++) {
            sum += valueAt(i) * other.valueAt(i);
        }

        return sum;
    }

    // Cross product (only for 3D vectors)
    public NumericVector cross(NumericVector other) {

        if (dimension() != 3 || other.dimension() != 3) {
            throw new IllegalArgumentException("Cross product requires 3D vectors");
        }

        double a1 = valueAt(0);
        double b1 = valueAt(1);
        double c1 = valueAt(2);

        double a2 = other.valueAt(0);
        double b2 = other.valueAt(1);
        double c2 = other.valueAt(2);

        List<Double> result = new ArrayList<>();

        result.add(b1 * c2 - c1 * b2); // x-component
        result.add(c1 * a2 - a1 * c2); // y-component
        result.add(a1 * b2 - b1 * a2); // z-component

        return new NumericVector(result);
    }

    // Create deep copy
    @Override
    public NumericVector clone() {
        return new NumericVector(elements);
    }

    @Override
    public String toString() {
        return elements.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof NumericVector)) return false;

        NumericVector other = (NumericVector) obj;
        return Objects.equals(this.elements, other.elements);
    }
