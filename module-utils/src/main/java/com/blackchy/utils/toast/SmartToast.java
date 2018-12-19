package com.blackchy.utils.toast;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by haiyu.chen on 2018/12/19.
 */

public class SmartToast {
  private Toast mToast;
  private Context mContext;

  public SmartToast(Context context) {
    this.mContext = context;
  }

  public void showToast(String text) {
    if (mToast == null) {
      mToast = Toast.makeText(mContext, text, Toast.LENGTH_LONG);
    } else {
      mToast.setText(text);
    }
    mToast.show();
  }
}
