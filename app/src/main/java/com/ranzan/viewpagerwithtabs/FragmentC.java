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

public class FragmentC extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<DataModel> dataList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerViewC);
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
        dataList.add(new DataModel("munnar"));
        dataList.add(new DataModel("abhey falls"));
        dataList.add(new DataModel("love lake"));
        dataList.add(new DataModel("coalkers walk"));
        dataList.add(new DataModel("munnar"));
        dataList.add(new DataModel("munnar"));
        dataList.add(new DataModel("abhey falls"));
        dataList.add(new DataModel("love lake"));
        dataList.add(new DataModel("coalkers walk"));
        dataList.add(new DataModel("munnar"));
        dataList.add(new DataModel("abhey falls"));
        dataList.add(new DataModel("love lake"));
        dataList.add(new DataModel("coalkers walk"));
        dataList.add(new DataModel("munnar"));
        dataList.add(new DataModel("abhey falls"));
        dataList.add(new DataModel("love lake"));
        dataList.add(new DataModel("coalkers walk"));
        dataList.add(new DataModel("munnar"));
        dataList.add(new DataModel("abhey falls"));
        dataList.add(new DataModel("love lake"));
        dataList.add(new DataModel("coalkers walk"));
        dataList.add(new DataModel("munnar"));
        dataList.add(new DataModel("abhey falls"));
        dataList.add(new DataModel("love lake"));
        dataList.add(new DataModel("coalkers walk"));
        dataList.add(new DataModel("munnar"));
        dataList.add(new DataModel("abhey falls"));
        dataList.add(new DataModel("love lake"));
        dataList.add(new DataModel("coalkers walk"));
        dataList.add(new DataModel("munnar"));
        dataList.add(new DataModel("abhey falls"));
        dataList.add(new DataModel("love lake"));
        dataList.add(new DataModel("coalkers walk"));
        dataList.add(new DataModel("munnar"));
        dataList.add(new DataModel("abhey falls"));
        dataList.add(new DataModel("love lake"));
        dataList.add(new DataModel("coalkers walk"));
        dataList.add(new DataModel("munnar"));
        dataList.add(new DataModel("abhey falls"));
        dataList.add(new DataModel("love lake"));
        dataList.add(new DataModel("coalkers walk"));
        dataList.add(new DataModel("munnar"));
        dataList.add(new DataModel("abhey falls"));
        dataList.add(new DataModel("love lake"));
        dataList.add(new DataModel("coalkers walk"));
        dataList.add(new DataModel("munnar"));
        dataList.add(new DataModel("abhey falls"));
        dataList.add(new DataModel("love lake"));
        dataList.add(new DataModel("coalkers walk"));
        dataList.add(new DataModel("munnar"));
        dataList.add(new DataModel("abhey falls"));
        dataList.add(new DataModel("love lake"));
        dataList.add(new DataModel("coalkers walk"));


    }

}