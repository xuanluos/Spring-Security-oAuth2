package com.xuanluos.oauth2.server.config.server;

import com.xuanluos.oauth2.server.domain.TbPermission;
import com.xuanluos.oauth2.server.domain.TbUser;
import com.xuanluos.oauth2.server.service.TbPermissionService;
import com.xuanluos.oauth2.server.service.TbUserService;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

/**
 * @author xuanLuos
 * @date 2019/4/28 22:56
 */
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private TbUserService tbUserService;

    @Autowired
    private TbPermissionService tbPermissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //查询用户信息
        TbUser user = tbUserService.getByUsername(username);
        List<GrantedAuthority> grantedAuthorities = Lists.newArrayList();
        if (null != user) {
            //获取用户授权
            List<TbPermission> permissions = tbPermissionService.selectByUserId(user.getId());
            //声明用户授权
            permissions.forEach(permission -> {
                if (permission != null && permission.getEnname() != null) {
                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permission.getEnname());
                    grantedAuthorities.add(grantedAuthority);
                }
            });
        }
        //框架完成认证
        return new User(user.getUsername(), user.getPassword(), grantedAuthorities);
    }
}
