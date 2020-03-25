import java.util.*;
public class TDD-junit{
public static void main(String args[])
{

Scanner scanner_object=new Scanner(System.in);
String input_string;
String answer_string="";
try{
input_string=scanner_object.next();

if(input_string.length()>=2){

if(input_string.charAt(0)!='A'){
answer_string+=Character.toString(input_string.charAt(0));
}
if(input_string.charAt(1)!='A'){
answer_string+=Character.toString(input_string.charAt(1));
}
for(int i=2;i<input_string.length();i++)
answer_string+=Character.toString(input_string.charAt(i));

}


else if(input_string.length()==1){
if(input_string!="A"){
answer_string=input_string;
}
}
}
catch(Exception e){
    
   System.out.println("Empty String is given as input"); 
    
}
System.out.println(answer_string);


}
}