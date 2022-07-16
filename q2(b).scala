import scala.io.StdIn.readInt
object q2b extends App{
    print("Enter the first number:");
    var a=readInt();
    print("\nEnter the second number:");
    var b=readInt();
    var absVal = if(a < b) b else a     //scala does not has a ternary operator.
    printf("\nThe largest number is %d",absVal);
    
}