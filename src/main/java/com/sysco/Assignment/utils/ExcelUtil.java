package com.sysco.Assignment.utils;

//import com.sysco.Assignment.data.FirstData;
//import com.sysco.Assignment.data.HomeData;
import com.syscolab.qe.core.excelUtils.ReadExcel;
import com.sysco.Assignment.data.LoginData;


public class ExcelUtil {

    public static LoginData getLoginData(String key) {
        Object loginObject = ReadExcel.getDataFromExcelSheet(key, System.getProperty("user.dir") + "/src/main/resources/testData/TestData.xls", 0, LoginData.class);
        LoginData loginData = (LoginData) loginObject;
        return loginData;
    }

}
