package cn.opm.vue_server_api.controller;

import cn.opm.vue_server_api.entity.Book;
import cn.opm.vue_server_api.entity.User;
import cn.opm.vue_server_api.service.IDemoService;
import cn.opm.vue_server_api.service.IRedisTest;
import cn.opm.vue_server_api.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class DemoController {
    @Autowired
    private IDemoService iDemoService;

    @Autowired
    private IRedisTest iRedisTest;

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/test1")
    public void test01() {
        ValueOperations<String, String> ops1 = stringRedisTemplate.opsForValue();
        ops1.set("name", "三国演义");
        String name = ops1.get("name");
        System.err.println("name: " + name);
        ValueOperations ops2 = redisTemplate.opsForValue();
        Book b1 = new Book(1, "红楼梦", "曹雪芹");
        ops2.set("b1", b1);
        Book b2 = (Book) ops2.get("b1");
        System.err.println("book: " + b2);
    }

    @RequestMapping("getDemo")
    public List<User> getAllUser() {
        List<User> users = iDemoService.getAllUser();
        JsonResult<List<User>> jr = new JsonResult<>(200, "成功");
        jr.setData(users);
        return users;
    }

    @RequestMapping("demo/{id}/{age}")
    public JsonResult<Void> demo(
            @RequestParam("name") String username,
            @PathVariable("id") Integer id,
            @PathVariable("age") Integer age) {
        System.err.println("username: " + username);
        System.err.println("id: " + id);
        System.err.println("age: " + age);
        return new JsonResult<>(200, "success");
    }

    @RequestMapping("addNew")
    public JsonResult<Void> addNew(
            @RequestParam("name") String username,
            @RequestParam("age") Integer age) {
        User user = new User(username, age);
        iDemoService.addNew(user);
        return new JsonResult<>(200, "success");
    }

    @RequestMapping("update")
    public JsonResult<Void> updateOne(User user) {
        iDemoService.updateUser(user);
        return new JsonResult<>(200, "update success");
    }

    @RequestMapping("getById")
    public JsonResult<User> getById(Integer id) {
        User user = iDemoService.findById(id);
        return new JsonResult<>(200, "update success", user);
    }

    @RequestMapping("get")
    public JsonResult<List<Book>> get() {
        List<Book> books = iRedisTest.getAllBooks();
        return new JsonResult<>(200, "redis success", books);
    }

}
