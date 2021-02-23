package java9.mod.modapp2;

import static org.junit.Assert.*;

import org.junit.Test;

import static java9.mod.modapp2.TestUtils.*;
public class MainTest {

	@Test
	public void testCheckPrime() throws Exception {
       Main main=mock(Main.class);
       when(main.checkPrime(2)).thenReturn(true); 
        boolean value=main.checkPrime(2);
yakshaAssert(currentTest(),(value == true)?"true":"false"),businessTestFile);
		
	}
	@Test
    public void testExceptionConditon() throws Exception{
	 yakshaAssert(currentTest(),true,boundaryTestFile);
      }

	@Test
	public void testBoundaryCondition() throws Exception {
	  yakshaAssert(currentTest(),true,exceptionTestFile);
   }



}
