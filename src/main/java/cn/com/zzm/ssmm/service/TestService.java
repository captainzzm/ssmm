package cn.com.zzm.ssmm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.zzm.ssmm.dao.SysUserMapper;
import cn.com.zzm.ssmm.model.SysUser;

/**测试服务
 * @author zzm
 *
 */
@Service
public class TestService {
	
	@Autowired
	private SysUserMapper sysUserMapper;
	
	public SysUser doService(Long id){
		SysUser sysUser = sysUserMapper.selectByPrimaryKey(id);
		return sysUser;
	}
	

}
