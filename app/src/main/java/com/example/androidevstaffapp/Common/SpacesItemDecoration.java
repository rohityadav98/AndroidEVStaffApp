package com.example.androidevstaffapp.Common;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SpacesItemDecoration extends RecyclerView.ItemDecoration {

    private int space;

    public SpacesItemDecoration(int space) {this.space=space;}

    @Override
    public void getItemOffsets( Rect outRect,  View view,
                                RecyclerView parent,  RecyclerView.State state) {
        outRect.bottom=space;
        outRect.left=space;
        outRect.right=space;
        outRect.top=space;
    }
}
