package cn.com.zzm.ssmm.dao;

import java.util.List;

import cn.com.zzm.ssmm.model.SysMenu;
import cn.com.zzm.ssmm.model.SysRole;
import cn.com.zzm.ssmm.model.SysUser;

public interface SysUserMapper {
	
    int deleteByPrimaryKey(Long userId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
    
    /**根据用户查找所有角色
     * @param userId
     * @return
     */
    List<SysRole> selectSysRolesByPrimaryKey(Long userId);
    
    /**根据用户查找所有權限
     * @param userId
     * @return
     */
    List<SysMenu> selectSysMenusByPrimaryKey(Long userId);
    
}