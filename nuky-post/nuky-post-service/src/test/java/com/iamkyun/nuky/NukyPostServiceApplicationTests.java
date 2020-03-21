package com.iamkyun.nuky;

import com.iamkyun.nuky.mapper.PostMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = NukyPostServiceApplication.class)
public class NukyPostServiceApplicationTests {

    @Value("${nuku.post.pageSize:10}")
    private Integer pageSize;

    @Autowired
    PostMapper postMapper;

}
