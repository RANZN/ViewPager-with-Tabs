package com.ranzan.viewpagerwithtabs;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragmentA extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<DataModel> dataList=new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerViewA);
        setRecyclerView();

    }

    private void setRecyclerView() {
        DataAdapter dataAdapter = new DataAdapter(dataList);
        LinearLayoutManager linearLayout = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayout);
        recyclerView.setAdapter(dataAdapter);

    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        buildData();
    }

    private void buildData() {
        dataList.add(new DataModel("Ram"));
        dataList.add(new DataModel("Laxman"));
        dataList.add(new DataModel("Sita"));
        dataList.add(new DataModel("Lakshmi"));
        dataList.add(new DataModel("Ganesh"));
        dataList.add(new DataModel("Parvati"));
        dataList.add(new DataModel("Kartikeya"));
        dataList.add(new DataModel("Shiv"));
        dataList.add(new DataModel("Ridhi"));
        dataList.add(new DataModel("Sidhi"));
        dataList.add(new DataModel("Ganpati"));
        dataList.add(new DataModel("Ram"));
        dataList.add(new DataModel("Laxman"));
        dataList.add(new DataModel("Sita"));
        dataList.add(new DataModel("Lakshmi"));
        dataList.add(new DataModel("Ganesh"));
        dataList.add(new DataModel("Parvati"));
        dataList.add(new DataModel("Kartikeya"));
        dataList.add(new DataModel("Shiv"));
        dataList.add(new DataModel("Ridhi"));
        dataList.add(new DataModel("Sidhi"));
        dataList.add(new DataModel("Ganpati"));
        dataList.add(new DataModel("Ram"));
        dataList.add(new DataModel("Laxman"));
        dataList.add(new DataModel("Sita"));
        dataList.add(new DataModel("Lakshmi"));
        dataList.add(new DataModel("Ganesh"));
        dataList.add(new DataModel("Parvati"));
        dataList.add(new DataModel("Kartikeya"));
        dataList.add(new DataModel("Shiv"));
        dataList.add(new DataModel("Ridhi"));
        dataList.add(new DataModel("Sidhi"));
        dataList.add(new DataModel("Ganpati"));

    }
}