package C2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public  static void io() throws IOException {
        throw  new IOException("IOException");
    }
    public static void main(String[] args) {
try{
    if(5+5!=11){
        throw new ExceptionB("AA");
    }
    io();
}catch (NullPointerException e) {
    e.printStackTrace();
}catch (IOException ioException){
ioException.printStackTrace();
} catch (ExceptionB exceptionB){
    exceptionB.printStackTrace();
} catch (ExceptionA exceptionA){
    exceptionA.printStackTrace();
}

       /* String ptr = null;
        try
        {
            if (ptr.equals("gfg"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.err.println();
            System.out.println("          NullPointerException            ");
            System.out.println("............................................");
        }

        try {
            throw new ExceptionB("ExceptionB\n" +
                    "..........................................");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            throw new ExceptionA("ExceptionA\n" +
                    "..........................................");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
                FileReader fileReader = new FileReader("AAA");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
*/
    }
}
