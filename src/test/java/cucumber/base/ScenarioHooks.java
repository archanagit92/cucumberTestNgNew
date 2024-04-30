package cucumber.base;


import java.net.MalformedURLException;

import io.cucumber.java.Before;


public class ScenarioHooks {


	@Before
	public static void browerserInitialization()
			throws MalformedURLException {

		System.out.println("this is before Method");
		BroweserInitialization.browerserInitializatio();

	}

}
