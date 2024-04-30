package cucumber.base;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class SetUp {
@BeforeClass
	public static void beforeMethod()
	{
		System.out.println("this is beforeMethod");
	}
}
