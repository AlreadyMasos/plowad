

public class Point2d{

    private double xCoord;
    private double yCoord;
    public Point2d(double x, double y){
        xCoord = x;
        yCoord = y;
    }
    public Point2d(){
        this(0,0);
    }
    public double getX(){
        return xCoord;
    }
    public double getY(){
        return yCoord;
    }
    public void setX(double val){
        xCoord = val;
    }
    public void setY(double val){
        yCoord = val;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass())
            return false;
        Point2d p = (Point2d)obj;
        return this.xCoord == p.xCoord && this.yCoord == p.yCoord;
    }


}	



