package com.example.lin_sir.duan_xin.Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lin_sir on 2016/1/28.
 */
public class FestivalLab {


    public static FestivalLab mInstance;

    private List<Festival> mFEstivals = new ArrayList<Festival>();
    private List<Msg> mMsgs = new ArrayList<Msg>();

    private FestivalLab() {

        mFEstivals.add(new Festival(1, "国庆节"));
        mFEstivals.add(new Festival(2, "中秋节"));
        mFEstivals.add(new Festival(3, "元旦"));
        mFEstivals.add(new Festival(4, "春节"));
        mFEstivals.add(new Festival(5, "端午节"));
        mFEstivals.add(new Festival(6, "七夕节"));
        mFEstivals.add(new Festival(7, "圣诞节"));
        mFEstivals.add(new Festival(8, "儿童节"));

        mMsgs.add(new Msg(1, 1, "我是第1条数据"));
        mMsgs.add(new Msg(2, 1, "我是第2条数据"));
        mMsgs.add(new Msg(3, 1, "我是第3条数据"));
        mMsgs.add(new Msg(4, 1, "我是第4条数据"));
        mMsgs.add(new Msg(5, 1, "我是第5条数据"));
        mMsgs.add(new Msg(6, 1, "我是第6条数据"));
        mMsgs.add(new Msg(7, 1, "我是第7条数据"));
        mMsgs.add(new Msg(8, 1, "我是第8条数据"));
        mMsgs.add(new Msg(9, 1, "我是第9条数据"));

        mMsgs.add(new Msg(1, 2, "我是第1条数据"));
        mMsgs.add(new Msg(2, 2, "我是第2条数据"));
        mMsgs.add(new Msg(3, 2, "我是第3条数据"));
        mMsgs.add(new Msg(4, 2, "我是第4条数据"));
        mMsgs.add(new Msg(5, 2, "我是第5条数据"));
        mMsgs.add(new Msg(6, 2, "我是第6条数据"));
        mMsgs.add(new Msg(7, 2, "我是第7条数据"));
        mMsgs.add(new Msg(8, 2, "我是第8条数据"));
        mMsgs.add(new Msg(9, 2, "我是第9条数据"));

        mMsgs.add(new Msg(1, 3, "我是第1条数据"));
        mMsgs.add(new Msg(2, 3, "我是第2条数据"));
        mMsgs.add(new Msg(3, 3, "我是第3条数据"));
        mMsgs.add(new Msg(4, 3, "我是第4条数据"));
        mMsgs.add(new Msg(5, 3, "我是第5条数据"));
        mMsgs.add(new Msg(6, 3, "我是第6条数据"));
        mMsgs.add(new Msg(7, 3, "我是第7条数据"));
        mMsgs.add(new Msg(8, 3, "我是第8条数据"));
        mMsgs.add(new Msg(9, 3, "我是第9条数据"));

        mMsgs.add(new Msg(1, 4, "我是第1条数据"));
        mMsgs.add(new Msg(2, 4, "我是第2条数据"));
        mMsgs.add(new Msg(3, 4, "我是第3条数据"));
        mMsgs.add(new Msg(4, 4, "我是第4条数据"));
        mMsgs.add(new Msg(5, 4, "我是第5条数据"));
        mMsgs.add(new Msg(6, 4, "我是第6条数据"));
        mMsgs.add(new Msg(7, 4, "我是第7条数据"));
        mMsgs.add(new Msg(8, 4, "我是第8条数据"));
        mMsgs.add(new Msg(9, 4, "我是第9条数据"));

        mMsgs.add(new Msg(1, 5, "我是第1条数据"));
        mMsgs.add(new Msg(2, 5, "我是第2条数据"));
        mMsgs.add(new Msg(3, 5, "我是第3条数据"));
        mMsgs.add(new Msg(4, 5, "我是第4条数据"));
        mMsgs.add(new Msg(5, 5, "我是第5条数据"));
        mMsgs.add(new Msg(6, 5, "我是第6条数据"));
        mMsgs.add(new Msg(7, 5, "我是第7条数据"));
        mMsgs.add(new Msg(8, 5, "我是第8条数据"));
        mMsgs.add(new Msg(9, 5, "我是第9条数据"));

        mMsgs.add(new Msg(1, 6, "我是第1条数据"));
        mMsgs.add(new Msg(2, 6, "我是第2条数据"));
        mMsgs.add(new Msg(3, 6, "我是第3条数据"));
        mMsgs.add(new Msg(4, 6, "我是第4条数据"));
        mMsgs.add(new Msg(5, 6, "我是第5条数据"));
        mMsgs.add(new Msg(6, 6, "我是第6条数据"));
        mMsgs.add(new Msg(7, 6, "我是第7条数据"));
        mMsgs.add(new Msg(8, 6, "我是第8条数据"));
        mMsgs.add(new Msg(9, 6, "我是第9条数据"));

        mMsgs.add(new Msg(1, 7, "我是第1条数据"));
        mMsgs.add(new Msg(2, 7, "我是第2条数据"));
        mMsgs.add(new Msg(3, 7, "我是第3条数据"));
        mMsgs.add(new Msg(4, 7, "我是第4条数据"));
        mMsgs.add(new Msg(5, 7, "我是第5条数据"));
        mMsgs.add(new Msg(6, 7, "我是第6条数据"));
        mMsgs.add(new Msg(7, 7, "我是第7条数据"));
        mMsgs.add(new Msg(8, 7, "我是第8条数据"));
        mMsgs.add(new Msg(9, 7, "我是第9条数据"));
    }

    public List<Msg> getMsgByFestivalId(int fesId) {
        List<Msg> msgs = new ArrayList<>();
        for (Msg msg : mMsgs) {
            if (msg.getFestivalId() == fesId) {
                msgs.add(msg);
            }
        }
        return msgs;
    }

    public Msg getMsgByMsgId(int id) {
        for (Msg msg : mMsgs) {
            if (msg.getId() == id)
                return msg;
        }
        return null;
    }


    public List<Festival> getmFEstivals() {
        return new ArrayList<Festival>(mFEstivals);
    }

    public Festival getFestivlaById(int fesId) {

        for (Festival festival : mFEstivals) {
            if (festival.getId() == fesId)
                return festival;
        }
        return null;
    }

    public static FestivalLab getmInstance() {

        if (mInstance == null) {    //为了提高效率
            synchronized (FestivalLab.class) {  //为了保证线程之间互斥的进入
                if (mInstance == null)
                    mInstance = new FestivalLab();
            }
        }

        return mInstance;
    }


}
