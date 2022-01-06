import java.util.*;
import java.text.*;
class f3{
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    SimpleDateFormat format_date=new SimpleDateFormat("dd/MM/yyyy");
    System.out.println("Enter date in DD/MM/YYY format");
    String date_string=sc.next();
    int num_of_days=sc.nextInt();
    try{
        Date date=format_date.parse(date_string);
        System.out.println(date);
        System.out.println(format_date.format(date));
        }catch(ParseException e){
            e.printStackTrace();
            }
    }
}