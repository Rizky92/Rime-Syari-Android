package com.rahmacom.rimesyarifix.ui.belanja;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rahmacom.rimesyarifix.R;

public class BelanjaFragment extends Fragment {

    private BelanjaViewModel mViewModel;

    public static BelanjaFragment newInstance() {
        return new BelanjaFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.belanja_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(BelanjaViewModel.class);
        // TODO: Use the ViewModel
    }

}