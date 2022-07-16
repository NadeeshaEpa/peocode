import scala.io.StdIn.readDouble
import scala.io.StdIn.readInt
object q8 extends App{
    printf("OPTIONS\n");
    printf("1=Celcius to Farenheit\n");
    printf("2=Farenheit to Celcius\n");
    printf("Enter option:\n");
    var op=readInt();
    if(op==1){
       printf("Enter the temperature in Celsius:");
       var cel=readDouble();
       printf("Value in farenheit:%.3f",ctf(cel));
    }else if(op==2){
       printf("Enter the temperaturein Farenheit:");
       var far=readDouble();
       printf("Value in Celcius:%.3f",ftc(far));
    }
    
    def ctf(temp:Double):Double=9*temp/5+32;
    def ftc(temp:Double):Double=(temp-32)*5/9;
        
    
}