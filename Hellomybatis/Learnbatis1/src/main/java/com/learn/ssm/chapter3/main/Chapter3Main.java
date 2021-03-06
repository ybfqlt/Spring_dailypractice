package com.learn.ssm.chapter3.main;

import com.learn.ssm.chapter3.mapper.RoleMapper;
import com.learn.ssm.chapter3.mapper.RoleMapper2;
import com.learn.ssm.chapter3.mapper.UserMapper;
import com.learn.ssm.chapter3.pojo.Role;
import com.learn.ssm.chapter3.pojo.User;
import com.learn.ssm.chapter3.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

/**
 * @Author: ltt
 * @Date: 19-5-9 下午3:45
 * @since: JDK 1.8
 */
public class Chapter3Main {
    public static void main(String[] args) {
          testUserMapper();
//        testRoleMapper();
//        testRoleMapper2();
    }
    /*private static void testRoleMapper() {
        Logger log = Logger.getLogger(Chapter3Main.class);
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.getRole(1L);
            log.info(role.getRoleName());
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }*/
    private static void testUserMapper() {
        Logger log = Logger.getLogger(Chapter3Main.class);
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUser(1L);
            log.info(user.getSex().getName());
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    //注解SQL测试
    /*private static void testRoleMapper2() {
        Logger log = Logger.getLogger(Chapter3Main.class);
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper2 roleMapper2 = sqlSession.getMapper(RoleMapper2.class);
            Role role = roleMapper2.getRole(1L);
            log.info(role.getRoleName());
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }*/
}
