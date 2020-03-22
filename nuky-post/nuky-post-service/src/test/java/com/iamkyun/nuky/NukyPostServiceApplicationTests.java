package com.iamkyun.nuky;

import com.iamkyun.nuky.mapper.PostMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class NukyPostServiceApplicationTests {
    @Autowired
    PostMapper postMapper;

}
