package com.iamkyun.nuky;

import com.iamkyun.nuky.mapper.UserMapper;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("dev")
@SpringBootTest(classes = NukyCommentServiceApplication.class)
@Log4j2
public class NukyCommentServiceApplicationTests {
    @Autowired
    UserMapper userMapper;

    @Test
    public void testUserMapper() {
        log.info("userMapper.selectById(1) = " + userMapper.selectById(1));
    }

}
