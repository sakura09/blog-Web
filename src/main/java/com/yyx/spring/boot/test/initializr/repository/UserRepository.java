package com.yyx.spring.boot.test.initializr.repository;

import com.yyx.spring.boot.test.initializr.domain.User;

import java.util.List;

/**
 * UserRepostory 接口
 *
 */
public interface UserRepository {
    /**
     * 创建或者修改用户
     * @param user
     * @return
     */
    User saveOrUpdateUser(User user);

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(Long id);

    /**
     * 根据ID查询单个用户
     * @param id
     */
    User getUserById(Long id);

    /**
     * 获取用户列表
     * @return
     */
    List<User> listUser();


}