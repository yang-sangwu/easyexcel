package com.yaya.demos.excel.excelDto;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;

/**
 * @ExcelProperty 这是最常用的一个注解，注解中有三个参数value,index,converter
 * 分别代表列明，列序号，数据转换方式，value和index只能二选一，通常不用设置converter
 * @ColumnWith 用于设置列宽度的注解, 注解中只有一个参数value，value的单位是字符长度，
 * 最大可以设置255个字符，因为一个excel单元格最大可以写入的字符个数就是255个字符。
 * @ContentFontStyle 用于设置单元格内容字体格式的注解
 * @ContentLoopMerge 用于设置合并单元格的注解
 * @ContentRowHeight 用于设置行高
 * @ContentStyle 设置内容格式注解
 * @HeadFontStyle 用于定制标题字体格式
 * @HeadRowHeight 设置标题行行高
 * @HeadStyle 设置标题样式
 * @ExcelIgnore 不将该字段转换成Excel
 * @ExcelIgnoreUnannotated 没有注解的字段都不转换
 */
@ContentRowHeight(20)
@HeadRowHeight(25)
@ColumnWidth(25)
@Data
public class ExportModel {

    @ExcelProperty(value = "姓名", index = 0)
    private String name;

    @ExcelProperty(value = "性别", index = 1)
    private String sex;

    @ExcelProperty(value = "年龄", index = 2)
    private Integer age;

    @ExcelProperty(value = "出生时间", index = 3)
    private String date;

}


