import scala.io.StdIn.readInt
object q4 extends App{
    print("Enter the first number:");
    var a=readInt();
    if(a%2==0){
        printf("\n%d is an even number\n",a);
    }else{
        printf("\n%d is an odd number",a);
    }
    
}