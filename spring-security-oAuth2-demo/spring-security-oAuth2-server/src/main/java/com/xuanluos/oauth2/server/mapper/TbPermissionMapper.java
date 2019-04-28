package com.xuanluos.oauth2.server.mapper;

import com.xuanluos.oauth2.server.domain.TbPermission;
import com.xuanluos.utils.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPermissionMapper extends MyMapper<TbPermission> {

    /**
     * 通过userID查找权限列表
     *
     * @param userId
     * @return
     */
    List<TbPermission> selectByUserId(@Param("userId") Long userId);
}