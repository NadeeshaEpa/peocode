import scala.io.StdIn.readInt
object q3b extends App{
    print("Enter the first number:");
    var a=readInt();
    print("\nEnter the second number:");
    var b=readInt();
    print("\nEnter the third number:");
    var c=readInt();
    var absVal = if(a < b) (if(b>c) b else if(a>c) a else c)
    printf("\nThe largest number is %d",absVal);
    
}