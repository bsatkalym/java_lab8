package sbs_junit;

import org.junit.Test;
import static org.junit.Assert.*;

import static javafxapplication.FXMLDocumentController.equation;

public class JUnitTest {
        
    @Test
    public void test1FXML() throws Exception {
        assertTrue(equation(0, -256, 8) == 0.00);
        assertTrue(equation(10, 10, 10) == 25.50);
    }
    
    @Test
    public void test2FXML() throws Exception {
        assertTrue("Проверка деления ", equation(10, 0, 5) == 50.00);
    }

}
