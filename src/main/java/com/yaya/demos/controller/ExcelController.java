package com.yaya.demos.controller;

import com.yaya.demos.excel.excelDto.ExportModel;
import com.yaya.demos.excel.excelDto.ExportModelHead;
import com.yaya.demos.utils.DateUtils;
import com.yaya.demos.utils.excel.ExcelUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/excel")
public class ExcelController {

    @GetMapping(value = "/export")
    public void writeExcel(HttpServletResponse response) {
        List<ExportModel> list = getList();
        String fileName = "Excel导出测试";
        String sheetName = "sheet1";
        ExcelUtils.writeDynamicHeadExcel(response, list, fileName, sheetName, ExportModel.class, ExportModelHead.head());
    }

    /* 填充数据*/
    private List<ExportModel> getList() {
        List<ExportModel> modelList = new ArrayList<>();
        Date date = new Date();

        ExportModel firstModel = new ExportModel();
        firstModel.setName("李明");
        firstModel.setSex("男");
        firstModel.setAge(20);
        firstModel.setDate(DateUtils.format(date));
        modelList.add(firstModel);

        ExportModel secondModel = new ExportModel();
        secondModel.setName("珍妮");
        secondModel.setSex("女");
        secondModel.setAge(19);
        secondModel.setDate(DateUtils.format(date));
        modelList.add(secondModel);

        return modelList;
    }


}
