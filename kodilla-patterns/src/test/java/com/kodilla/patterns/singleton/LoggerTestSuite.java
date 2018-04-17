package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log("Logged operation no. 1");
        Logger.getInstance().log("Logged operation no. 2");
        Logger.getInstance().log("Logged operation no. 3");
        //When
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Logged operation no. 3", lastLog);
    }


}
