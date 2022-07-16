import scala.io.StdIn.readInt
object q2a extends App{
    print("Enter the first number:");
    var a=readInt();
    print("\nEnter the second number:");
    var b=readInt();
    if(a < b) {
        printf("\nThe largest number is %d",b);
    }else{
        printf("\nThe largest number is %d",a);
    }
    
}