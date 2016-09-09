package com.king1033.mvp_network_demo.bean;

import java.util.List;

/**
 * @Author:king1033
 * @Desc:
 * @Time:2016/9/7
 */
public class GiftBean {

    /**
     * ad : [{"id":240,"title":"围攻大菠萝","flag":1,"iconurl":"/allimgs/img_iad/_1472794247237.jpg","addtime":"2016-09-13","giftid":"1472794074","appName":"围攻大菠萝","appLogo":"/allimgs/img_iapp/201606/_1465980636128.jpg","appId":1465980713},{"id":238,"title":"18梦境异闻录潜梦礼包","flag":1,"iconurl":"/allimgs/img_iad/_1472122193157.jpg","addtime":"2016-08-18","giftid":"1471860368","appName":"18梦境异闻录","appLogo":"/allimgs/img_iapp/201607/_1468900723619.png","appId":1468820958},{"id":235,"title":"恋舞OL礼包","flag":1,"iconurl":"/allimgs/img_iad/_1472032570351.jpg","addtime":"2016-08-17","giftid":"1472026775","appName":"恋舞OL","appLogo":"/userfiles/applogo/_1422412216871.jpg","appId":1411637357},{"id":233,"title":"暴走战姬礼包 ","flag":1,"iconurl":"/allimgs/img_iad/_1471417660563.jpg","addtime":"2016-08-15","giftid":"1471412714","appName":"暴走战姬","appLogo":"/allimgs/img_iapp/201608/_1470641271034.png","appId":1470641361},{"id":239,"title":"装甲联盟新手上车礼包","flag":1,"iconurl":"/allimgs/img_iad/_1472538740742.jpg","addtime":"2016-08-14","giftid":"1472538627","appName":"装甲联盟","appLogo":"/allimgs/img_iapp/201607/_1469582962469.jpg","appId":1466126543}]
     * pageno : 174
     * list : [{"id":"1473138942","iconurl":"/allimgs/img_iapp/201609/_1473057597023.png","giftname":"初级礼包","number":99,"exchanges":1,"type":1,"gname":"陆战雄狮","integral":0,"isintegral":0,"addtime":"2016-09-21","ptype":"1,2,","operators":"","flag":1},{"id":"1473139388","iconurl":"/allimgs/img_iapp/201609/_1473057597023.png","giftname":"中级礼包","number":50,"exchanges":0,"type":1,"gname":"陆战雄狮","integral":0,"isintegral":0,"addtime":"2016-09-21","ptype":"1,2,","operators":"","flag":1},{"id":"1473140504","iconurl":"/allimgs/img_iapp/201609/_1473057597023.png","giftname":"高级礼包","number":50,"exchanges":0,"type":1,"gname":"陆战雄狮","integral":0,"isintegral":0,"addtime":"2016-09-21","ptype":"1,2,","operators":"","flag":1},{"id":"1473144438","iconurl":"/allimgs/img_iapp/201609/_1473142963745.jpg","giftname":"媒体公测礼包","number":10,"exchanges":0,"type":1,"gname":"激斗西游 ","integral":0,"isintegral":0,"addtime":"2016-09-06","ptype":"1,2,","operators":"","flag":1},{"id":"1473147203","iconurl":"/allimgs/img_iapp/201606/_1466748346763.png","giftname":"霸服礼包","number":30,"exchanges":0,"type":1,"gname":"镜花奇缘","integral":0,"isintegral":0,"addtime":"2016-09-06","ptype":"1,2,","operators":"","flag":1},{"id":"1473147805","iconurl":"/allimgs/img_iapp/201606/_1466748346763.png","giftname":"跨服礼包","number":30,"exchanges":0,"type":1,"gname":"镜花奇缘","integral":0,"isintegral":0,"addtime":"2016-09-06","ptype":"1,2,","operators":"","flag":1},{"id":"1473148383","iconurl":"/allimgs/img_iapp/201606/_1466748346763.png","giftname":"心动礼包","number":30,"exchanges":0,"type":1,"gname":"镜花奇缘","integral":0,"isintegral":0,"addtime":"2016-09-06","ptype":"1,2,","operators":"","flag":1},{"id":"1473149810","iconurl":"/allimgs/img_iapp/201606/_1465177034263.jpg","giftname":"教师节礼包","number":49,"exchanges":1,"type":1,"gname":"进击的少女","integral":0,"isintegral":0,"addtime":"2016-09-06","ptype":"1,2,","operators":"","flag":1},{"id":"1473150382","iconurl":"/allimgs/img_iapp/201606/_1467277926275.png","giftname":"国战礼包","number":5,"exchanges":0,"type":1,"gname":"北凉悍刀行","integral":0,"isintegral":0,"addtime":"2016-09-06","ptype":"1,2,","operators":"","flag":1},{"id":"1473152542","iconurl":"/allimgs/img_iapp/201608/_1471590108721.png","giftname":"礼包","number":50,"exchanges":0,"type":1,"gname":"皇牌机娘","integral":0,"isintegral":0,"addtime":"2016-09-06","ptype":"1,","operators":"","flag":1}]
     */

    private int pageno;
    /**
     * id : 240
     * title : 围攻大菠萝
     * flag : 1
     * iconurl : /allimgs/img_iad/_1472794247237.jpg
     * addtime : 2016-09-13
     * giftid : 1472794074
     * appName : 围攻大菠萝
     * appLogo : /allimgs/img_iapp/201606/_1465980636128.jpg
     * appId : 1465980713
     */

    private List<AdBean> ad;
    /**
     * id : 1473138942
     * iconurl : /allimgs/img_iapp/201609/_1473057597023.png
     * giftname : 初级礼包
     * number : 99
     * exchanges : 1
     * type : 1
     * gname : 陆战雄狮
     * integral : 0
     * isintegral : 0
     * addtime : 2016-09-21
     * ptype : 1,2,
     * operators :
     * flag : 1
     */

    private List<ListBean> list;

    public int getPageno() {
        return pageno;
    }

    public void setPageno(int pageno) {
        this.pageno = pageno;
    }

    public List<AdBean> getAd() {
        return ad;
    }

    public void setAd(List<AdBean> ad) {
        this.ad = ad;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class AdBean {
        private int id;
        private String title;
        private int flag;
        private String iconurl;
        private String addtime;
        private String giftid;
        private String appName;
        private String appLogo;
        private int appId;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getFlag() {
            return flag;
        }

        public void setFlag(int flag) {
            this.flag = flag;
        }

        public String getIconurl() {
            return iconurl;
        }

        public void setIconurl(String iconurl) {
            this.iconurl = iconurl;
        }

        public String getAddtime() {
            return addtime;
        }

        public void setAddtime(String addtime) {
            this.addtime = addtime;
        }

        public String getGiftid() {
            return giftid;
        }

        public void setGiftid(String giftid) {
            this.giftid = giftid;
        }

        public String getAppName() {
            return appName;
        }

        public void setAppName(String appName) {
            this.appName = appName;
        }

        public String getAppLogo() {
            return appLogo;
        }

        public void setAppLogo(String appLogo) {
            this.appLogo = appLogo;
        }

        public int getAppId() {
            return appId;
        }

        public void setAppId(int appId) {
            this.appId = appId;
        }
    }

    public static class ListBean {
        private String id;
        private String iconurl;
        private String giftname;
        private int number;
        private int exchanges;
        private int type;
        private String gname;
        private int integral;
        private int isintegral;
        private String addtime;
        private String ptype;
        private String operators;
        private int flag;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIconurl() {
            return iconurl;
        }

        public void setIconurl(String iconurl) {
            this.iconurl = iconurl;
        }

        public String getGiftname() {
            return giftname;
        }

        public void setGiftname(String giftname) {
            this.giftname = giftname;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public int getExchanges() {
            return exchanges;
        }

        public void setExchanges(int exchanges) {
            this.exchanges = exchanges;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getGname() {
            return gname;
        }

        public void setGname(String gname) {
            this.gname = gname;
        }

        public int getIntegral() {
            return integral;
        }

        public void setIntegral(int integral) {
            this.integral = integral;
        }

        public int getIsintegral() {
            return isintegral;
        }

        public void setIsintegral(int isintegral) {
            this.isintegral = isintegral;
        }

        public String getAddtime() {
            return addtime;
        }

        public void setAddtime(String addtime) {
            this.addtime = addtime;
        }

        public String getPtype() {
            return ptype;
        }

        public void setPtype(String ptype) {
            this.ptype = ptype;
        }

        public String getOperators() {
            return operators;
        }

        public void setOperators(String operators) {
            this.operators = operators;
        }

        public int getFlag() {
            return flag;
        }

        public void setFlag(int flag) {
            this.flag = flag;
        }
    }
}
