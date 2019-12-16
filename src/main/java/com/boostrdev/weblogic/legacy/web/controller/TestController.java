package com.boostrdev.weblogic.legacy.web.controller;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.boostrdev.weblogic.legacy.model.po.Aoo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class TestController {

	@PostMapping("/test1")
	public void test1(@RequestBody MultipartFile file) {
		ImportParams importParams = new ImportParams();
		importParams.setHeadRows(1);
		try {
			List<Aoo> list = ExcelImportUtil.importExcel(file.getInputStream(), Aoo.class,importParams);
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
