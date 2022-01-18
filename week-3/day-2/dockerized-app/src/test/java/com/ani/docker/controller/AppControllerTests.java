package com.ani.docker.controller;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@ExtendWith(SpringExtension.class)
@WebMvcTest(AppController.class)
public class AppControllerTests {

    @Autowired
    private MockMvc mvc;

    @DisplayName("Controller : Checking the status")
    @Test
    public void testAppControllerStatus() throws Exception {

        mvc.perform(
                MockMvcRequestBuilders.get("/app/")
        ).andExpect(
                MockMvcResultMatchers.status().isOk()
        );
    }

    @DisplayName("Controller : test app object")
    @Test
    public void testAppControllerObject() throws Exception {
        mvc.perform(
                MockMvcRequestBuilders.get("/app/")
        ).andExpect(
                MockMvcResultMatchers.jsonPath(
                        "$.name",
                        Matchers.is("abc")
                )
        );
    }
}
