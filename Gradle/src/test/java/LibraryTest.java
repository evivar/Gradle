/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
    
    @Test
    public void testSumaQueVaAFallar() {
    	int a = 0;
    	int b = 0;
    	Library classUnderTest = new Library();
    	assertEquals(1, classUnderTest.suma(a,  b));
    }
}
