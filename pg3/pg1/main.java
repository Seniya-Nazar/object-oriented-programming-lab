package pg1;

import java.util.Scanner;

class Shapes
{
  public float area(float l, float b)
  {
    return l*b;
  }
  public float area(float r)
  {
    return 3.14f*r*r;
  }
  public float area(float l, float b, float h)
  {
    return (l*b)+(b*h)+(l*h);
  }
}

public class main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    Shapes obj = new Shapes();
    int ch;
    float l, b, r, h;
    do{
      System.out.print("ENTER 1: RECTANGLE, 2: CIRCLE, 3: CUBOID : ");
      ch = s.nextInt();
      switch(ch)
      {
        case 0:
          break;
        case 1:
          System.out.println("ENTER LENGTH AND BREADTH: ");
          l = s.nextFloat();
          b = s.nextFloat();
          System.out.println("Area: " + obj.area(l, b));
          break;
        case 2:
          System.out.println("ENTER RADIUS: ");
          r = s.nextFloat();
          System.out.println("Area: " + obj.area(r));
          break;
        case 3:
          System.out.println("ENTER LENGTH, BREADTH AND HEIGHT: ");
          l = s.nextFloat();
          b = s.nextFloat();
          h = s.nextFloat();
          System.out.println("Area: " + obj.area(l, b, h));
          break;
        default:
          System.out.println("WRONG OPTION!");
      }
    }while(ch != 0);
  }
}