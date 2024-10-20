import java.util.*;
class Rainfall{
    public static void main(String args[]){

     int[] rainfall=new int [7];
     Scanner read = new Scanner(System.in);
     int count=0;
          int avg=0;
        for(int i = 0;i <7; i++){
            System.out.println("Enter todays rainfall in mm");
            rainfall[i]=read.nextInt();
            avg+=rainfall[i];
            count++;
        }

            System.out.println("The highet rainfall : ");
                int temp=0;
           
                for(int m:rainfall){
                    if(m > temp){
                       temp=m;
                       
                    }
                }
                System.out.println(temp);

                    System.out.println("Avaerage rainfall");
                    System.out.println(avg/count);

 }
}