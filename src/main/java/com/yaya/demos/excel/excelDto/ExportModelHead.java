package com.yaya.demos.excel.excelDto;

import java.util.ArrayList;
import java.util.List;

public class ExportModelHead {
    public static List<List<String>> head() {
        List<List<String>> headList = new ArrayList<>();
        List<String> nameHead = new ArrayList<>();
        nameHead.add("姓名");
        List<String> genderHead = new ArrayList<>();
        genderHead.add("性别");
        List<String> ageHead = new ArrayList<>();
        ageHead.add("年龄");
        List<String> dateHead = new ArrayList<>();
        dateHead.add("出生时间");
        headList.add(nameHead);
        headList.add(genderHead);
        headList.add(ageHead);
        headList.add(dateHead);

        return headList;
    }
}
