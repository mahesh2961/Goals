package `in`.goals.adapters

import `in`.goals.R
import `in`.goals.database.Goal
import android.text.method.LinkMovementMethod
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageView
import android.widget.TextView
import androidx.core.text.HtmlCompat
import androidx.core.text.HtmlCompat.FROM_HTML_MODE_COMPACT
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions


@BindingAdapter("imageFromUrl")
fun bindImageFromUrl(view: ImageView, imageUrl: String?) {
    val requestOptions = RequestOptions()
    requestOptions.placeholder(R.drawable.placeholder)
    requestOptions.error(R.drawable.image_error)
    requestOptions.diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)

    if (!imageUrl.isNullOrEmpty()) {
        Glide.with(view.context)
                .setDefaultRequestOptions(requestOptions)
                .load(imageUrl)
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(view)
    }
}


//@BindingAdapter("getGoalCompletion")
//fun getGoalCompletion(goal:Goal):String {
//
//    var str=""
//    if(goal.currentBalance!=null && goal.targetAmount!=null)
//        str=str+"$"+goal.currentBalance+" of "+goal.targetAmount
//    else if(goal.currentBalance!=null)
//        str=str+"Saved $"+goal.currentBalance+" till now"
//    else
//        str= str+"Taget Amount: $"+goal.targetAmount+""
//
//    return str;
//
//}




