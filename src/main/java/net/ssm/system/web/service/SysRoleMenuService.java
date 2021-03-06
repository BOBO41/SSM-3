package net.ssm.system.web.service;

import net.ssm.system.web.pojo.RoleMenuVo;
import net.ssm.system.web.pojo.SysRoleMenu;

import java.util.List;

public interface SysRoleMenuService {
	  int deleteByPrimaryKey(SysRoleMenu key);

	  int deleteByRoleId(Long roleId);

	  int insert(SysRoleMenu record);

	  int insertSelective(SysRoleMenu record);
	  
	  RoleMenuVo  selectSysMenuByRoleId(Long roleId);

	  int insertBatch(List<SysRoleMenu> record);
	  int setRoleMenu(Long roleId,String menus);
}
