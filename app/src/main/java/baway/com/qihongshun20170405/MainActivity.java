package baway.com.qihongshun20170405;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

import baway.com.qihongshun20170405.adapter.RecycleAdapter;
import baway.com.qihongshun20170405.bean.DataBean;

/**
 */
public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_main;
    private RecycleAdapter recycleAdapter;
    private DataBean dataBean;
    boolean flag = true;

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            recycleAdapter.setDataBean(dataBean);       // 请求到数据  更新adapter
            recycleAdapter.setType(false);
        }
    };
    private ImageView iv_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        iv_main = (ImageView) findViewById(R.id.iv_main);
        rv_main = (RecyclerView) findViewById(R.id.rv_main);
        recycleAdapter = new RecycleAdapter(MainActivity.this);
        rv_main.setAdapter(recycleAdapter);
        rv_main.setLayoutManager(new StaggeredGridLayoutManager(1,
                StaggeredGridLayoutManager.VERTICAL));
        //添加分割线
        rv_main.addItemDecoration(new DividerItemDecoration(
                MainActivity.this, DividerItemDecoration.VERTICAL));
        new Thread(){           //开启请求网络线程
            @Override
            public void run() {
                super.run();
                getData();
            }
        }.start();
        setListener();
    }

    /**
     * 设置监听
     */
    private void setListener() {
        iv_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag) {
                    rv_main.setLayoutManager(new StaggeredGridLayoutManager(2,
                            StaggeredGridLayoutManager.VERTICAL));
                    recycleAdapter.setType(true);
                }
                else {
                    rv_main.setLayoutManager(new StaggeredGridLayoutManager(1,
                            StaggeredGridLayoutManager.VERTICAL));
                    recycleAdapter.setType(false);
                }

                flag = !flag;
            }
        });
    }

    public void getData() {
        //创建okHttpClient对象
        OkHttpClient mOkHttpClient = new OkHttpClient();
        //创建一个Request
        final Request request = new Request.Builder()
                .url("http://60.205.221.238/stylesheets/newslist.txt")
                .build();
        //new call
        Call call = mOkHttpClient.newCall(request);
        //请求加入调度
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                Gson gson = new Gson();
                dataBean = gson.fromJson(App.htmlStr,DataBean.class);
                handler.sendEmptyMessage(0);
            }

            @Override
            public void onResponse(final Response response) throws IOException {
                String htmlStr =  response.body().string();
                Gson gson = new Gson();
                dataBean = gson.fromJson(htmlStr,DataBean.class);
                handler.sendEmptyMessage(0);
            }
        });

    }



}
