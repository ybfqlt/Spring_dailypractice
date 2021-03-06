package com.learn.ssm.chapter5.typeHandler;

import com.learn.ssm.chapter5.enumeration.SexEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;

/**
 * @Classname SexTypeHandler
 * @Description TODO
 * @Date 19-5-19 上午11:10
 * @Created by ltt
 */
public class SexTypeHandler extends BaseTypeHandler<SexEnum> {
    @Override
    public SexEnum getNullableResult(ResultSet rs,String name) throws SQLException {
        int sex = rs.getInt(name);
        return SexEnum.getSexById(sex);
    }

    @Override
    public SexEnum getNullableResult(ResultSet rs,int index) throws SQLException{
        int sex=rs.getInt(index);
        return SexEnum.getSexById(sex);
    }

    @Override
    public SexEnum getNullableResult(CallableStatement cs,int index) throws SQLException{
        int sex = cs.getInt(index);
        return SexEnum.getSexById(sex);
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int index, SexEnum sex, JdbcType jdbcType)throws SQLException{
        ps.setInt(index,sex.getId());
    }

}
