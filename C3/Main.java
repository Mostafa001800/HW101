package C3;

public class Main {
    public static void someMethod(){
        try {
            someMethod2();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public static void someMethod2() throws Exception {
        throw new Exception("WWWWWWWWWWWWWWWW");
    }



    public static void main(String[] args) {
        try {
            someMethod();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
