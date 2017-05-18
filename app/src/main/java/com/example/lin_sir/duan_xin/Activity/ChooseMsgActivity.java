package com.example.lin_sir.duan_xin.Activity;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.lin_sir.duan_xin.Bean.Festival;
import com.example.lin_sir.duan_xin.Bean.FestivalLab;
import com.example.lin_sir.duan_xin.Bean.Msg;
import com.example.lin_sir.duan_xin.R;
import com.example.lin_sir.duan_xin.fragment.FestivalCategoryFragment;

public class ChooseMsgActivity extends AppCompatActivity {

    private ListView mLvMsgs;
    private FloatingActionButton mFabTosend;
    private ArrayAdapter<Msg> mAdapter;
    private int mFestivalId;
    private LayoutInflater mInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_msg);
        mInflater = LayoutInflater.from(this);
        mFestivalId = getIntent().getIntExtra(FestivalCategoryFragment.ID_FESTIVAL, -1);

        setTitle(FestivalLab.getmInstance().getFestivlaById(mFestivalId).getName());
        initviews();
        initEvent();

    }

    private void initEvent() {

        mFabTosend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SendMsgActivity.toActivity(ChooseMsgActivity.this, mFestivalId, -1);
            }
        });

    }

    public void initviews() {
        mLvMsgs = (ListView) findViewById(R.id.id_lv_msgs);
        mFabTosend = (FloatingActionButton) findViewById(R.id.id_fab_toSend);

        mLvMsgs.setAdapter(mAdapter = new ArrayAdapter<Msg>(this, -1, FestivalLab.getmInstance().getMsgByFestivalId(mFestivalId)) {

            @Override
            public View getView(final int position, View convertView, ViewGroup parent) {

                if (convertView == null) {
                    convertView = mInflater.inflate(R.layout.item_message, parent, false);
                    Log.i("--->---","test");
                }
                TextView content = (TextView) convertView.findViewById(R.id.id_tv_content);
                Button toSend = (Button) convertView.findViewById(R.id.id_btn_toSend);
                content.setText("   " + getItem(position).getContent());
                toSend.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SendMsgActivity.toActivity(ChooseMsgActivity.this, mFestivalId, getItem(position).getId());
                    }
                });

                return convertView;
            }
        });
    }
}







