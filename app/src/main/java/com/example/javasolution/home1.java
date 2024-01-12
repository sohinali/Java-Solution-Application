package com.example.javasolution;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class home1 extends Fragment {

    private Button Btn1,Btn2,Btn3,Btn4,Btn5,Btn6,Btn7,Btn8,Btn9,Btn10,Btn11,Btn12,Btn13;

    

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home1, container, false);
        
    }
    
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        Btn1 = (Button) view.findViewById(R.id.Btn1);
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity4.class);
                getActivity().startActivity(intent);
            }
        });
        Btn2 = (Button) view.findViewById(R.id.Btn2);
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity5.class);
                getActivity().startActivity(intent);
            }
        });
        Btn3 = (Button) view.findViewById(R.id.Btn3);
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity6.class);
                getActivity().startActivity(intent);
            }
        });

        Btn4 = (Button) view.findViewById(R.id.Btn4);
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity7.class);
                getActivity().startActivity(intent);
            }
        });


        Btn5 = (Button) view.findViewById(R.id.Btn5);
        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity8.class);
                getActivity().startActivity(intent);
            }
        });

        Btn6 = (Button) view.findViewById(R.id.Btn6);
        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity9.class);
                getActivity().startActivity(intent);
            }
        });

        Btn7 = (Button) view.findViewById(R.id.Btn7);
        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity10.class);
                getActivity().startActivity(intent);
            }
        });

        Btn8 = (Button) view.findViewById(R.id.Btn8);
        Btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity11.class);
                getActivity().startActivity(intent);
            }
        });

        Btn9 = (Button) view.findViewById(R.id.Btn9);
        Btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity12.class);
                getActivity().startActivity(intent);
            }
        });
        Btn10 = (Button) view.findViewById(R.id.Btn10);
        Btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity13.class);
                getActivity().startActivity(intent);
            }
        });

        Btn11 = (Button) view.findViewById(R.id.Btn11);
        Btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity14.class);
                getActivity().startActivity(intent);
            }
        });
        Btn12 = (Button) view.findViewById(R.id.Btn12);
        Btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity15.class);
                getActivity().startActivity(intent);
            }
        });
        Btn13 = (Button) view.findViewById(R.id.Btn13);
        Btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity16.class);
                getActivity().startActivity(intent);
            }
        });
    }
}