package com.dongnao.lsn9_path_dragbubbleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private DragBubbleView mDragBubbleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDragBubbleView = (DragBubbleView) findViewById(R.id.drag_buddle_view);
        findViewById(R.id.reset_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDragBubbleView.reset();
            }
        });
    }
}
