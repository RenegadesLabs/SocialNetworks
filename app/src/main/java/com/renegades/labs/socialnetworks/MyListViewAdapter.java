package com.renegades.labs.socialnetworks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Виталик on 25.12.2016.
 */

public class MyListViewAdapter extends BaseAdapter {

    Context mContext;
    List<String> historyList;

    public MyListViewAdapter(Context mContext, List<String> historyList) {
        this.mContext = mContext;
        this.historyList = historyList;
    }

    static class ViewHolder {
        TextView textItem;
    }

    @Override
    public int getCount() {
        return historyList.size();
    }

    @Override
    public Object getItem(int i) {
        return historyList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_item, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.textItem = (TextView) view.findViewById(R.id.listText);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.textItem.setText((String) getItem(i));
        return view;
    }

    @Override
    public boolean isEnabled(int position) {
        return true;
    }
}
