package com.deb.covid_19tracker.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.deb.covid_19tracker.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class NotificationsFragment extends Fragment {

AdView mAdView,mView;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
        mAdView = (AdView) root.findViewById(R.id.adView);
        mView = (AdView) root.findViewById(R.id.adView2);
        MobileAds.initialize(getActivity().getApplicationContext(), "ca-app-pub-8414081242022133~2559350315");
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mView.loadAd(adRequest);
        return root;
    }
}
