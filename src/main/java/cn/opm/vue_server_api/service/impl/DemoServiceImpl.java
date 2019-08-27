package cn.opm.vue_server_api.service.impl;

import cn.opm.vue_server_api.entity.User;
import cn.opm.vue_server_api.mapper.DemoMapper;
import cn.opm.vue_server_api.service.IDemoService;
import cn.opm.vue_server_api.service.ex.InsertException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements IDemoService {

    @Autowired
    private DemoMapper demoMapper;

    @Override
    public List<User> getAllUser() {
        return findAllUser();
    }

    @Override
    public void addNew(User user) throws InsertException{
        Integer rows = add(user);
        System.err.println("rows: " + rows );
        throw new InsertException("插入失败");
    }

    @Override
    public void updateUser(User user) {
        Integer rows = demoMapper.update(user.getUsername(), user.getId());
        System.err.println("rows: " + rows);
    }

    @Override
    public User findById(Integer id) {
        return demoMapper.findById(id);
    }

    /**
     * 查找所有的用户
     *
     * @return 用户列表
     */
    private List<User> findAllUser() {
        return demoMapper.findAllUser();
    }

    private Integer add(User user) {
        return demoMapper.add(user);
    }
}
