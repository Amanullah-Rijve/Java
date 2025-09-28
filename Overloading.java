public class Overloading{
static int methodInt(int x,int y){
    return x + y;
}

static double methodDouble(double x, double y){
    return x + y;
}


public static void main(String[] args){
    int myInt = methodInt(3,5);
    double myDouble = methodDouble(4.50,8.9);
    System.out.println("int: "+ myInt);
    System.out.println("double: "+ myDouble);
}
}