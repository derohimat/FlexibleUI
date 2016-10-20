package net.derohimat.flexibleui.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import net.derohimat.flexibleui.MainActivity;
import net.derohimat.flexibleui.R;

public class SecondFragment extends Fragment {

    private Button btnSecond;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        btnSecond = (Button) view.findViewById(R.id.btn_second_fragment);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Second Fragment");
        ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setHasOptionsMenu(true);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().
                        replace(R.id.frame_container,
                                new ThirdFragment(),
                                ThirdFragment.class.getSimpleName())
                        .addToBackStack(null)
                        .commit();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            getFragmentManager().popBackStack();
        }
        return super.onOptionsItemSelected(item);
    }
}