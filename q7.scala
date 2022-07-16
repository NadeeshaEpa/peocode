import scala.io.StdIn.readInt
object q7 extends App{
    print("Enter the number of the month:\n");
    var no=readInt();
    if(no==12||no==1 || no==2){
        printf("Winter\n");
    }else if(no==3||no==4|| no==5){
        printf("Spring\n");
    }else if(no==6||no==7|| no==8){
        printf("Summer\n");
    }else if(no==9||no==10|| no==11){
        printf("Autumn\n");
    }else{
        printf("Bogus month");
    }
    

}