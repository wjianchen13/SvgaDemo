package com.example.svgademo;

public class Utils {

    public static void log(String str) {
        System.out.println("============================> " + str);
    }

    public static String getTestString() {
        String str = "[\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1698979821000,\n" +
                "                \"dailyGoldPrice\": 999,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 6993,\n" +
                "                \"headwearId\": 159,\n" +
                "                \"headwearName\": \"黑天鹅\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-11-03/bb9666c1b2f7e5b15a413c9e2039397d.png?imageslim\",\n" +
                "                \"seqNo\": 0,\n" +
                "                \"type\": 5,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPoleLPK98u/fmGO7hQNmRXhuW1wKUKFWMTHP5taoy5137tjRajPW5OJ9WXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1692954668000,\n" +
                "                \"dailyGoldPrice\": 80,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 1,\n" +
                "                \"goldPrice\": 80,\n" +
                "                \"headwearId\": 133,\n" +
                "                \"headwearName\": \"粉色头像框\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-08-25/6fecf9088e3f4adac2393e0f90ba3f87.png?imageslim\",\n" +
                "                \"seqNo\": 0,\n" +
                "                \"type\": 1,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPooU7wXV78aUaonZQaBsupBHWXGrAsUDxVSxZAnnDYDteMqpLah1st7dWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1692954724000,\n" +
                "                \"dailyGoldPrice\": 80,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 560,\n" +
                "                \"headwearId\": 134,\n" +
                "                \"headwearName\": \"蓝色头像框12\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-08-25/23efa1c4fd68731e9e64d0f855fdc230.png?imageslim\",\n" +
                "                \"seqNo\": 0,\n" +
                "                \"type\": 1,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPo9BTHeNmGj9di5TAZtedA7AZdajrPItMnOIRHiakbbMFlOAmOKWINDNWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1692954776000,\n" +
                "                \"dailyGoldPrice\": 80,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 1,\n" +
                "                \"goldPrice\": 80,\n" +
                "                \"headwearId\": 135,\n" +
                "                \"headwearName\": \"绿色头像框\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-08-25/475e56135641d2c767ac970592892eee.png?imageslim\",\n" +
                "                \"seqNo\": 0,\n" +
                "                \"type\": 1,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPoEDMuuu+9NZk8xWNwX3B8Dd8e7yJifSM00XnfVlqjvitr3XzgtXd/D9WXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": false,\n" +
                "                \"createTime\": 1697010687000,\n" +
                "                \"dailyGoldPrice\": 999999,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 1,\n" +
                "                \"goldPrice\": 999999,\n" +
                "                \"headwearId\": 138,\n" +
                "                \"headwearName\": \"Golden legend\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-10-11/fecdf96267b93fbb8e35d90c1d17676c.png?imageslim\",\n" +
                "                \"seqNo\": 0,\n" +
                "                \"type\": 3,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPoHw4lVocjFC2OzE2Gw0h2heuF/jDp1fCyMLaq2XFsSxkA40vNJvY9NdWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": false,\n" +
                "                \"createTime\": 1697011295000,\n" +
                "                \"dailyGoldPrice\": 999999,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 6999993,\n" +
                "                \"headwearId\": 140,\n" +
                "                \"headwearName\": \"Wings of kingship\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-10-11/f309d9cb8a3366bc6f5b4bec51a24e08.png?imageslim\",\n" +
                "                \"seqNo\": 0,\n" +
                "                \"type\": 3,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPo0/2TBQd/q01Aiv5fAL2ZgCyLlPwzL3caf4XnSrIJ8PuweaIi5f/1GNWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": false,\n" +
                "                \"createTime\": 1697184162000,\n" +
                "                \"dailyGoldPrice\": 101,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 9999,\n" +
                "                \"goldPrice\": 999999,\n" +
                "                \"headwearId\": 145,\n" +
                "                \"headwearName\": \"CP0\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-10-13/21e8f1c254b54964ac0ded84f9c779cb.png?imageslim\",\n" +
                "                \"seqNo\": 0,\n" +
                "                \"type\": 4,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPoYM6fhe0EQDf/hdSyALBt4OorsMRvyi5I4CBdC8UhfDrlUu1ak5OAxtWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": false,\n" +
                "                \"createTime\": 1698661011000,\n" +
                "                \"dailyGoldPrice\": 999999,\n" +
                "                \"dynamicHeader\": false,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 6999993,\n" +
                "                \"headwearId\": 157,\n" +
                "                \"headwearName\": \"black\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-10-30/5eef2d8b903ca4f5113e553f4c0a205b.png?imageslim\",\n" +
                "                \"seqNo\": 0,\n" +
                "                \"type\": 5,\n" +
                "                \"vggUrl\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1698979775000,\n" +
                "                \"dailyGoldPrice\": 999,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 6993,\n" +
                "                \"headwearId\": 158,\n" +
                "                \"headwearName\": \"白天鹅\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-11-03/754cddd7e506924d2ad0ae1f41eea6dc.png?imageslim\",\n" +
                "                \"seqNo\": 0,\n" +
                "                \"type\": 5,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPoiQ13lraABB7buPI9UzkM/4z+KsR9w4j9DI6TOBuAZF5T4NDrA7ocStWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1692954808000,\n" +
                "                \"dailyGoldPrice\": 70,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 490,\n" +
                "                \"headwearId\": 136,\n" +
                "                \"headwearName\": \"紫色头像框\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-08-25/959e721fcb4ae4d3bb905d2c2d221bdc.png?imageslim\",\n" +
                "                \"seqNo\": 0,\n" +
                "                \"type\": 1,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPo7B1WtweMP5g7hqhaZkBDUb532Mqf9i2MPpRTWovgUSEoxiox8B/oMtWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1699436299000,\n" +
                "                \"dailyGoldPrice\": 20,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 140,\n" +
                "                \"headwearId\": 160,\n" +
                "                \"headwearName\": \"APNG测试\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-11-08/4e90b9bd05baded4631bb672c374c94d.png?imageslim\",\n" +
                "                \"seqNo\": 0,\n" +
                "                \"type\": 1,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPoods3ksgn+yGtFqbZXp3pMAN2zfUxy9WM5NPYK4kxm5DE+qNIXXtpWNWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": false,\n" +
                "                \"createTime\": 1699518806000,\n" +
                "                \"dailyGoldPrice\": 999999,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 6999993,\n" +
                "                \"headwearId\": 161,\n" +
                "                \"headwearName\": \"WeekStarTop1\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-11-09/3627f5fd7c1a31f6efd3ffc4f2d9fb66.png?imageslim\",\n" +
                "                \"seqNo\": 0,\n" +
                "                \"type\": 3,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPolm22wzZKYAYvjTh69c6vwS1X+tQRy6sDiy+JpQpC1JHIiamAgGsSDtWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": false,\n" +
                "                \"createTime\": 1699518992000,\n" +
                "                \"dailyGoldPrice\": 999999,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 6999993,\n" +
                "                \"headwearId\": 162,\n" +
                "                \"headwearName\": \"WeekStarTop2\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-11-09/44fe912109e99be682c463ec95cb9c05.png?imageslim\",\n" +
                "                \"seqNo\": 0,\n" +
                "                \"type\": 3,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPoXnQDMG5VifYy4+ZeIQEKIcxTYQ4+AScCeq8mof85f5TuJr6/udUxKdWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": false,\n" +
                "                \"createTime\": 1699519068000,\n" +
                "                \"dailyGoldPrice\": 999999,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 6999993,\n" +
                "                \"headwearId\": 163,\n" +
                "                \"headwearName\": \"WeekStarTop3\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-11-09/02ae0922ae76ae4be4fc0082148378db.png?imageslim\",\n" +
                "                \"seqNo\": 0,\n" +
                "                \"type\": 3,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPoeTBoO6SoQy/YvKO4JOhpLXMcEdyLetixdofxVqNy0tn+7Hy0nEcARtWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": false,\n" +
                "                \"createTime\": 1699583952000,\n" +
                "                \"dailyGoldPrice\": 999999,\n" +
                "                \"dynamicHeader\": false,\n" +
                "                \"effectiveTime\": 9999,\n" +
                "                \"goldPrice\": 9998990001,\n" +
                "                \"headwearId\": 164,\n" +
                "                \"headwearName\": \"CP TEST\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 90,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-11-10/e1172e778fd716a7fa049faf2082150c.gif?imageslim\",\n" +
                "                \"seqNo\": 0,\n" +
                "                \"type\": 4,\n" +
                "                \"vggUrl\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1700043253000,\n" +
                "                \"dailyGoldPrice\": 30,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 210,\n" +
                "                \"headwearId\": 166,\n" +
                "                \"headwearName\": \"shate\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-11-15/424b62566ffc91e57090a6e75e34974f.svga?imageslim\",\n" +
                "                \"seqNo\": 0,\n" +
                "                \"type\": 1,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPoods3ksgn+yGE7Xh+wbLbqEo5EQz+bPqcDXA3HpfWAWDcKhO3SZoXUtWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1700044408000,\n" +
                "                \"dailyGoldPrice\": 30,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 210,\n" +
                "                \"headwearId\": 167,\n" +
                "                \"headwearName\": \"shatejing\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-11-15/acbefdec4a161c1344f6bc8c5b89e9ad.png?imageslim\",\n" +
                "                \"seqNo\": 0,\n" +
                "                \"type\": 1,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPoMG1jy91SEq0SGjv8H1t/Cm98ngr6nyYldzgnm+LPgx0gZG0sVbYaVdWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1690423622000,\n" +
                "                \"dailyGoldPrice\": 2999,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 1,\n" +
                "                \"goldPrice\": 2999,\n" +
                "                \"headwearId\": 122,\n" +
                "                \"headwearName\": \"two\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 23,\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-07-24/55f6cf51b3ee87e2dfc22a436720ec23.png?imageslim\",\n" +
                "                \"seqNo\": 0,\n" +
                "                \"type\": 1,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPo/GfhxElpcwxgUIxXQ9mez8/7Bdyq5jSXN31WJOkOPeu++T1hSPuYmNWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1698030665000,\n" +
                "                \"dailyGoldPrice\": 600,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 4200,\n" +
                "                \"headwearId\": 154,\n" +
                "                \"headwearName\": \"6CPtest\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-10-23/6a6aee2ff0fa57edac76098cf8ad3b3f.png?imageslim\",\n" +
                "                \"seqNo\": 1,\n" +
                "                \"type\": 5,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPo1RGyKW1ahR5bc6GzlTRQPYsg8+RlstYBdIaaYgQTpNeLU4odurj3TNWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": false,\n" +
                "                \"createTime\": 1697187244000,\n" +
                "                \"dailyGoldPrice\": 101,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 9999,\n" +
                "                \"goldPrice\": 999999,\n" +
                "                \"headwearId\": 150,\n" +
                "                \"headwearName\": \"CP80\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 80,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-10-13/7b1a3b8db6501848e330046f3e04764c.png?imageslim\",\n" +
                "                \"seqNo\": 1,\n" +
                "                \"type\": 4,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPohs1vyc1k4KdrgQw2L6E/5C+DCwDrg/W73ZS2/9lmzOGVHINeLB0MhdWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": false,\n" +
                "                \"createTime\": 1697187217000,\n" +
                "                \"dailyGoldPrice\": 101,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 9999,\n" +
                "                \"goldPrice\": 999999,\n" +
                "                \"headwearId\": 149,\n" +
                "                \"headwearName\": \"CP70\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 70,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-10-13/511b25fc95999fa9f0f7f04e130a08ed.png?imageslim\",\n" +
                "                \"seqNo\": 1,\n" +
                "                \"type\": 4,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPoN3XZdz37gWi3Y5OiupTQcBJMZZ9XNJbWznF09gUgYMv/U4PWKv9s39WXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": false,\n" +
                "                \"createTime\": 1697187191000,\n" +
                "                \"dailyGoldPrice\": 101,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 9999,\n" +
                "                \"goldPrice\": 999999,\n" +
                "                \"headwearId\": 148,\n" +
                "                \"headwearName\": \"CP60\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 60,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-10-13/09e8729066f37851dc1a3ad932bfe5e1.png?imageslim\",\n" +
                "                \"seqNo\": 1,\n" +
                "                \"type\": 4,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPoq9NcrlpjoXQp9wSgQJqoAgpeeUnUJF2JoB9CMehzWdRnlhRRndSSbNWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": false,\n" +
                "                \"createTime\": 1697187130000,\n" +
                "                \"dailyGoldPrice\": 101,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 9999,\n" +
                "                \"goldPrice\": 999999,\n" +
                "                \"headwearId\": 147,\n" +
                "                \"headwearName\": \"CP40\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 40,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-10-13/26b19a17f2bd1526e9c95bbd401e27de.png?imageslim\",\n" +
                "                \"seqNo\": 1,\n" +
                "                \"type\": 4,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPoXahp+vr0Vs3Piq61b2s0OxRp0M0r0Sn3agxsLtFGgdnfrTUokS/7hdWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": false,\n" +
                "                \"createTime\": 1697187111000,\n" +
                "                \"dailyGoldPrice\": 101,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 9999,\n" +
                "                \"goldPrice\": 999999,\n" +
                "                \"headwearId\": 146,\n" +
                "                \"headwearName\": \"CP20\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 20,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-10-13/30cfa14ea3079517e4f52685e39b27bc.png?imageslim\",\n" +
                "                \"seqNo\": 1,\n" +
                "                \"type\": 4,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPovDDaV0TcYRqryEI1gQdNICsg89cxefkaExY30Sfp3KqgvQsJ9nMrjdWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1698030458000,\n" +
                "                \"dailyGoldPrice\": 100,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 700,\n" +
                "                \"headwearId\": 151,\n" +
                "                \"headwearName\": \"1CPtest\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-10-23/af33fff3575145e0b1d20938c24114f2.png?imageslim\",\n" +
                "                \"seqNo\": 1,\n" +
                "                \"type\": 5,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPoM19VhwV566cE24WrcO+P76DN8XmzpxXadQYNrqhb7I6rqpJbO6wrutWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1698030596000,\n" +
                "                \"dailyGoldPrice\": 300,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 2100,\n" +
                "                \"headwearId\": 152,\n" +
                "                \"headwearName\": \"3CPtest\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-10-23/f0ab2696a1289ce9d0d9a979bb3f1721.png?imageslim\",\n" +
                "                \"seqNo\": 1,\n" +
                "                \"type\": 5,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPo1RGyKW1ahR5IHDML7KHlKW9zSHhlgTjSx1QIQSC07zjWysYi53blctWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1698030632000,\n" +
                "                \"dailyGoldPrice\": 500,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 3500,\n" +
                "                \"headwearId\": 153,\n" +
                "                \"headwearName\": \"5CPtest\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-10-23/07222e2134669a1814128c738c574000.png?imageslim\",\n" +
                "                \"seqNo\": 1,\n" +
                "                \"type\": 5,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPoM19VhwV566ejZ3VBPPMgKofybhnn8da1Cav5mXyS7t+tFdzYzwSyItWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1698030696000,\n" +
                "                \"dailyGoldPrice\": 700,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 4900,\n" +
                "                \"headwearId\": 155,\n" +
                "                \"headwearName\": \"7CPtest\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-10-23/f517f89667317fae02100744c8085925.png?imageslim\",\n" +
                "                \"seqNo\": 1,\n" +
                "                \"type\": 5,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPofI1is99XXPCk9I1hzhjFS0enzZ48+Jm93kzKavIIx38qEOFrj9PiVdWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1686904427000,\n" +
                "                \"dailyGoldPrice\": 715,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 5000,\n" +
                "                \"headwearId\": 124,\n" +
                "                \"headwearName\": \"gentleman purple\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-06-14/c52b8cfd18188f411f27a13a2212f0a6.png?imageslim\",\n" +
                "                \"seqNo\": 1,\n" +
                "                \"type\": 1,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPoozPpvbUBHN6mBNMAR/0nq46RmMJSiFznrl28aGLLWtKGv796aEBGkNWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1698030731000,\n" +
                "                \"dailyGoldPrice\": 800,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 5600,\n" +
                "                \"headwearId\": 156,\n" +
                "                \"headwearName\": \"8CPtest\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-10-23/7822d8a356e1e8f3bb189e226a66b0ad.png?imageslim\",\n" +
                "                \"seqNo\": 1,\n" +
                "                \"type\": 5,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPo8oyIkdwyUEI+rWoC++6r+4A6lXgyYgRHwESZFs6uohr481Ec8Ath8NWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1692259273000,\n" +
                "                \"dailyGoldPrice\": 67,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 3,\n" +
                "                \"goldPrice\": 199,\n" +
                "                \"headwearId\": 130,\n" +
                "                \"headwearName\": \"pinknew\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-08-17/a25409ad7dfda81674b26394d2c4337b.png?imageslim\",\n" +
                "                \"seqNo\": 1,\n" +
                "                \"type\": 1,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPoU7GAUlhyNtlFsksCiVHdHfu1ya07WzMof39TWMf74NdMfCfdxPoVtdWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1690443118000,\n" +
                "                \"dailyGoldPrice\": 333,\n" +
                "                \"dynamicHeader\": false,\n" +
                "                \"effectiveTime\": 3,\n" +
                "                \"goldPrice\": 999,\n" +
                "                \"headwearId\": 128,\n" +
                "                \"headwearName\": \"superstar\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-07-27/b25900a78e39902a4defbf71b749ba23.png?imageslim\",\n" +
                "                \"seqNo\": 1,\n" +
                "                \"type\": 1,\n" +
                "                \"vggUrl\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1692600448000,\n" +
                "                \"dailyGoldPrice\": 111,\n" +
                "                \"dynamicHeader\": false,\n" +
                "                \"effectiveTime\": 1,\n" +
                "                \"goldPrice\": 111,\n" +
                "                \"headwearId\": 131,\n" +
                "                \"headwearName\": \"pink2\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-08-21/b3193ad5160c6246d6d982dc14b4e115.png?imageslim\",\n" +
                "                \"seqNo\": 2,\n" +
                "                \"type\": 1,\n" +
                "                \"vggUrl\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1691130509000,\n" +
                "                \"dailyGoldPrice\": 222,\n" +
                "                \"dynamicHeader\": false,\n" +
                "                \"effectiveTime\": 3,\n" +
                "                \"goldPrice\": 666,\n" +
                "                \"headwearId\": 129,\n" +
                "                \"headwearName\": \"pranda\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-08-04/fb5c9a7c550c203b45dc9522f686495c.png?imageslim\",\n" +
                "                \"seqNo\": 3,\n" +
                "                \"type\": 1,\n" +
                "                \"vggUrl\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1692600514000,\n" +
                "                \"dailyGoldPrice\": 10,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 2,\n" +
                "                \"goldPrice\": 20,\n" +
                "                \"headwearId\": 132,\n" +
                "                \"headwearName\": \"pink1\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"markPic\": \"\",\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-08-21/2c4862170cf5065d30c8095260b5fe73.png?imageslim\",\n" +
                "                \"seqNo\": 3,\n" +
                "                \"type\": 1,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPopyFfhkExbNpu3dUExncR7cy1dBR1zgOd4mSMuINioGK3//T3eauLpNWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": false,\n" +
                "                \"createTime\": 1681798700000,\n" +
                "                \"dailyGoldPrice\": 33334,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 30,\n" +
                "                \"goldPrice\": 999999,\n" +
                "                \"headwearId\": 11,\n" +
                "                \"headwearName\": \"SVIP 1\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"nobleId\": 1,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/Fv2A5ojdnCASpfTGuSNaLV3Wu10o?imageslim\",\n" +
                "                \"seqNo\": 11,\n" +
                "                \"type\": 2,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSl9Knho4EtR0c/2Z8hW06IaV+hcdWAA57SUT0guTOdSX+7HIntKC88bi\n" +
                "veHnjiYsiw==\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": false,\n" +
                "                \"createTime\": 1681798743000,\n" +
                "                \"dailyGoldPrice\": 33334,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 30,\n" +
                "                \"goldPrice\": 999999,\n" +
                "                \"headwearId\": 12,\n" +
                "                \"headwearName\": \"SVIP 2\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"nobleId\": 2,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/FpIsvdbDvGNfxSEmvEiOEzLwAcX0?imageslim\",\n" +
                "                \"seqNo\": 12,\n" +
                "                \"type\": 2,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSl9Knho4EtR0c7U36sE+ujs8ahwvXXiBSmA9QQ6Uo4WSsKnFbS9vh+Pi\n" +
                "veHnjiYsiw==\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": false,\n" +
                "                \"createTime\": 1681798788000,\n" +
                "                \"dailyGoldPrice\": 33334,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 30,\n" +
                "                \"goldPrice\": 999999,\n" +
                "                \"headwearId\": 13,\n" +
                "                \"headwearName\": \"SVIP 3\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"nobleId\": 3,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/FqScIuhVVMiSdiLSPDdXfJ_jMK5c?imageslim\",\n" +
                "                \"seqNo\": 13,\n" +
                "                \"type\": 2,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSl9Knho4EtR0bx+aVNjT8oEeqz2boImTO3RqSm/lGA2fxIGukSK2m1Pi\n" +
                "veHnjiYsiw==\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": false,\n" +
                "                \"createTime\": 1681798845000,\n" +
                "                \"dailyGoldPrice\": 33334,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 30,\n" +
                "                \"goldPrice\": 999999,\n" +
                "                \"headwearId\": 14,\n" +
                "                \"headwearName\": \"SVIP 4\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"nobleId\": 4,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/FidxHPLD9f_IiXfIkeoiOT_vHb3-?imageslim\",\n" +
                "                \"seqNo\": 14,\n" +
                "                \"type\": 2,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSl9Knho4EtR0h0iPXmHMrdiFkgnnoHMOVWZBVJQb+wBXVc58iyRVFuni\n" +
                "veHnjiYsiw==\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": false,\n" +
                "                \"createTime\": 1692948824000,\n" +
                "                \"dailyGoldPrice\": 33334,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 30,\n" +
                "                \"goldPrice\": 999999,\n" +
                "                \"headwearId\": 15,\n" +
                "                \"headwearName\": \"SVIP 5\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"nobleId\": 5,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/Fqnc2bXxaAqmACOsBa9HmLFsb9ra?imageslim\",\n" +
                "                \"seqNo\": 15,\n" +
                "                \"type\": 2,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPoNc4yIgJZMYH+of5gvK25MFvo4NHpnigS/aScTVuNP8L7ste7KIPKj9WXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": false,\n" +
                "                \"createTime\": 1692948841000,\n" +
                "                \"dailyGoldPrice\": 33334,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 30,\n" +
                "                \"goldPrice\": 999999,\n" +
                "                \"headwearId\": 16,\n" +
                "                \"headwearName\": \"SVIP 6\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"nobleId\": 6,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/FurmU3lI47jEvZfA0_bKvQ5NKFhD?imageslim\",\n" +
                "                \"seqNo\": 16,\n" +
                "                \"type\": 2,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPoEDMuuu+9NZnmDahQNyBaxfRbaYG4OHyTXQZ1Fy2ZPBpC4LDBZJFyg9WXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1690184168000,\n" +
                "                \"dailyGoldPrice\": 15,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 99,\n" +
                "                \"headwearId\": 107,\n" +
                "                \"headwearName\": \"Baby Pig\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-07-24/3fe140c2db372680d0d19b13ed642dec.png?imageslim\",\n" +
                "                \"seqNo\": 107,\n" +
                "                \"type\": 1,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPoi15re/0fbVmBdKlYEYGOKACCyJjlLpPOu22+CmAF46gSo+SO5P4yoNWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1690184190000,\n" +
                "                \"dailyGoldPrice\": 15,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 99,\n" +
                "                \"headwearId\": 108,\n" +
                "                \"headwearName\": \"Future star\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-07-24/0f41f53f2c3bf9d205a656d8740f477f.png?imageslim\",\n" +
                "                \"seqNo\": 108,\n" +
                "                \"type\": 1,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPonZVP8Gx6epx+yOMcYrMuKSvGXgvJcyOuKpNOU8jkcRUXIsUo+kUHa9WXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1690440412000,\n" +
                "                \"dailyGoldPrice\": 15,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 99,\n" +
                "                \"headwearId\": 109,\n" +
                "                \"headwearName\": \"Green grass\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-07-27/3b767fac91ec6d9b3928a3c9e5c8ef4a.png?imageslim\",\n" +
                "                \"seqNo\": 109,\n" +
                "                \"type\": 1,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPorhYfBP8Hm13ZXTZBrV6KHYXc7PtRWsOUgXb9faWpJ/JlsUr78kFXYdWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1690440507000,\n" +
                "                \"dailyGoldPrice\": 27,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 188,\n" +
                "                \"headwearId\": 110,\n" +
                "                \"headwearName\": \"Summer style\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-07-27/ea28dd7c429f0df9f84d7645ee91f1d2.png?imageslim\",\n" +
                "                \"seqNo\": 110,\n" +
                "                \"type\": 1,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPoK01m1QqkER0fjZp1QMI3TBOxE7aMMOtKa4/0s4qBBiUg/X79y4xa+9WXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1690440598000,\n" +
                "                \"dailyGoldPrice\": 27,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 188,\n" +
                "                \"headwearId\": 111,\n" +
                "                \"headwearName\": \"Primary eros\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-07-27/3300c6efb2072190c687eb715837b9a0.png?imageslim\",\n" +
                "                \"seqNo\": 111,\n" +
                "                \"type\": 1,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPomz8Fn7/PMRJBR8/FvmFkM1pVS6pspqJ6GrxxTVmymfPM6L6QPkq4C9WXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1690441279000,\n" +
                "                \"dailyGoldPrice\": 27,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 188,\n" +
                "                \"headwearId\": 112,\n" +
                "                \"headwearName\": \"Rabbit\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-07-27/1155cc938fc9f2edf7b71a909b7057a2.png?imageslim\",\n" +
                "                \"seqNo\": 112,\n" +
                "                \"type\": 1,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPouA1V5KmCsDu74hr3+nk6hj8yxCbbd4lKrCF4vASSDezoFGQ1rIzfHNWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1690441478000,\n" +
                "                \"dailyGoldPrice\": 42,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 288,\n" +
                "                \"headwearId\": 113,\n" +
                "                \"headwearName\": \"Headline\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-07-27/98593c3b6796936f105c4c47d4c6746e.png?imageslim\",\n" +
                "                \"seqNo\": 113,\n" +
                "                \"type\": 1,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPocKaafXvRSJTQJ0ziXL/zUZ31ngtnFAc5t6r/1TKkvdRpAipYYVvLb9WXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1690442193000,\n" +
                "                \"dailyGoldPrice\": 42,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 288,\n" +
                "                \"headwearId\": 114,\n" +
                "                \"headwearName\": \"Romantic bike\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-07-27/00edbf89b7abadda82b53cabe9605415.png?imageslim\",\n" +
                "                \"seqNo\": 114,\n" +
                "                \"type\": 1,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPoyK/UJrpOgGiT8pzR2U0IYhi+NZivNPpTEqgcmo6MVndyUEpStMDGqdWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"allowPurse\": true,\n" +
                "                \"createTime\": 1690442451000,\n" +
                "                \"dailyGoldPrice\": 42,\n" +
                "                \"dynamicHeader\": true,\n" +
                "                \"effectiveTime\": 7,\n" +
                "                \"goldPrice\": 288,\n" +
                "                \"headwearId\": 115,\n" +
                "                \"headwearName\": \"Captain Tsubasa\",\n" +
                "                \"headwearStatus\": 1,\n" +
                "                \"isTimeLimit\": true,\n" +
                "                \"leftLevel\": 0,\n" +
                "                \"nobleId\": 0,\n" +
                "                \"picUrl\": \"https://img.ayomet.com/upload/headwear/2023-07-27/d0b0790eed0e369fc5c40fa634c1bff0.png?imageslim\",\n" +
                "                \"seqNo\": 115,\n" +
                "                \"type\": 1,\n" +
                "                \"vggUrl\": \"WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD0fbADgRQde3p8X4v6paPoIQdYXTSJgiLlZHKM7YDP2y8zDPJVxZOzfORFT3So0OG9HMtYL7Y3VdWXyvrZM1+CV6hNJieaIQM=\"\n" +
                "            }\n" +
                "        ]";

        return str;
    }

}
