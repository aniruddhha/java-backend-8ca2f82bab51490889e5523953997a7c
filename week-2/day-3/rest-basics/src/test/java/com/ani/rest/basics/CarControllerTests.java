package com.ani.rest.basics;

import com.ani.rest.basics.controller.CarController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@ExtendWith(SpringExtension.class)
@WebMvcTest(CarController.class)
public class CarControllerTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testHi() throws Exception {
        mvc.perform(
                MockMvcRequestBuilders.get("/car/hi")
        ).andExpect(
                MockMvcResultMatchers.status().isOk()
        );
    }

}
