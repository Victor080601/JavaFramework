package homework;

public class Method implements MethodInterface{
    public void method1(){
        System.out.println("method1");
    }
    public void method2(){
        System.out.println("method2");
    }
    public static void main(String args[]){
        Method obj = new Method();
        obj.method1();
    }
}
