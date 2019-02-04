public interface IVector {
    String toString();
    IVector times(double k);
    IVector add(IVector v);
    boolean equals(IVector v);
    double getXcoordinate();
    double getYcoordinate();
}
