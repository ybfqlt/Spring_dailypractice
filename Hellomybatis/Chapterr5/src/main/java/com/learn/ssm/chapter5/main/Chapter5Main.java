package com.learn.ssm.chapter5.main;

import com.learn.ssm.chapter5.mapper.EmployeeMapper;

import com.learn.ssm.chapter5.pojo.Employee;
import org.apache.ibatis.session.SqlSession;
import com.learn.ssm.chapter5.utils.SqlSessionFactoryUtils;
import org.apache.log4j.Logger;


/**
 * @Classname Chapter5Main
 * @Description TODO
 * @Date 19-5-13 下午9:39
 * @Created by ltt
 */
public class Chapter5Main {
    public static void main(String[] args) {
        testjilian();
    }


    private static void testjilian(){
        SqlSession sqlSession = null;
        try {
            Logger logger = Logger.getLogger(Chapter5Main.class);
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = employeeMapper.getEmployee(1L);
            logger.info(employee.getBirthday());
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
    }
}
