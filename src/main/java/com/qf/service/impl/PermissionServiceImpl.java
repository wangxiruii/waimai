package com.qf.service.impl;

import com.qf.pojo.Permission;
import com.qf.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther:
 * @Date: 2019/8/24 17:15
 * @Description:
 */
@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
     PermissionService permissionService;
    @Override
    public List<Permission> loadAll() {
        return permissionService.loadAll();
    }

    @Override
    public List<Permission> loadByRoleId(int roleId) {
        return permissionService.loadByRoleId(roleId);
    }

    @Override
    public int deletePer(int rid) {
        return permissionService.deletePer(rid);
    }

    @Override
    public int savePer(int rid, List<Integer> ids) {
        return permissionService.savePer(rid,ids);
    }
}
