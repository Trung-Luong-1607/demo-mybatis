package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.model.Author;

@Mapper
public interface AuthorMapper {
	@Select("select * from author")
	public List<Author> findAll();

	@Select("select * from author where id = #{id}")
	public Author findById(int id);

	@Insert("insert into author(name, website, note) "
			+ " values (#{name}, #{website}, #{note}")
	public int insert(Author author);
	
	@Update("update author set name=#{name}, "
			+ " website=#{website}, note=#{note} where id=#{id}")
	public int update(Author author);

	@Delete("delete from author where id = #{id}")
	public int deleteById(int id);
}
