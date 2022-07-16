//(a) a=1,b=2 (b) a=1, b=3 (c) a=2, b=3 (d) a=2, b=2
import scala.io.StdIn.readInt
object q5a extends App{
  printf("Enter the value of a:");
  var a=readInt();
  printf("\nEnter the vale of b:");
  var b=readInt();
  if (a==1){
   System.out.println("\n===");
  }
  if (b==1){ 
    System.out.println("\n***");
  }else{
    System.out.println("\n###");
  }
}