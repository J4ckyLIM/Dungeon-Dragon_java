import java.io.IOException;

public class Test {
    public static void main (String [] args){
        String chaineNull = null;
        try{
            throwException();
        }catch (IOException | NullPointerException e){
            System.out.println("La méthode a renvoyé une exception");
        }catch (Exception e){
            System.out.println("Autre Chose");
        }finally {
            System.out.println("and finally");
        }
    }
    private static void throwException() throws IOException{
        throw new IOException();
    }
}

