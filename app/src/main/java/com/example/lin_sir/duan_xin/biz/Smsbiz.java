package com.example.lin_sir.duan_xin.biz;

import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.telephony.SmsManager;

import com.example.lin_sir.duan_xin.Bean.SendedMsg;
import com.example.lin_sir.duan_xin.db.SmsProvider;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

/**
 * Created by lin_sir on 2016/1/30.
 */
public class Smsbiz {

    private Context context;

    public Smsbiz(Context context) {

        this.context = context;

    }

    public int sendMsg(String number, String msg, PendingIntent sentPi, PendingIntent deliverPi) {

        SmsManager smsManager = SmsManager.getDefault();
        ArrayList<String> contents = smsManager.divideMessage(msg);
        for (String content : contents) {
            smsManager.sendTextMessage(number, null, content, sentPi, deliverPi);
        }
        return contents.size();

    }


    public int sendMsg(Set<String> numbers, SendedMsg msg, PendingIntent sentPi, PendingIntent deliverPi) {

        save(msg);
        int resutlt = 0;
        for (String number : numbers) {
            int count = sendMsg(number, msg.getMsg(), sentPi, deliverPi);
            resutlt += count;
        }
        return resutlt;
    }

    private void save(SendedMsg sendedMsg) {

        sendedMsg.setDate(new Date());
        ContentValues values = new ContentValues();
        values.put(SendedMsg.COLUMN_DATE, sendedMsg.getDate().getTime());
        values.put(SendedMsg.COLUMN_FES_NAME, sendedMsg.getFestivalName());
        values.put(SendedMsg.COLUMN_MSG, sendedMsg.getMsg());
        values.put(SendedMsg.COLUMN_NAMES, sendedMsg.getNames());
        values.put(SendedMsg.COLUMN_NUMBERS, sendedMsg.getNumbers());

        context.getContentResolver().insert(SmsProvider.URI_SMS_ALL, values);

    }


}




















