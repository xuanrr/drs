package com.ruoyi.common.utils;

import com.ruoyi.project.system.customer.domain.Customer;
import com.ruoyi.project.system.customer.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.*;

//@Component
public class CreateCodeUtils {
    /**
     * 自动生成编号格式：yyMM+四位流水号
     */
    public static int CSTM_CODE=0;
//    @Autowired
//    ICustomerService customerService;
//    @Autowired
//    Customer customer;

//    @RequestMapping(params = "createCode")
//    @ResponseBody
//    public String createCode(HttpServletRequest request, String tableName,
//                               String fieldName) {
    public static String createCode(){
        String j = new String();
//
//        String sql = "select Max(a." + fieldName + ") max_code from "
//                + tableName + " a ";

//        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        // System.out.println("最大编号："+list.get(0).get("max_comment_code"));
        String comment_code = "";
//        String max_code = "";
//        int num=list.size();
//        num = num>0?num:-num;
//        int length = String.valueOf(num).length();
        String flowNum=CSTM_CODE+"";
        for(int i=0;i<=3-CSTM_CODE;i++){
            String zero="0";
            flowNum=zero+flowNum;
        }

        SimpleDateFormat format = new SimpleDateFormat("yyMM"); // 时间字符串产生方式
        String uid_pfix = format.format(new Date()); // 组合流水号前一部分，时间字符串，如：1601
//        System.out.println("time=" + format.format(new Date()));
//        if (max_code != null && max_code.contains(uid_pfix)) {
//            String uid_end = max_code.substring(4, 8); // 截取字符串最后四位，结果:0001
//            // System.out.println("uid_end=" + uid_end);
//            int endNum = Integer.parseInt(uid_end); // 把String类型的0001转化为int类型的1
//            // System.out.println("endNum=" + endNum);
//            int tmpNum = 10000 + endNum + 1; // 结果10002
//            // System.out.println("tmpNum=" + tmpNum);
//            comment_code = uid_pfix + UtilMethod.subStr("" + tmpNum, 1);// 把10002首位的1去掉，再拼成1601260002字符串
//        } else {
//            comment_code = uid_pfix + "0001";
//        }
        // System.out.println(comment_code);
        j="C"+comment_code+flowNum;
        return j;
    }

    //公共方法
//    public static class UtilMethod {
//
//
//        /*
//         * 把10002首位的1去掉的实现方法：
//         * @param str
//         * @param start
//         * @return
//         */
//        public static String subStr(String str, int start) {
//            if (str == null || str.equals("") || str.length() == 0)
//                return "";
//            if (start < str.length()) {
//                return str.substring(start);
//            } else {
//                return "";
//            }
//
//        }
//    }
}
