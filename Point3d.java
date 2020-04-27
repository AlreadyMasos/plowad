public class Point3d extends Point2d{

    private double xCoord;
    private double yCoord;
    private double zCoord;

    public Point3d(double x, double y, double z)
    {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    public Point3d(){
        this(0.0,0.0,0.0);
    }

    public void setZ(double val){
        zCoord = val;
    }

    public double getZ(){
        return zCoord;
    }


    public double distanceTo(Object obj){
        Point3d point = (Point3d)obj;

        return Math.sqrt((point.xCoord - this.xCoord)*(point.xCoord - this.xCoord) + (point.yCoord - this.yCoord)*(point.yCoord - this.yCoord)
                + (point.zCoord - this.zCoord)*(point.zCoord - this.zCoord));

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass())
            return false;
        Point3d p = (Point3d)obj;
        return this.xCoord == p.xCoord && this.yCoord == p.yCoord && this.zCoord == p.zCoord;
    }

}