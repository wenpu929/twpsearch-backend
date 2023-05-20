package com.yupi.twpso;

import com.yupi.twpso.config.WxOpenConfig;
import javax.annotation.Resource;

import com.yupi.twpso.service.PostService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 主类测试
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@SpringBootTest
class MainApplicationTests {

    @Resource
    private WxOpenConfig wxOpenConfig;
    private  FetchInitPostList fetchInitPostList;
    @Test
    void contextLoads() {

    }

}
