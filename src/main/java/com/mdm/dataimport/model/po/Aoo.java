package com.mdm.dataimport.model.po;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
//import lombok.Data;
//
//@Data
@ExcelTarget("Aoo")
public class Aoo {

	@Excel(name = "名字")
	private String name;

	@Excel(name = "ID")
	private Integer id;
}
