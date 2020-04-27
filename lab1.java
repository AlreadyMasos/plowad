

        import java.util.Scanner;

public class lab1{
    public static void main(String[] args){
        boolean checkQuals = false;
        String Pts;
        String[] PtsArray;

        System.out.println("Vvedite coordinati ввв");
        Scanner input = new Scanner(System.in);

        //Ввод точек
        Pts = input.nextLine();
        PtsArray = Pts.split(" ");
        Point3d myFirstPoint = new Point3d(Double.parseDouble(PtsArray[0]), Double.parseDouble(PtsArray[1]), Double.parseDouble(PtsArray[2]));


        Pts = input.nextLine();
        PtsArray = Pts.split(" ");
        Point3d mySecondPoint = new Point3d(Double.parseDouble(PtsArray[0]), Double.parseDouble(PtsArray[1]), Double.parseDouble(PtsArray[2]));

        Pts = input.nextLine();
        PtsArray = Pts.split(" ");
        Point3d myThirdPoint = new Point3d(Double.parseDouble(PtsArray[0]), Double.parseDouble(PtsArray[1]), Double.parseDouble(PtsArray[2]));




        //Проверка равенства точек
        if (myFirstPoint.equals(mySecondPoint) || myFirstPoint.equals(myThirdPoint) || mySecondPoint.equals(myThirdPoint)){
            checkQuals = true;
            System.out.println("To4ku paBHu Dpy7-Dpy7y");
        }
        else {
            checkQuals = false;
        }

        // Вывод площади
        if (checkQuals == false){
            double sTriangle = (computeArea(myFirstPoint,mySecondPoint,myThirdPoint));
            System.out.printf("IIJIowaD Tpey7oJIHuKa:  %.2f", sTriangle);
        }

    }

    // Площадь по Геррону
    public static double computeArea(Object obj1, Object obj2, Object obj3){
        Point3d o1 = (Point3d) obj1;
        Point3d o2 = (Point3d) obj2;
        Point3d o3 = (Point3d) obj3;

        double a = o1.distanceTo(o2);
        double b = o2.distanceTo(o3);
        double c = o3.distanceTo(o1);

        double p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        return s;
    }


}
