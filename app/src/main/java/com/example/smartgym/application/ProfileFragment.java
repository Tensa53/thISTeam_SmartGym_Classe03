package com.example.smartgym.application;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.smartgym.R;
import com.example.smartgym.infoUtenti.application.service.InfoUtentiServiceImpl;
import com.example.smartgym.infoUtenti.application.activity.LoginActivity;

public class ProfileFragment extends Fragment implements View.OnClickListener {

    Button btLogout;

    public ProfileFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btLogout = view.findViewById(R.id.btLogout);

        btLogout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id) {
            case R.id.btLogout: onLogout();
            break;
        }
    }

    private void onLogout() {
        InfoUtentiServiceImpl infoUtentiService = new InfoUtentiServiceImpl();
        infoUtentiService.logout();

        Intent intent = new Intent(getContext(), LoginActivity.class);
        startActivity(intent);
        getActivity().finish();
    }
}