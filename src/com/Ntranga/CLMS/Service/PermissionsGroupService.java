package com.Ntranga.CLMS.Service;

import java.util.List;
import java.util.Map;

import com.Ntranga.CLMS.vo.PermissionsGroupVo;

public interface PermissionsGroupService {

	public List<PermissionsGroupVo> getPermissionsGroupName(PermissionsGroupVo  groupVo);

	public String[] getScreenActionsList();

	public Map<String, List> getScreenActionsMapList(Integer permissionsGroupId);

	public Integer saveOrUpdatePermissionsGroupDetails(PermissionsGroupVo groupVo);

	public PermissionsGroupVo getPermissionGroupByPermissionGroupId(Integer permissionsGroupId);

	
}
