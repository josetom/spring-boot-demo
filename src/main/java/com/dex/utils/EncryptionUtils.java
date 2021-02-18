package com.dex.utils;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;

public class EncryptionUtils {

    public static String getSignature(Object obj, String key) {
        return Hashing.hmacSha256(key.getBytes(StandardCharsets.UTF_8))
                .newHasher()
                .putString(obj.toString(), StandardCharsets.UTF_8)
                .hash()
                .toString();
    }
}
