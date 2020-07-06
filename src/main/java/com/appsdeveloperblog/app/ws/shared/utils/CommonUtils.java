package com.appsdeveloperblog.app.ws.shared.utils;

import java.security.SecureRandom;
import java.util.Random;

public class CommonUtils {
    public static final String ALL_CHARS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    public static Random RANDOM = new SecureRandom();

    public static String generateRandomString(int size) {
        StringBuilder sb = new StringBuilder();
        for (int i=1; i<= size; i++) {
            sb.append(ALL_CHARS.charAt(RANDOM.nextInt(ALL_CHARS.length())));
        }
        return sb.toString();
    }
}
