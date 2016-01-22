package com.anubhav.mappers;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import com.anubhav.domain.Login;

public interface LoginMapper {

	@Results({
		@Result(property="userId", column="userId"),
		@Result(property="password", column="password")
	})
	@Select("Select userId,password from Login where userId=#{userId}")
	Login selectLogin(String userId);
	
}
