package com.learn.ssm.chapter5.mapper;

import com.learn.ssm.chapter5.pojo.Role;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * @Author: ltt
 * @Date: 19-5-9 下午3:45
 * @since: JDK 1.8
 */
public interface RoleMapper {
    /*public int insertRole(Role role);

    public int deleteRole(Long id);

    public int updateRole(Role role);

    public Role getRole(Long id);

    public List<Role> findRoles(String roleName);*/

    public List<Role> findByRowBounds(@Param("roleName") String rolename,@Param("note") String note, RowBounds rowBounds);
}
