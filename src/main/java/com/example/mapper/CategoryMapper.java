package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.model.Category;

@Mapper
public interface CategoryMapper {
	@Select("select * from category")
	public List<Category> findAll();

	@Select("select * from category where id = #{id}")
	public Category findById(int id);

	@Insert("insert into category(name, note) "
			+ " values (#{name}, #{note}")
	public int insert(Category category);
	
	@Update("update category set name=#{name}, "
			+ " note=#{note} where id=#{id}")
	public int update(Category category);

	@Delete("delete from category where id = #{id}")
	public int delete(int id);
}
