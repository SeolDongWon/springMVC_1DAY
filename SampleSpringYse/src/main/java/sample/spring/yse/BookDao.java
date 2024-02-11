package sample.spring.yse;


import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
	
	@Autowired
	SqlSessionTemplate sqlSesstionTemplate;

	public int insert(Map<String, Object> map) {
		return this.sqlSesstionTemplate.insert("book.insert",map);
	}
	
	public Map<String, Object> selectDetail(Map<String,Object> map){
		return this.sqlSesstionTemplate.selectOne("book.select_detail",map);
	}
	
	public int update(Map<String,Object> map) {
		return this.sqlSesstionTemplate.update("book.update",map);
	}
	
	public int delete(Map<String,Object> map) {
		return this.sqlSesstionTemplate.delete("book.delete",map);
	}
	
	public List<Map<String,Object>> selectList(Map<String,Object> map){
		return this.sqlSesstionTemplate.selectList("book.select_list",map);
	}
}
