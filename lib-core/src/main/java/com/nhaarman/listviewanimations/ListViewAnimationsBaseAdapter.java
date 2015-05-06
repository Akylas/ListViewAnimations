package com.nhaarman.listviewanimations;

import com.nhaarman.listviewanimations.util.OnNotifyDataSetChanged;

import android.widget.BaseAdapter;

public abstract class ListViewAnimationsBaseAdapter extends BaseAdapter implements NotifiableAdapter {
    private OnNotifyDataSetChanged mOnNotifyDataSetChanged;
    
    @Override
    public void setOnNotifyDataSetChanged(final OnNotifyDataSetChanged onNotifyDataSetChanged) {
        mOnNotifyDataSetChanged = onNotifyDataSetChanged;
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        if (mOnNotifyDataSetChanged != null) {
            mOnNotifyDataSetChanged.onNotifyDataSetChanged();
        }
    }
}
