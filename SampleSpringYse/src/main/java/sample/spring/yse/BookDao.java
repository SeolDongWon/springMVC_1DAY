package sample.spring.yse;


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
}
