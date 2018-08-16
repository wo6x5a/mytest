package com.lcw.test.util;

import org.apache.commons.lang3.StringUtils;

/**
 * @author: chenwu.lcw
 * @date: 2018/4/9
 */
public class StarStringUtil {

    public static String starName(String name) {
        int lenth = StringUtils.length(name);
        int forntNum = 1;
        int endNum = 1;

        // 名字两个字,只显示姓
        if (lenth == 2) {
            endNum = 0;
        }

        return getStarString(name, forntNum, endNum);
    }

    public static String starPhone(String phone) {
        return getStarString(phone, 3, 4);
    }

    public static String starIdCard(String idCard) {
        return getStarString(idCard, 3, 4);
    }

    public static String starEmail(String email) {
        // '@'在第几个字符,也就是'@'前以后几个字符长度
        int i = StringUtils.lastIndexOf(email, "@");
        int frontNum = 3;
        int endNum;

        if (i <= 3) {
            frontNum = i - 1;
        }

        endNum = StringUtils.length(email) - i;
        return getStarString(email, frontNum, endNum);
    }

    /**
     * 对字符加星号处理：除前面几位和后面几位外，其他的字符以星号代替
     *
     * @param content 传入的字符串
     * @param frontNum 保留前面几位字符的位数
     * @param endNum 保留后面几位字符的位数
     * @return
     */
    public static String getStarString(String content, int frontNum, int endNum) {

        if (StringUtils.isBlank(content) || frontNum >= content.length() || frontNum < 0 || endNum >= content.length() || endNum < 0 || frontNum + endNum > content.length()) {
            return content;
        }

        StringBuilder result = new StringBuilder();

        // front
        result.append(StringUtils.substring(content, 0, frontNum));

        // star
        int starNum = content.length() - frontNum - endNum;
        for (int i = 0; i < starNum; i++) {
            result.append("*");
        }

        // end
        result.append(StringUtils.substring(content, content.length() - endNum, content.length()));
        return result.toString();
    }
}
