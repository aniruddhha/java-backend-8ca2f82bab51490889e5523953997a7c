package com.ani.testing.service;

import com.ani.testing.domain.App;
import com.ani.testing.repository.AppRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.Date;
import java.util.List;

// you have done test on mock data
@ExtendWith(SpringExtension.class)
public class AppServiceTests {

    @Mock
    private AppRepository repository;

//    @MockBean -> they will create dependency tree
//    @Mock ->  they will create dependency tree
    @InjectMocks
    private AppService service;
    // service class is calling method inside repository ?
    // how to check this method has happened or not ?
    // for that you have verify methods from Mockito.s

    @Test
    public void testDateBetween() {
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

        var apps = service.finAppsBetween(st, ed); // you called the function 1 time
        Assertions.assertEquals(apps.size(), 2);

        // I want to make sure, actually repository method has called
        // so that I am verifying it
        Mockito.verify(
                repository,
                Mockito.times(1) // function should be called 1 times
        ).findByPubDtBetween(st, ed);
    }
}
