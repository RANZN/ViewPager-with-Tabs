package com.ranzan.viewpagerwithtabs;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DataViewHolder extends RecyclerView.ViewHolder {
    private TextView text;

    public DataViewHolder(@NonNull View itemView) {
        super(itemView);
        text = itemView.findViewById(R.id.text);
    }

    void setData(DataModel data) {
        text.setText(data.getData());
    }
}
