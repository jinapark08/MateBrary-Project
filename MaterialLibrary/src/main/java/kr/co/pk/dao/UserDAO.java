package kr.co.pk.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
	@Autowired
	//MyBatis를 xml로 이용할 때 사용하는 클래스
		private SqlSession sqlSession;
}
