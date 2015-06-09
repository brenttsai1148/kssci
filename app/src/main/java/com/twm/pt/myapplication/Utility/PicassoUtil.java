package com.twm.pt.myapplication.Utility;

import android.content.Context;
import android.util.Patterns;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by brent1148 on 15/5/19.
 */
public class PicassoUtil {
    private final static String TAG = PicassoUtil.class.getSimpleName();

    public static boolean load(Context context,ImageView view,String imgUrl){
        try {
            if(isValidUrl(imgUrl)){
                Picasso.with(context)
                        .load(imgUrl)
                        .into(view);
                return true;
            }
        }catch (Exception e){
            L.e(TAG,e.getMessage());
        }
        return false;
    }

//    public static boolean load(Context context,ImageView view,String imgUrl,Drawable errorDrawable){
//        try {
//            if(isValidUrl(imgUrl)){
//                Picasso.with(context)
//                        .load(imgUrl)
//                        .error()
//                        .into(view);
//                return true;
//            }
//        }catch (Exception e){
//            L.e(TAG,e.getMessage());
//
//        }
//        return false;
//    }

    private static boolean isValidUrl(String imgUrl){
        if(imgUrl.isEmpty())
            return false;
        if(!Patterns.WEB_URL.matcher(imgUrl).matches())
            return false;
        return true;
    }
}
