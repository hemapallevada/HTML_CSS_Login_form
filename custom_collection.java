import java.util.*;  
class MyClass{  
    public static List myList(Object[] object_list) {  
        return new ArrayList(object_list);  
    }  
}  
class ArrayList extends AbstractList implements java.io.Serializable {  
    public Object[] object_list;  
    ArrayList(Object[] array) {  
        object_list = array;  
    }  
    public Object get(int index) {  
        return object_list[index];  
    }  
    public Object set(int index, Object element) {  
        Object oldVal = object_list[index];  
        object_list[index] = element;  
        return oldVal;  
    }  
    public int size() {  
        return object_list.length;  
    }  
    public void print_list(List list){
        System.out.println("The list is: " + list); 
    }
   
}  
public class HelloWorld {  
    public static void main(String[] args) {  
        try {  
            String string_list[] = {  
               "a","b","c","d","e","f","g","h","i","j","k"
            };  
            Object object;  
            int i = 0;  
            MyClass MyClass_object = new MyClass();  
            List list = MyClass_object.myList(string_list);  
             
            ArrayList array_list = new ArrayList(string_list);  
            object = array_list.get(1);  
            System.out.println("The retrieved element is: " + object);  
            String s1 = "Collection";  
            object = array_list.set(2, s1);  
             
            System.out  
                .println("The set element in place of Implementation is: "  
                    +  
                    s1);  
           array_list.print_list(list); 
            i = array_list.size();  
            System.out.println("The size of the array list is: " + i);  
        } catch (Exception e) {  
        }  
    }  
}