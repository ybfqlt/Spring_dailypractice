package com.learn.ssm.chapter3.mapper;

import com.learn.ssm.chapter3.pojo.Role;

import java.util.List;

/**
 * @Author: ltt
 * @Date: 19-5-9 下午3:45
 * @since: JDK 1.8
 */
public interface RoleMapper {
    public int insertRole(Role role);
    public int deleteRole(Long id);
    public int updateRole(Role role);
    public Role getRole(Long id);
    public List<Role> findRoles(String roleName);
}
