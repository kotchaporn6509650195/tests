package core;

import junit.framework.TestCase;

public class StackTestCases extends TestCase 
{
	//TC1
    public void testCreateNewEmptyStack() 
    {
        Stack s1 = new Stack(10);
        assertEquals(true,s1.isEmpty());
    }
    
    
    //TC2
    public void testTopStack() 
    {
        Stack s1 = new Stack(10);
        boolean full = s1.isFull();
        
        if(full==false)
        {
        	try 
        {
            s1.push(5);
        } 
        	catch (Exception e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        	assertEquals(5,s1.top());
        }    
    }

    
    //TC3
    public void testPushStack() 
    {
        Stack s1 = new Stack(10);

        try 
        {
            s1.push(10);
            s1.push("dw");
        } catch (Exception e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
            assertEquals("All elements in the stack must be of the same type.", e.getMessage());
        }

    }
    
    
    //TC4
    public void testLIFOStack() 
    {
        Stack s1 = new Stack(5);
        try 
        {
            s1.push(10);
            s1.push(15);
        } catch (Exception e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        assertEquals(15, s1.pop());
        assertEquals(10, s1.pop());
    }
    
    
    //TC5
    public void testFullStack() 
    {
        Stack s1 = new Stack(5);
        try 
        {
            s1.push(5);
            s1.push(5);
            s1.push(5);
            s1.push(5);
            s1.push(5);
        } 
        catch (Exception e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        assertEquals(true, s1.isFull());
    }
}