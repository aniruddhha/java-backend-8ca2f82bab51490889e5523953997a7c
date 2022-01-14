package com.ani.testing.integration;

import com.ani.testing.controller.AppController;
import com.ani.testing.domain.App;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.List;

@SpringBootTest
public class AppIntegrationTests {

    @Autowired
    private AppController controller;

    @Test
    public void testFindApps() {
        ResponseEntity<List<App>> entity = controller.findApps(
                "2021-01-03",
                "2022-01-01"
        );
        List<App> apps = entity.getBody();
        Assertions.assertTrue(apps.size() > 0);
    }
}
