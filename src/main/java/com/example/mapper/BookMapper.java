package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.model.Book;

@Mapper
public interface BookMapper {
	@Select("select b.id, b.name, a.name as author, c.name as category, p.name as publisher, b.publishing_date from book b \r\n"
			+ "join author a on b.author_id = a.id \r\n"
			+ "join category c on b.category_id = c.id \r\n"
			+ "join publisher p on b.publisher_id = p.id")
	public List<Book> findAll();

	@Select("select * from book b \r\n"
			+ "join author a on b.author_id = a.id \r\n"
			+ "join category c on b.category_id = c.id \r\n"
			+ "join publisher p on b.publisher_id = p.id\r\n"
			+ "where b.id = #{id}")
	public Book findById(int id);

	@Insert("insert into book(name, author_id, category_id, publisher_id, publishing_date) "
			+ " values (#{name}, #{author_id}, #{category_id}, #{publisher_id}, #{publishing_date}")
	public int insert(Book book);
	
	@Update("update book set name=#{name}, "
			+ " author_id=#{author_id}, category_id=#{category_id}, publisher_id=#{publisher_id}"
			+ ", publishing_date=#{publishing_date} where id=#{id}")
	public int update(Book book);

	@Delete("delete from book where id = #{id}")
	public int deleteById(int id);
}
