import scala.io.StdIn.readDouble
import scala.io.StdIn.readInt
object q6b extends App{
    print("Enter the number of subjects:\n");
    var no=readInt();
    var total=0;
    for(i<-1 to no){
        printf("\nEnter the marks of subject%d\n",i);
        var a=readInt();
        total+=a;
    }
    printf("Total marks is:%d\n",total);
    var avg:Double=total/no;
    if(avg>0){
        if(avg>39){
            if(avg>54){
                if(avg>69){
                    printf("Very Good\n");
                }else{
                    printf("Good\n");
                }
            }else{
                printf("Pass\n");
            }
        }else{
           printf("Fail\n");
        }
    }else{
        printf("Invalid Marks\n");
    }
    

}