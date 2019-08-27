package cn.opm.vue_server_api.service;

import cn.opm.vue_server_api.entity.User;
import cn.opm.vue_server_api.service.ex.InsertException;

import java.util.List;

/**
 * Demo服务接口
 */
public interface IDemoService {

    /**
     * 获取所有的用户信息
     */
    List<User> getAllUser();

    void addNew(User user) throws InsertException;

    void updateUser(User user);

    User findById(Integer id);
}
