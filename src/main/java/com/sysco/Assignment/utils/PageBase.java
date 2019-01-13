package com.sysco.Assignment.utils;

import com.sysco.Assignment.common.Constants;
import com.sysco.Assignment.utils.DriverSetUpUtil;
import com.sysco.Assignment.common.Constants;
import com.syscolab.qe.core.ui.SyscoLabUI;
import com.syscolab.qe.core.ui.web.SyscoLabWUI;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PageBase {
    protected static SyscoLabUI syscoLabUIOgm;


    public static void launchPageBase() {
        
        if (Constants.RUN_LOCALLY) {
            DriverSetUpUtil.setToRunLocally();
            DesiredCapabilities capabilities = null;
            syscoLabUIOgm = new SyscoLabWUI(capabilities);
            syscoLabUIOgm.navigateTo(Constants.BASE_URL);
            syscoLabUIOgm.driver.manage().window().maximize();
        } else {
            syscoLabUIOgm = new SyscoLabWUI(DriverSetUpUtil.setToRunRemotely(Constants.APP_URL), Constants.BASE_URL);
            syscoLabUIOgm.navigateTo(Constants.BASE_URL);
            syscoLabUIOgm.driver.manage().window().maximize();
        }
    }

    public static void quitBrowser() {
        if (syscoLabUIOgm != null) {
            syscoLabUIOgm.quit();
        }
    }
}