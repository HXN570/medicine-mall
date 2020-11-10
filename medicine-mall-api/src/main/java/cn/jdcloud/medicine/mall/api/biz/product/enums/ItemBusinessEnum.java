package cn.jdcloud.medicine.mall.api.biz.product.enums;

import java.util.HashMap;
import java.util.Map;

public enum ItemBusinessEnum {
    STAT_0((byte)1, "直营"),
    STAT_2((byte)2, "联营");

    private String name;
    private Byte code;

    public static Map<String, Byte> getMap() {
        Map<String, Byte> map = new HashMap<>();
        ItemBusinessEnum[] arr$ = values();
        int len$ = arr$.length;
        for(int i$ = 0; i$ < len$; ++i$) {
            ItemBusinessEnum s = arr$[i$];
            map.put(s.name, s.code);
        }
        return map;
    }
    public static Map<Byte, String> getReverseMap() {
        Map<Byte, String> map = new HashMap<>();
        ItemBusinessEnum[] arr$ = values();
        int len$ = arr$.length;
        for(int i$ = 0; i$ < len$; ++i$) {
            ItemBusinessEnum s = arr$[i$];
            map.put(s.code, s.name);
        }
        return map;
    }

    public static String[] getNames() {
        ItemBusinessEnum[] arr = values();
        int len = arr.length;
        String[] strings = new String[len];
        for(int i = 0; i < len; ++i) {
            ItemBusinessEnum s = arr[i];
            strings[i]=s.name;
        }
        return strings;
    }

    private ItemBusinessEnum(Byte code, String name) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getCode() {
        return this.code;
    }

    public void setCode(Byte code) {
        this.code = code;
    }
}
