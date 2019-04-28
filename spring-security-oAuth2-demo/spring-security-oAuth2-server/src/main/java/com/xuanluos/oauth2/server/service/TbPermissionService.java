package com.xuanluos.oauth2.server.service;

import com.xuanluos.oauth2.server.domain.TbPermission;

import java.util.List;

public interface TbPermissionService {

    /**
     * 通过userID查找权限列表
     *
     * @param userId
     * @return
     */
    List<TbPermission> selectByUserId(Long userId);
}
