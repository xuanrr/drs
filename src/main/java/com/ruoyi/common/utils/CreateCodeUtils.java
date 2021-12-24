package com.ruoyi.common.utils;


import com.ruoyi.project.system.company.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.*;

//@Component
public class CreateCodeUtils {

    @Autowired
    static
    ICompanyService companyService;
    static String s = companyService.selectLastCode();

    static String result = s.substring(s.length()-4,s.length());


    public static int COMPANY_CODE= Integer.parseInt(result);


    public static String createCode(){

//        ICompanyService companyService;
//        String s = companyService.selectLastCode();
        String j = new String();

        String comment_code = "";

        String flowNum=COMPANY_CODE+"";
        for(int i=0;i<=3-COMPANY_CODE;i++){
            String zero="0";
            flowNum=zero+flowNum;
        }

        SimpleDateFormat format = new SimpleDateFormat("yyMM"); // 时间字符串产生方式
        String uid_pfix = format.format(new Date()); // 组合流水号前一部分，时间字符串，如：1601

        j="C"+uid_pfix+flowNum;
        return j;
    }

}
