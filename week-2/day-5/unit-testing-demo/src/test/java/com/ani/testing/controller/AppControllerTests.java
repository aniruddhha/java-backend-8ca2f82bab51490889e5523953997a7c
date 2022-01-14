package com.ani.testing.controller;

import com.ani.testing.domain.App;
import com.ani.testing.service.AppService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.sql.Date;
import java.util.List;

// controller testing
@ExtendWith(SpringExtension.class)
@WebMvcTest(AppController.class)
public class AppControllerTests {

    @MockBean // fake service
    private AppService service;

    @Autowired
    private MockMvc mvc; // fake mvc

    @Test
    public void testDateBetween() throws Exception {

        var st = Date.valueOf("2021-03-01");
        var ed = Date.valueOf("2022-01-01");

        var ap1 = new App();
        ap1.setAppId(12L);
        ap1.setAppNm("abc");
        ap1.setFree(false);
        ap1.setPubDt(Date.valueOf("2021-03-02"));

        var ap2 = new App();
        ap2.setAppId(12L);
        ap2.setAppNm("pqr");
        ap2.setFree(false);
        ap2.setPubDt(Date.valueOf("2021-03-10"));

        Mockito.when( // fake call to service method
                service.finAppsBetween(st, ed)
        ).thenReturn(
                List.of(
                        ap1,
                        ap2
                )
        );

        mvc.perform( // fake request and tested result
                MockMvcRequestBuilders.get("/app/2021-03-01/2022-01-01")
        ).andExpect(
                MockMvcResultMatchers.status().isOk()
        ).andExpect(
                MockMvcResultMatchers.jsonPath(
                        "$[0].appNm", // in the json there is list, you point to 0 element
                        Matchers.is("abc")
                )
        );
    }
}
