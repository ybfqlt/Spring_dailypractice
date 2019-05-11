package com.learn.ssm.chapter3.typehandler;

import com.learn.ssm.chapter3.enumeration.SexEnum;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: ltt
 * @Date: 19-5-11 下午8:40
 * @since: JDK 1.8
 */
public class SexEnumTypeHandler implements TypeHandler<SexEnum> {
    public void setParameter(PreparedStatement ps, int i, SexEnum parameter, JdbcType jdbcType)throws SQLException {
        ps.setInt(i,parameter.getId());
    }

    public SexEnum getResult(ResultSet rs,String columnName) throws SQLException{
        int id = rs.getInt(columnName);
        return SexEnum.getSexById(id);
    }

    public SexEnum getResult(ResultSet rs,int columnIndex) throws SQLException{
        int id = rs.getInt(columnIndex);
        return SexEnum.getSexById(id);
    }

    public SexEnum getResult(CallableStatement cs, int columnIndex) throws SQLException{
        int id= cs.getInt(columnIndex);
        return SexEnum.getSexById(id);
    }
}
