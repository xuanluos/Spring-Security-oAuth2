package com.xuanluos.oauth2.server.service;

import com.xuanluos.oauth2.server.domain.TbUser;

public interface TbUserService{

    TbUser getByUsername(String username);
}
