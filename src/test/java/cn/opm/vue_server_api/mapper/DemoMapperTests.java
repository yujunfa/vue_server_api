package cn.opm.vue_server_api.mapper;

import cn.opm.vue_server_api.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoMapperTests {

    @Autowired
    public DemoMapper demoMapper;

    @Test
    public void findAllUser() {
        System.err.println("demoMapper: " + demoMapper);
        List<User> users = demoMapper.findAllUser();
        System.err.println("users: " + users);
    }

    @Test
    public void add() {
        User user = new User("张三", 23);
        Integer rows = demoMapper.add(user);
        System.err.println("rows: " + rows);
        System.err.println("user: " + user);
    }
}
