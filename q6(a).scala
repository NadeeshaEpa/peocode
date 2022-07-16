import scala.io.StdIn.readDouble
import scala.io.StdIn.readInt
object q6a extends App{
    print("Enter the number of subjects:\n");
    var no=readInt();
    var total=0;
    for(i<-1 to no){
        printf("\nEnter the marks of subject%d\n",i);
        var a=readInt();
        total+=a;
    }
    printf("Total marks is:%d",total);
    var avg:Double=total/no;
    if(avg>69.0){
        printf("\nVery Good");
    }else if(avg>54.0){
        printf("\nGood");
    }else if(avg>39.0){
        printf("\nPass");
    }else if(avg>0){
        printf("\nFail");
    }else{
        printf("\nInvalid Marks");
    }
}