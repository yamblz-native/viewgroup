package ru.yandex.yamblz.ui.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.yandex.yamblz.R;

public class ContentFragment extends BaseFragment {
    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return  inflater.inflate(R.layout.flex_fragment_layout, container, false);
//return  inflater.inflate(R.layout.constraint_fragment_layout, container, false);
//        return  inflater.inflate(R.layout.fragment_content, container, false);
//        return  inflater.inflate(R.layout.table_fragment_layout, container, false);
        return  inflater.inflate(R.layout.rel_fragment_content, container, false);
    }
}
