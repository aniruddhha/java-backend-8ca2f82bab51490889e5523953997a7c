package com.ani.sonar.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MsgTests {

    @DisplayName("Test - Checking message")
    @Test
    void checkMessage() {
        Msg msg = new Msg();
        msg.setMobile("abc");

        Assertions.assertNotNull(msg);
        Assertions.assertEquals("abc", msg.getMobile());
    }
}
