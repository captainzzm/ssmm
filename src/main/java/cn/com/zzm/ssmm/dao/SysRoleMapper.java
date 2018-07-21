package cn.com.zzm.ssmm.dao;

import java.util.List;

import cn.com.zzm.ssmm.model.SysMenu;
import cn.com.zzm.ssmm.model.SysRole;

public interface SysRoleMapper {
    int deleteByPrimaryKey(Long roleId);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
    
    /**
     * @param roleId
     * @return
     */
    List<SysMenu> selectMenusByPrimaryKey(Long roleId);
}