import scala.io.StdIn.readInt
object q1a extends App{
    print("Enter a number:");
    var a=readInt();
    var absVal = if(a < 0) -a else a
    printf("\nThe value is %d",absVal);
    
}