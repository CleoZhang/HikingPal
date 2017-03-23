package com.cpen391.module2.hikingpal.fragment;

import android.widget.Button;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.cpen391.module2.hikingpal.MainActivity;
import com.cpen391.module2.hikingpal.R;

import static com.cpen391.module2.hikingpal.MainActivity.buttonNum;
import static com.cpen391.module2.hikingpal.MainActivity.setButtonText;

/**
 * Created by YueyueZhang on 2017-03-12.
 */
public class NewTrailFragment extends Fragment {


    static MapViewFragment mapFragment;

    public NewTrailFragment() {
    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//
//    }

    public static Button trailButton;
    public static Button finishButton;



    public static Button button1;
    public static Button button2;
    public static Button button3;
    public static Button button4;

    public static Spinner spinner;
    public static ArrayAdapter<CharSequence> adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LinearLayout ll = (LinearLayout) inflater.inflate(R.layout.new_trail_frag, container, false);

        trailButton = (Button) ll.findViewById(R.id.trail_Button);
//        buttonNum=1;
        setButtonText(trailButton,buttonNum);

        MainActivity.trailButtonClick(trailButton);

        finishButton = (Button) ll.findViewById(R.id.finish_Button);
        MainActivity.finishButtonClick(finishButton);

        Button rateButton = (Button) ll.findViewById(R.id.rate_track);


//        button1 = (Button) ll.findViewById(R.id.button1);
//        MainActivity.exerciseButtonClick(button1, 1);
//        button2 = (Button) ll.findViewById(R.id.button2);
//        MainActivity.exerciseButtonClick(button2, 2);
//        button3 = (Button) ll.findViewById(R.id.button3);
//        MainActivity.exerciseButtonClick(button3, 3);
//        button4 = (Button) ll.findViewById(R.id.button4);
//        MainActivity.exerciseButtonClick(button4, 4);

        spinner = (Spinner) ll.findViewById(R.id.spinner1);
        adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.map_type, android.R.layout.simple_spinner_item);
        MainActivity.mapType_spinner();

        rateButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendMessage("Q");
            }
        });



        return ll;
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        final boolean hasWritePermission = RuntimePermissionUtil.checkPermissonGranted(this,
//                Manifest.permission.WRITE_EXTERNAL_STORAGE);
//
//        imageView = (ImageView) findViewById(R.id.imageView);
//        hidden_txtview = (TextView) findViewById(R.id.hidden_txtview);
//
//        capture_screenshot = (ImageButton) findViewById(R.id.capture_screenshot);
//        capture_screenshot.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // Take screen shot
//                //bitmap = ScreenShott.getInstance().takeScreenShotOfView(hidden_txtview);
//                //bitmap = ScreenShott.getInstance().takeScreenShotOfJustView(hidden_txtview);
//                bitmap = ScreenShott.getInstance().takeScreenShotOfRootView(view);
//                // Display in imageview
//                imageView.setImageBitmap(bitmap);
//            }
//        });
}
