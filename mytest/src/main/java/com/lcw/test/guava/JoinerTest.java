package com.lcw.test.guava;

import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.alibaba.fastjson.JSON;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.apache.commons.lang3.StringUtils;

public class JoinerTest {

    public static void main(String[] args) {
        System.out.println(Joiner.on(' ').join(1, 2, 3));
        System.out.println(Splitter.on(",").splitToList("[\"123\",\"456\"]").contains(123));
        System.out.println(Lists.newArrayList("sss,aaa".split("[^0-9]+")));
        System.out.println(Lists.newArrayList("[\"1010\"]"));

        List<String> s = JSON.parseArray("[\"123\",\"456\"]", String.class);
        System.out.println(s.contains("123"));

        do {
            System.out.println("1");
        } while (0 > 1);

        List<String> ss = Splitter.on(",").splitToList("50390382,50372005,50418787,50349398,52227508,50345021,51585076,50349420,50390155,50363217,50390336,51544587,50403675,50997033,50363404,51567273,50345062,50346232,50395197,50345365,50392511,50349436,50389600,50345021,52030397,52045273,51583386,50345076,50370586,50389317,50363176,50349394,50345775,50362312,50349447,50367796,12655812,50389317,50390336,52188099,50395433,50345405,54629001,50345071,50390290,51736970,50389446,50932019,50431882,51969914,50907080,50345162,50372657,53301012,50403569,50345587,53525244,52065288,50601390,12656609,50430563,51138093,50389315,52027154,50345637,50362307,53270084,50345135,50349440,50349522,50372707,53374006,50391279,50367769,53994002,50354230,51545975,52028512,50373197,50424660,50430879,52220382,50354616,50601447,53519147,51107980,51539810,50346483,50389706,53371121,50419068,52063605,50355385,50355807,1,50419643,50345082,52067540,50349996,50371116,52052852,51997227,50390550,50345151,50430313,50350005,53869028,50367733,50357292,50345151,50370597,53966062,50354234,50389568,52065288,50345035,50345640,50345974,50432058,51185837,53994002,50355354,50346140,52327103,50424696,52023139,50345427,50430598,50629030,53527270,50345171,50907072,50370924,50352785,52232434,50349724,52200271,52044673,50389340,50349380,50345217,50390976,50846050,50424667,50345427,50381070,50359976,50393441,50907080,50391603,50391242,50350635,50349380,51564141,52511127,50363388,50349748,53528131,50371886,50345421,50395833,50349415,52046549,52385078,50354651,50349993,5037285");
        Set<String> sets = Sets.newHashSet();
        for(String str : ss) {
            sets.add(str);
        }
        Integer i1 = 1;
        Integer i2 = 2;
        System.out.println(i1.compareTo(i2));

        long l = 38107482460L;

        System.out.println(l%100<61);


        String sss="<p</span></p>";

        Matcher matcher = Pattern.compile("[a-zA-z]+://[^\\s]*").matcher(sss);

        sss=StringUtils.replaceAll(sss," src=http", " src=\"http");
        sss=StringUtils.replaceAll(sss,".jpg ", ".jpg\" ");
        sss=StringUtils.replaceAll(sss,".JPG ", ".JPG\" ");
        sss=StringUtils.replaceAll(sss,".png ", ".png\"  ");
        sss=StringUtils.replaceAll(sss,".PNG ", ".PNG\"");
        sss=StringUtils.replaceAll(sss,".jpeg ", ".jpeg\" ");
        sss=StringUtils.replaceAll(sss,".JPEG ", ".JPEG\" ");
        sss=StringUtils.replaceAll(sss,".GIF ", ".GIF\" ");
        sss=StringUtils.replaceAll(sss,".gif ", ".gif\" ");
        sss=StringUtils.replaceAll(sss,".BMP ", ".BMP\" ");
        sss=StringUtils.replaceAll(sss,".bmp ", ".bmp\" ");

        // 获取文本中所有的链接
        //String regex;
        //final List<String> list = new ArrayList<String>();
        //regex = "[a-zA-z]+://[^\\s]*";
        //final Pattern pa = Pattern.compile(regex);
        //final Matcher ma = pa.matcher(sss);
        //while (ma.find()) {
        //    list.add(ma.group());
        //}


        System.out.println(sss);


    }
}
