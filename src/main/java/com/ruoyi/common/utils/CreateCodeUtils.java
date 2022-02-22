package com.ruoyi.common.utils;


import com.ruoyi.project.system.company.domain.Company;
import com.ruoyi.project.system.company.service.ICompanyService;
import com.ruoyi.project.system.companydept.domain.CompanyDep;
import com.ruoyi.project.system.companydept.service.ICompanyDepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.*;

//@Component
@Repository
public class CreateCodeUtils {

     @Autowired
     ICompanyService companyService;
     @Autowired
     ICompanyDepService companyDepService;



    public  String createCompanyCode(){
        Company company = companyService.selectLastCode();
        String s =company.getCode();

        String result = s.substring(s.length()-4,s.length());


        int companyCode= Integer.parseInt(result)+1;//取到后四位整数

        int digitNum=0;
        int temp=companyCode;
        while (temp!=0){
            temp/=10;
            digitNum++;
        }
        String flowNum=companyCode+"";//加0

        for(int i=0;i<=3-digitNum;i++){
            String zero="0";
            flowNum=zero+flowNum;
        }

        SimpleDateFormat format = new SimpleDateFormat("yyMM"); // 时间字符串产生方式
        String uid_pfix = format.format(new Date()); // 组合流水号时间字符串部分

        String j="C"+uid_pfix+flowNum;
        return j;
    }

    public  String createCompanyDepCode(){
        CompanyDep companyDep = companyDepService.selectLastCode();
        String s =companyDep.getCode();

        String result = s.substring(s.length()-4,s.length());


        int companyCode= Integer.parseInt(result)+1;//取到后四位整数

        int digitNum=0;
        int temp=companyCode;
        while (temp!=0){
            temp/=10;
            digitNum++;
        }
        String flowNum=companyCode+"";//加0

        for(int i=0;i<=3-digitNum;i++){
            String zero="0";
            flowNum=zero+flowNum;
        }

        SimpleDateFormat format = new SimpleDateFormat("yyMM"); // 时间字符串产生方式
        String uid_pfix = format.format(new Date()); // 组合流水号时间字符串部分

        String j="D"+uid_pfix+flowNum;
        return j;
    }
}
