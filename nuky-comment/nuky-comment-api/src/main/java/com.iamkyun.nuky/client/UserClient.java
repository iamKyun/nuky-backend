package com.iamkyun.nuky.client;

import com.iamkyun.nuky.model.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author kyun
 */
@FeignClient(name = "user")
public interface UserClient {
    /**
     * get user by user.id
     *
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    User getUserById(@PathVariable Long id);
}
