package com.java110.entity.wechat;

/**
 * @description: 物业费消息模板data
 * @author: zcc
 * @create: 2020-06-16 09:43
 *
 *
 * 标题物业缴费通知
 * 行业IT科技 - 互联网|电子商务
 * 详细内容{{first.DATA}}
 * 用户地址：{{keyword1.DATA}}
 * 物业费月份：{{keyword2.DATA}}
 * 物业费金额：{{keyword3.DATA}}
 * {{remark.DATA}}
 *
 *
 **/
public class Data {
    private  Content first;
    private  Content keyword1;
    private  Content keyword2;
    private  Content keyword3;
    private  Content remark;

    public Content getFirst() {
        return first;
    }

    public void setFirst(Content first) {
        this.first = first;
    }

    public Content getKeyword1() {
        return keyword1;
    }

    public void setKeyword1(Content keyword1) {
        this.keyword1 = keyword1;
    }

    public Content getKeyword2() {
        return keyword2;
    }

    public void setKeyword2(Content keyword2) {
        this.keyword2 = keyword2;
    }

    public Content getKeyword3() {
        return keyword3;
    }

    public void setKeyword3(Content keyword3) {
        this.keyword3 = keyword3;
    }

    public Content getRemark() {
        return remark;
    }

    public void setRemark(Content remark) {
        this.remark = remark;
    }
}
