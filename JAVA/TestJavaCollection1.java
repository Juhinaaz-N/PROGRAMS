import java.util.*;
class TestJavaCollection1{
public static void main(String args[]){
ArrayList<String> list=new ArrayList<String>();
list.add("Juhi");
list.add("Sri");
list.add("Jahara");
list.add("Santhiya");
list.add("JuhiSri");
Iterator itr=list.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}
