package baway.com.qihongshun20170405.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.net.URL;
import java.net.URLConnection;

import baway.com.qihongshun20170405.MainActivity;
import baway.com.qihongshun20170405.R;
import baway.com.qihongshun20170405.bean.DataBean;

import static android.content.ContentValues.TAG;

/**
 * 
 */

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.MyViewHolder> {
    private Context context;
    private DataBean dataBean = new DataBean();
    private DisplayImageOptions options;
    private boolean type = true;


    public RecycleAdapter(Context context) {
        this.context = context;
        options = new DisplayImageOptions.Builder()
                .showImageOnLoading(R.mipmap.ic_launcher) //设置图片在下载期间显示的图片
                .showImageForEmptyUri(R.mipmap.ic_launcher)//设置图片Uri为空或是错误的时候显示的图片
                .showImageOnFail(R.mipmap.ic_launcher)  //设置图片加载/解码过程中错误时候显示的图片
                .cacheInMemory(true)//设置下载的图片是否缓存在内存中
                .cacheOnDisc(true)//设置下载的图片是否缓存在SD卡中
                .considerExifParams(true)  //是否考虑JPEG图像EXIF参数（旋转，翻转）
                .imageScaleType(ImageScaleType.EXACTLY_STRETCHED)//设置图片以如何的编码方式显示
                .bitmapConfig(Bitmap.Config.RGB_565)//设置图片的解码类型//
                //.delayBeforeLoading(int delayInMillis)//int delayInMillis为你设置的下载前的延迟时间
                //设置图片加入缓存前，对bitmap进行设置
                //.preProcessor(BitmapProcessor preProcessor)
                .resetViewBeforeLoading(true)//设置图片在下载前是否重置，复位
                .displayer(new RoundedBitmapDisplayer(20))//是否设置为圆角，弧度为多少
                .displayer(new FadeInBitmapDisplayer(100))//是否图片加载好后渐入的动画时间
                .build();//构建完成
    }

    public DataBean getDataBean() {
        return dataBean;
    }

    public void setDataBean(DataBean dataBean) {
        this.dataBean = dataBean;
        notifyDataSetChanged();
    }

    public void setType(boolean type) {
        this.type = type;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
                context).inflate(R.layout.recycle_item, parent,
                false));
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv_item_title.setText(dataBean.apk.get(position).name);
        holder.tv_item_config.setText(Integer.parseInt(dataBean.apk.get(position).apkSize) / 1024 / 1024 + "M /" + Integer.parseInt(dataBean.apk.get(position).downloadTimes) / 10000 + "万");
        ImageLoader.getInstance().displayImage(dataBean.apk.get(position).iconUrl, holder.iv_item, options);

    }


    @Override
    public int getItemCount() {
        if (dataBean.apk == null)
            return 0;
        return dataBean.apk.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_item_title;
        TextView tv_item_config;
        ImageView iv_item;

        public MyViewHolder(final View itemView) {
            super(itemView);
            tv_item_title = (TextView) itemView.findViewById(R.id.tv_item_title);
            tv_item_config = (TextView) itemView.findViewById(R.id.tv_item_config);
            iv_item = (ImageView) itemView.findViewById(R.id.iv_item);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (type)
                        showPopupWindow(itemView, getPosition());
                }
            });
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    if (type) {
                        dataBean.apk.remove(getPosition());
                        notifyDataSetChanged();
                    }
                    return false;
                }
            });
        }
    }

    int downloadLength = 0;
    protected void showPopupWindow(View view, int position) {
        View contentView = LayoutInflater.from(context).inflate(
                R.layout.popup_layout, null);
        // 设置按钮的点击事件

        TextView tv_popup_layout_title = (TextView) contentView.findViewById(R.id.tv_popup_layout_title);
        tv_popup_layout_title.setText(dataBean.apk.get(position).name);
        tv_popup_layout_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new Thread() {
                    @Override
                    public void run() {
                        super.run();
                        try {
                            String downloadUrl = "http://www.microvirt.com/new_market/apk/cok_xiaoyao_ew233079972.apk";
                            String fileName = "baidu_16785426.apk";
                            URL url = new URL(downloadUrl);
                            URLConnection conn = url.openConnection();
                            // 读取下载文件总大小
                            int fileSize = conn.getContentLength();
                            byte[] buffer = new byte[1024];
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(conn.getInputStream());
                            File sdDir = Environment.getExternalStorageDirectory();//获取跟目录
                            FileOutputStream outputStream = new FileOutputStream(new File(sdDir.getAbsoluteFile()+"/"+fileName));
                            // 获取BufferedOutputStream对象
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
                            int len = 0;
                            while ((len = bufferedInputStream.read(buffer, 0, 1024)) != -1) {
                                bufferedOutputStream.write(buffer, 0, len);
                                downloadLength += 1024;
                            }


                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }
                }.start();
            }
        });

        final PopupWindow popupWindow = new PopupWindow(contentView,
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, true);
        popupWindow.setTouchable(true);
        popupWindow.setTouchInterceptor(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.i("mengdd", "onTouch : ");
                return false;
                // 这里如果返回true的话，touch事件将被拦截
            }
        });
        popupWindow.showAsDropDown(view);

    }
}
