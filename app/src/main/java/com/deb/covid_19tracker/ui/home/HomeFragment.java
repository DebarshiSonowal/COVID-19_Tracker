package com.deb.covid_19tracker.ui.home;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import com.deb.covid_19tracker.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private List<Integer>mDrawableResList = new ArrayList<>();
    private List<String> mStringList = new ArrayList<>();
private Adapter mAdapter;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final RecyclerView mRecyclerView= root.findViewById(R.id.re);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(layoutManager);
        mDrawableResList.add(R.drawable.zxc);
        mDrawableResList.add(R.drawable.distance);
        mDrawableResList.add(R.drawable.protection);
        mStringList.add("Wash your hands with soap frequently");
        mStringList.add("Keep minimum 1 meter distance from others");
        mStringList.add("Always cover your mouth with mask");
        mAdapter = new com.deb.covid_19tracker.Adapter(getContext(),mDrawableResList,mStringList);
        mRecyclerView.setAdapter(mAdapter);
        return root;
    }
}
