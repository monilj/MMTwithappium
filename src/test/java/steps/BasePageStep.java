package steps;

import cucumber.api.java.Before;
import driverClass.DriverClass;

public class BasePageStep extends DriverClass{
    @Before
    public void beforeScenario() throws InterruptedException {


        if (null == driver) {
            driver = getAndoridDriver();
        }
    }

 //   @After
//    public void afterScenario(Scenario scenario) {
//        if (null != driverClass) {
//            destroyDriver();
//        }
//    }


}
