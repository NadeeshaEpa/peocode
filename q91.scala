import scala.io.StdIn.readInt
object q8 extends App{
   def main(args: Array[String]):Unit{
       printf("OPTIONS\n");
       printf("1=Add two numbers\n");
       printf("2=Substract two numbwers\n");
       printf("3=Multiply two numbers\n");
       printf("4=Divide two numbers\n");
       printf("Enter option:\n");
       var op=readInt();
       if(op==1){
           printf("Enter the first number:\n");
           var a=readInt();
           printf("Enter the second number:\n");
           var b=readInt();
           println("Adition of %d and %d:%d",a,b,add(a,b));
       }else if(op==2){
           printf("Enter the first number:\n");
           var a=readInt();
           printf("Enter the second number:\n");
           var b=readInt();
           println("Substraction of %d and %d:%d",a,b,sub(a,b));
       }else if(op==3){
           printf("Enter the first number:\n");
           var a=readInt();
           printf("Enter the second number:\n");
           var b=readInt();
           println("Multiplication of %d and %d:%d",a,b,mul(a,b));
       }else if(op==4){
           printf("Enter the first number:\n");
           var a=readInt();
           printf("Enter the second number:\n");
           var b=readInt();
           println("Division of %d and %d:%d",a,b,div(a,b));
       }else{
           printf("wrong option\n")
       }
   }
   
   def add(a:Int,b:Int):Int=a+b;
   def sub(a:Int,b:Int):Int=a-b;
   def mul(a:Int,b:Int):Int=a*b;
   def div(a:Int,b:Int):Double=a/b;
 
}