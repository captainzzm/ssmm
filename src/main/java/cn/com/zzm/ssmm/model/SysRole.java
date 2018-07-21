package cn.com.zzm.ssmm.model;

import java.util.Date;
import java.util.List;

public class SysRole {
    private Long roleId;

    private String roleName;

    private String remark;

    private Date createTime;
    
    private List<Long> menus;
    

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	public List<Long> getMenus() {
		return menus;
	}

	public void setMenus(List<Long> menus) {
		this.menus = menus;
	}
    
}