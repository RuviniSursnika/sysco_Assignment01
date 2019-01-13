package com.sysco.Assignment.utils;

import com.syscolab.qe.core.reporting.SyscoLabListener;
import com.syscolab.qe.core.reporting.SyscoLabQCenter;
import com.syscolab.qe.core.reporting.SyscoLabReporting;
import com.sysco.Assignment.common.Constants;
import com.syscolab.qe.core.ui.SyscoLabCapabilityUtil;
import org.apache.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.annotations.*;

@Listeners(SyscoLabListener.class)
public class TestBase {
    private SyscoLabListener testListeners;
    private SyscoLabQCenter syscoLabUIOgm;

    @BeforeClass
    public void init() {

        testListeners = new SyscoLabListener();
        syscoLabUIOgm = new SyscoLabQCenter();
    }

    @BeforeTest
    public void beforeTest() {
        PageBase.launchPageBase();
        System.out.println("Test Running " + this.getClass().toString());
    }

    @AfterTest
    public void afterTest(){
        PageBase.quitBrowser();
    }

    @AfterClass(alwaysRun = true)
    public void cleanUp(ITestContext iTestContext) {
        try {
            syscoLabUIOgm.setProjectName(Constants.TEST_PROJECT);
            syscoLabUIOgm.setEnvironment(Constants.TEST_ENV);

            syscoLabUIOgm.setRelease(Constants.TEST_RELEASE);
            syscoLabUIOgm.setModule(iTestContext.getAttribute("feature").toString());
            syscoLabUIOgm.setFeature(iTestContext.getAttribute("feature").toString());
            syscoLabUIOgm.setClassName(iTestContext.getClass().getName());

            if (Constants.UPDATE_DASHBOARD)
                SyscoLabReporting.generateJsonFile(SyscoLabListener.getResults(), syscoLabUIOgm);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
