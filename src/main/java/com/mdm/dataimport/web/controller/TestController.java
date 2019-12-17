package com.mdm.dataimport.web.controller;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.mdm.dataimport.entity.User;
import com.mdm.dataimport.model.dto.UploadDto;
import com.mdm.dataimport.model.po.Aoo;
import com.mdm.dataimport.model.vo.ResVO;
import com.mdm.dataimport.service.IUserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
	public static Integer id = 1;
	@Resource
	private IUserService userService;

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

	@RequestMapping(value = "/importdata", method = RequestMethod.POST)
	public ResVO test1(UploadDto uploadDto) {
		ImportParams params = new ImportParams();
//		params.setHeadRows(1);
		System.out.println(uploadDto);
		try {
			List<User> list = ExcelImportUtil.importExcel(uploadDto.getFile().getInputStream(),User.class, params);
			if(list==null||list.isEmpty()){
				return ResVO.successMessage("无数据");
			}
			//数据校验
			int line=2;
			for(User user:list){
				if(user.getName()==null){
					return ResVO.failure("line:"+line+",msg:姓名不能为空");
				}
				line++;
			}
			userService.addBatch(list);

			return ResVO.success(null);

		} catch (Exception e) {
			e.printStackTrace();
			return ResVO.failure("服务器异常");
		}
	}
}
