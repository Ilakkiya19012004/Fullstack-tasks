class Shape {
    public void getArea(double a,double b){
        System.out.println("0");
    }
 }
 
 class Circle extends Shape{
     public Circle(double a,double b){
         getArea( a, b);
     }
     public void getArea(double a,double b){
        System.out.println(a*b*b);
    }
 }
 class Rectangle extends Shape{
     public Rectangle(double a,double b){
         getArea( a, b);
     }
     public void getArea(double a,double b){
        System.out.println(a*b);
    }
 }
 class Main{
     public static void main(String[]ar){
         Circle circle=new Circle(3.14,3.0);
         Rectangle rectangle=new Rectangle(3.0,6.0);
         
     }
 }
 