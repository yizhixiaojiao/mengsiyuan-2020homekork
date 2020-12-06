package com.example.myapplication8.bean;

import com.example.myapplication8.R;

import java.util.ArrayList;

public class Planet {

    public int image;
    public String name;
    public String desc;

    public Planet(int image, String name, String desc) {
        this.image = image;
        this.name = name;
        this.desc = desc;
    }

    private static int[] iconArray = {R.drawable.bag, R.drawable.bottle, R.drawable.clothes,
            R.drawable.pendant, R.drawable.red, R.drawable.sack,R.drawable.shoe,R.drawable.umbrella};
    private static String[] nameArray = {"VOKOOTY文艺包", "保温杯", "马夹", "钥匙扣挂件", "兰蔻口红", "手提袋","卡通棉拖","遮阳伞"};
    private static String[] descArray = {
            "原创 文艺新款 皮包简约百搭 学院风单肩包 大包包",
            "美国cup mystery进口材质 弹跳开盖 创意手绘卡通保温杯",
            "2020年新款 秋冬羊羔毛绒马夹 外穿百搭外套",
            "BlankLabel 白兔挂件 ins少女心钥匙扣 手帐挂饰",
            "兰蔻全新菁纯柔雾哑光唇膏口红888小野莓",
            "新款 小清新可爱 饭盒包 手拎小布包带饭手提布袋",
            "棉拖鞋女冬 可爱秋冬 家用室内防滑保暖厚底加绒毛绒卡通 棉拖",
            "ins全自动 遮阳两用 晴雨伞五折 小巧便捷防晒 防紫外线女 折叠太阳伞 "

    };

    public static ArrayList<Planet> getDefaultList() {
        ArrayList<Planet> planetList = new ArrayList<Planet>();
        for (int i = 0; i < iconArray.length; i++) {
            planetList.add(new Planet(iconArray[i], nameArray[i], descArray[i]));
        }
        return planetList;
    }
}
