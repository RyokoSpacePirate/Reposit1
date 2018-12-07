public class Somebody{
String name;
Somebody(String name){
this.name = name;
}
public void saySomething(){
System.out.println("Its-a me - Mario!");
}
public static void main (String[] args){
Somebody somebody = new Somebody("Mario");
somebody.saySomething();
}
}