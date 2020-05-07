import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetClassString(){
        MainClass testGetClassString = new MainClass();
        String hello=testGetClassString.getClassString();
        int index1 = hello.indexOf("Hello");
        int index2 = hello.indexOf("hello");
        if (index1 !=-1 || index2 != -1 ){
            System.out.println("All is good !");
        }
        else {
            System.out.println("Vse huynya");
        }

    }
}
