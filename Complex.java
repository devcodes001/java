



import java.util.Scanner;
class Complex{
    int real,img;
    void getData(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the real part:");
       real = sc.nextInt();
       System.out.print("Enter imaginary part:");
       img = sc.nextInt();
      }
   void add(Complex c1,Complex c2){
      real = c1.real + c2.real;
      img = c1.img + c2.img;
      System.out.println("Sum = "+real +"+"+img+"i");
     }
  public static void main(String[] args)
  {
    Complex c1 = new Complex();
    Complex c2 = new Complex();
    Complex result = new Complex();
    c1.getData();
    c2.getData();
    result.add(c1,c2);
 }
}































