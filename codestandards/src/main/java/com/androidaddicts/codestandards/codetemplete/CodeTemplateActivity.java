package com.androidaddicts.codestandards.codetemplete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.androidaddicts.codestandards.R;

/**
 * @author Ung8023
 */
public class CodeTemplateActivity extends AppCompatActivity implements View.OnClickListener{

    // ------------------------------------------------------------------
    // Constants
    // ------------------------------------------------------------------

    public static final String TAG = "CodeTemplateActivity";

    // ------------------------------------------------------------------
    // Properties
    // ------------------------------------------------------------------

    public TextView pubTextView;
    protected TextView proTextView;
    private TextView priTextView;

    TextView defTextView;

    View.OnClickListener clickListener = null;


    // ------------------------------------------------------------------
    // Constructors
    // ------------------------------------------------------------------

    // 构造方法模块

    // ------------------------------------------------------------------
    // Lifecycle methods
    // ------------------------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_templete);
        initView();
        initData();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    // ------------------------------------------------------------------
    // Override methods
    // ------------------------------------------------------------------

    // 重写方法

    // ------------------------------------------------------------------
    // View.OnClickListener Implements
    // ------------------------------------------------------------------

    @Override
    public void onClick(View v) {
        Log.d(TAG, "OnClick");
    }

    // ------------------------------------------------------------------
    // Interface2 Implements
    // ------------------------------------------------------------------

    // 实现接口2方法

    // ------------------------------------------------------------------
    // public methods
    // ------------------------------------------------------------------

    public void showDialog() {

    }

    public void invisibleButton() {

    }

    // ------------------------------------------------------------------
    // protected methods
    // ------------------------------------------------------------------

    protected void dismiss() {

    }

    // ------------------------------------------------------------------
    // action methods
    // ------------------------------------------------------------------

    private void toDetail() {

    }

    private void toSetting() {

    }

    // ------------------------------------------------------------------
    // getters and setters methods
    // ------------------------------------------------------------------


    // ------------------------------------------------------------------
    // private methods
    // ------------------------------------------------------------------

    private void initView() {

    }

    private void initData() {

    }

    // ------------------------------------------------------------------
    // inner classes or interfaces
    // ------------------------------------------------------------------

    // 内部类或者接口

}
