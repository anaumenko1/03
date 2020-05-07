import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetClassNumber(){
        MainClass testGetClassNumber = new MainClass();
        if (testGetClassNumber.getClassNumber()>=45){
            System.out.println("All is good !");
        }
        else {
            System.out.println("Vse huynya");
        }

    }
}
