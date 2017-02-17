package com.lab.manage.web.utils;

import java.util.UUID;

public class idUtil {

    public static String getUUID() {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        return uuid;
    }
}
