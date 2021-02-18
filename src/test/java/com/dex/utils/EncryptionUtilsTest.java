package com.dex.utils;

import org.junit.Assert;
import org.testng.annotations.Test;

public class EncryptionUtilsTest {

    @Test
    public void getSignatureTest() {
        Assert.assertEquals(EncryptionUtils.getSignature("some_string", "secret"), "5cd6439f108902462e5bed4ed06def900159f85d6a3f0caae04623a56de6e23c");
    }

}
