package com.example.lin_sir.duan_xin.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.TextView;

import com.example.lin_sir.duan_xin.Activity.ChooseMsgActivity;
import com.example.lin_sir.duan_xin.Bean.Festival;
import com.example.lin_sir.duan_xin.Bean.FestivalLab;
import com.example.lin_sir.duan_xin.R;

/**
 * Created by lin_sir on 2016/1/27.
 */
public class FestivalCategoryFragment extends Fragment {

    private GridView mgridView;
    private ArrayAdapter<Festival> mAdapter;
    private LayoutInflater mInflater;
    public static final String ID_FESTIVAL = "festival_id";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_festival_category, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        mInflater = LayoutInflater.from(getActivity());
        mgridView = (GridView) view.findViewById(R.id.id_gv_festival_category);
        mgridView.setAdapter(mAdapter = new ArrayAdapter<Festival>(getActivity(), -1, FestivalLab.getmInstance().getmFEstivals()) {

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                if (convertView == null) {
                    convertView = mInflater.inflate(R.layout.item_festival, parent, false);
                }
                TextView tv = (TextView) convertView.findViewById(R.id.id_tv_festival_name);
                tv.setText(getItem(position).getName());

                return convertView;

            }
        });

        mgridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getActivity(), ChooseMsgActivity.class);
                intent.putExtra(ID_FESTIVAL, mAdapter.getItem(position).getId());
                startActivity(intent);


            }
        });


    }
}

















