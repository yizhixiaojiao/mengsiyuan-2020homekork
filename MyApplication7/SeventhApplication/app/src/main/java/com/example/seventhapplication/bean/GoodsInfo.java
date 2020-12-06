package com.example.seventhapplication.bean;


import com.example.seventhapplication.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "VOKOOTY文艺包", "保温杯", "马夹", "钥匙扣挂件", "兰蔻口红", "手提袋","卡通棉拖","遮阳伞"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "原创 文艺新款 皮包简约百搭 学院风单肩包 大包包",
            "美国cup mystery进口材质 弹跳开盖 创意手绘卡通保温杯",
            "2020年新款 秋冬羊羔毛绒马夹 外穿百搭外套",
            "BlankLabel 白兔挂件 ins少女心钥匙扣 手帐挂饰",
            "兰蔻全新菁纯柔雾哑光唇膏口红888小野莓",
            "新款 小清新可爱 饭盒包 手拎小布包带饭手提布袋",
            "棉拖鞋女冬 可爱秋冬 家用室内防滑保暖厚底加绒毛绒卡通 棉拖",
            "ins全自动 遮阳两用 晴雨伞五折 小巧便捷防晒 防紫外线女 折叠太阳伞 "
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {108, 98, 55, 15, 198, 28,35,39};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.bag_s, R.drawable.bottle_s, R.drawable.clothes_s,
            R.drawable.pendant_s,R.drawable.red_s, R.drawable.sack_s,
            R.drawable.shoes_s,R.drawable.umbrella_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.bag, R.drawable.bottle, R.drawable.clothes,
            R.drawable.pendant, R.drawable.red, R.drawable.sack,
            R.drawable.shoe,R.drawable.umbrella
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
