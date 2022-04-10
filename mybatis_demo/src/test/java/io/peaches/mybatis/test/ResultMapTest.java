package io.peaches.mybatis.test;

import io.peaches.mybatis.mapper.EmpMapper;
import io.peaches.mybatis.pojo.Emp;
import io.peaches.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class ResultMapTest {

    @Test
    public void testResultMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        List<Emp> result = mapper.getAllEmp();
        result.forEach(System.out::println);
    }
}