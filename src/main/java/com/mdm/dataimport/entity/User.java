package com.mdm.dataimport.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

//import lombok.Data;

//@Data
@TableName("LZLJ_STG.T_USER")
@ExcelTarget("")
public class User extends Model<User> {
	private static final long serialVersionUID = 1L;

	@TableId(value = "ID",	type = IdType.AUTO)
	private Integer id;

	@Excel(name = "名字")
	@TableField("NAME")
	private String name;
	@Excel(name = "性别")
	@TableField("GENDER")
	private String gender;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}


}
