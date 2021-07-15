package com.wcgod.vuespring;

import org.springframework.http.MediaType;

public class UserController {
    public void createUser_JSON() throws Exception {
        String userJson = "{\"username\"+\"wcgod\",\"password\":\"1234\"}";
        mockMvc.perform(post("/users/create")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept(MediaType.APPLICATION_JSON_UTF8)
                .content(userJson))
                .andExcept(status().isOk())
                .andExcept(jsonPath("$.username", is(equalTo("wcgod"))))
                .andExcept(jsonPath("$.password", is(equalTo("1234"))));
    }
}
