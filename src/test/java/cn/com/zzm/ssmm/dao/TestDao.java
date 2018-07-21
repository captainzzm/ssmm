package cn.com.zzm.ssmm.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import cn.com.zzm.ssmm.model.SysMenu;
import cn.com.zzm.ssmm.model.SysUser;
import cn.com.zzm.ssmm.dao.SysUserMapper;


@ContextConfiguration(locations="classpath*:spring-dao-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class TestDao {
	
	Logger logger = LoggerFactory.getLogger(TestDao.class);
	
	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Test
	public void doTest(){
		SysUser sysUser = sysUserMapper.selectByPrimaryKey(1l);
		 
		System.out.println("=====================");
		System.out.println("=====================");
		System.out.println("=====================");
		System.out.println("=====================");
		
		System.out.println(sysUser.toString());
		 
	}

}
