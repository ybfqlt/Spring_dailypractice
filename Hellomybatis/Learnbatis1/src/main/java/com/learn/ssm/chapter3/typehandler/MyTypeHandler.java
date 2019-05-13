package com.learn.ssm.chapter3.typehandler;

import org.apache.ibatis.type.TypeHandler;
import org.apache.log4j.Logger;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.ibatis.type.JdbcType;

/**
 * @Author: ltt
 * @Date: 19-5-11 下午6:02
 * @since: JDK 1.8
 */
public class MyTypeHandler implements TypeHandler<String> {
    Logger logger = Logger.getLogger(MyTypeHandler.class);

    public void setParameter(PreparedStatement ps,int i,String parameter,JdbcType jdbcType) throws SQLException{
        logger.info("设置string参数[" + parameter+"]");
        ps.setString(i,parameter);
    }

    public String getResult(ResultSet rs, String columnName) throws SQLException{
        String result = rs.getString(columnName);
        logger.info("读取String参数1[" + result+"]");
        return result;
    }


    public String getResult (ResultSet rs,int columnIndex) throws SQLException{
        String result = rs.getString(columnIndex);
        logger.info("读取string参数2[" + result+"]");
        return result;
    }


    public String getResult(CallableStatement cs,int columnIndex) throws SQLException{
        String result = cs.getString(columnIndex);
        logger.info("读取string参数3[" + result+"]");
        return result;
    }
}
