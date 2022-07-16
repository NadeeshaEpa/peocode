import scala.io.StdIn.readInt
import scala.io.StdIn.readDouble
object q9 extends App{
       println("OPTIONS\n");
       println("1=Add two numbers\n");
       println("2=Substract two numbwers\n");
       println("3=Multiply two numbers\n");
       println("4=Divide two numbers\n");
       printf("Enter option:\n");
       var op=readInt();
       if(op==1){
           printf("Enter the first number:\n");
           var a=readInt();
           printf("Enter the second number:\n");
           var b=readInt();
           printf("Adition of %d and %d:%d",a,b,add(a,b));
       }else if(op==2){
           printf("Enter the first number:\n");
           var a=readInt();
           printf("Enter the second number:\n");
           var b=readInt();
           printf("Substraction of %d and %d:%d",a,b,sub(a,b));
       }else if(op==3){
           printf("Enter the first number:\n");
           var a=readInt();
           printf("Enter the second number:\n");
           var b=readInt();
           printf("Multiplication of %d and %d:%d",a,b,mul(a,b));
       }else if(op==4){
           printf("Enter the first number:\n");
           var a=readDouble();
           printf("Enter the second number:\n");
           var b=readDouble();
           printf("Division of %.2f and %.2f:%.3f",a,b,div(a,b));
       }else{
           printf("wrong option\n")
       }
   
   
   def add(a:Int,b:Int):Int=a+b;
   def sub(a:Int,b:Int):Int=a-b;
   def mul(a:Int,b:Int):Int=a*b;
   def div(a:Double,b:Double):Double=a/b;
}