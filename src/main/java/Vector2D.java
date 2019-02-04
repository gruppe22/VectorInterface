public class Vector2D implements IVector,Comparable {
    private double xCoordinate;
    private double yCoordinate;

    public Vector2D(double x, double y ){
        yCoordinate = y;
        xCoordinate = x;
    }

    public String toString(){
        return "Coordinates:"+ xCoordinate + ", " + yCoordinate + " . ";
    }

    public IVector times(double k){
        double x =  xCoordinate * k;
        double y = yCoordinate * k;
        return new Vector2D(x,y);
    }

    public IVector add(IVector v) {
        double x = this.xCoordinate + v.getXcoordinate();
        double y = this.yCoordinate + v.getYcoordinate();
        return new Vector2D(x, y);
    }

    public boolean equals(IVector v) {
        if(this.xCoordinate == v.getXcoordinate() && this.yCoordinate == v.getYcoordinate()) {
            return true;
        }
        else {
            return false;
        }
    }

    public double getXcoordinate() {
        return xCoordinate;
    }

    public double getYcoordinate() {
        return yCoordinate;
    }

    public double getLength() {
        return Math.sqrt(xCoordinate*xCoordinate + yCoordinate*yCoordinate);
    }

    public int compareTo(Object o) {
        IVector v = (IVector) o;
        if (v.getXcoordinate() == this.getXcoordinate() && v.getYcoordinate() == this.getYcoordinate()){
         return 0;
        }
        else if(v.getLength() > this.getLength()){
            return -1;
        }
        else{
            return 1;
        }
    }
}
