package infrastructure.config;

import infrastructure.config.utils.StringUtils;

public class TestApp {

    public static void main(String[] args) {
        StringUtils randomString = new StringUtils();
        System.out.println(randomString.randomString("alphanumeric", 50));
    }

}
