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
        return inflater.inflate(R.layout.fragment_content, container, false);

        /*
        Type      | Measure | Layout |
        Frame     |0.017    |0.008   |
        Linear    |0.015    |0.014   |
        Table     |0.027    |0.010   |
        Relative  |0.021    |0.003   |
        Constraint|0.455    |0.006   |
        Flex      |0.065    |0.008   |
         */
    }
}
