package demo;

public class ParameterizationTest {

	public void m2()
	{
		String BROWSER = System.getProperty("browser");
	    String URL = System.getProperty("url");
	
	System.out.println(BROWSER);
	System.out.println(URL);
	}
}
