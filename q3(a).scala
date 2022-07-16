import scala.io.StdIn.readInt
object q3a extends App{
    print("Enter the first number:");
    var a=readInt();
    print("\nEnter the second number:");
    var b=readInt();
    print("\nEnter the third number:");
    var c=readInt();
    if(a > b) {
        if(a>c){
         printf("\nThe largest number is %d",a);
        }
    }else if(b>c){
        printf("\nThe largest number is %d",b);
    }else{
        printf("\nThe largest number is %d",c);
    }
    
}