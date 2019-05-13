package com.learn.ssm.chapter5.main;

import com.learn.ssm.chapter5.mapper.RoleMapper;
import com.learn.ssm.chapter5.pojo.Role;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import com.learn.ssm.chapter5.utils.SqlSessionFactoryUtils;

import java.util.List;

/**
 * @Classname Chapter5Main
 * @Description TODO
 * @Date 19-5-13 下午9:39
 * @Created by ltt
 */
public class Chapter5Main {
    public static void main(String[] args) {
        testRowBounds();
    }

    private static void testRowBounds(){
        SqlSession sqlSession = null;
        try{
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            RowBounds rowBounds = new RowBounds(0,20);
            List<Role> roleList = roleMapper.findByRowBounds("role_name","note",rowBounds);
            System.err.println(roleList.size());
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(sqlSession != null){
                sqlSession.close();
            }
        }
    }
}
