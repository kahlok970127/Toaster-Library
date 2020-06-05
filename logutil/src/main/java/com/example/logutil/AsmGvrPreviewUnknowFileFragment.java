package com.example.logutil;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.example.logutil.databinding.AsmGvrFragmentPreviewUnknownfileBinding;

public class AsmGvrPreviewUnknowFileFragment extends Fragment  {


    private static final String ARG_INT_PAGER_POSITION = "ARG_INT_PAGER_POSITION";
    private static final String ARG_String_PAGER_FILEURL = "ARG_STRING_PAGER_FILEURL";
    private AsmGvrFragmentPreviewUnknownfileBinding mDataBinding;
    private String mViewPagerURL;
    private Uri mDirpath;
    private String mFilename = "";
    private String mFiletype = "";
    private Uri uri = null;
    private ActionBar mActionBar;
    private static final int SWIPE_MIN_DISTANCE = 60;
    private static final int SWIPE_MAX_OFF_PATH = 120;
    private Boolean IsSlideUp = false;
    private String realname = "";




}
