package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.model.Publisher;

@Mapper
public interface PublisherMapper {
	@Select("select * from publisher")
	public List<Publisher> findAll();

	@Select("select * from publisher where id = #{id}")
	public Publisher findById(int id);

	@Insert("insert into publisher(name, address, email, note) "
			+ " values (#{name}, #{address}, #{email}, #{note}")
	public int insert(Publisher publisher);
	
	@Update("update publisher set name=#{name}, "
			+ " address=#{address}, email=#{email}, note=#{note} where id=#{id}")
	public int update(Publisher publisher);

	@Delete("delete from publisher where id = #{id}")
	public int deleteById(int id);
}
