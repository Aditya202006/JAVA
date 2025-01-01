// Write a JAVA program to implement constructor overloading

class Constructorover{
  Constructorover(int a, int b){
    System.out.println("Multiplication of a,b values :"+(a*b));
   }
  Constructorover(int a, int b,int c){
    System.out.println("Multiplication of a,b,c values :"+(a*b*c));
   }
public static void main(String args[]){
  Constructorover x=new Constructorover(3,15);
  Constructorover y=new Constructorover(4,2,6);
 }
}

/*
output : Multiplication of a,b values :45
         Multiplication of a,b,c values :48
*/
