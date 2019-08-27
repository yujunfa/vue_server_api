package cn.opm.vue_server_api.service;

import cn.opm.vue_server_api.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IDemoServiceTest {

    @Autowired
    private IDemoService iDemoService;

    @Test
    public void getAllUser() {
    }

    @Test
    public void addNew() {
        User user = new User("吕布", 18);
        /*Integer rows = iDemoService.addNew(user);
        System.err.println("rows: " + rows);
        System.err.println("user: " + user);*/
    }
}