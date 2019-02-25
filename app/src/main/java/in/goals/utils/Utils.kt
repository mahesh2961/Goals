package `in`.goals.utils

import java.text.NumberFormat

class Utils {

    companion object {

        fun isValid(value:Double):Boolean= (value!=null && value>0)

        fun formatDouble(value:Double?):String {
            var instance=NumberFormat.getInstance()
            instance.maximumFractionDigits=0
            return instance.format(value)
        }
    }
}