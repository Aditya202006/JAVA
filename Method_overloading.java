// Write a JAVA program to implement method overloading

class Over{
  void mul(int a,int b){
   System.out.println("Multiplication of a,b is :"+(a*b));
  }
  void mul(int a,int b,int c){
   System.out.println("Multiplication of a,b,c is :"+(a*b*c));
  }
 public static void main(String args []){
    Over a=new Over();
    a.mul(4,5);
    a.mul(2,4,5);
  }
 }

/*
output : Multiplication of a,b is :20
         Multiplication of a,b,c is :30
*/
