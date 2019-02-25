package in.goals.adapters;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import androidx.core.content.res.TypedArrayUtils;
import androidx.room.TypeConverter;

/**
 * Converter is used Rooms Database to store List
 */
public class Converter implements Serializable {

    /**
     * Converts comma seperated Int to List
     * @param value
     * @return List<String>
     */
    @TypeConverter
    public List<Integer> fromStrToList(String value) {
        List<Integer> result=new ArrayList<>();

        if(!TextUtils.isEmpty(value)) {
            Type listType = new TypeToken<ArrayList<Integer>>() {
            }.getType();
            result = new Gson().fromJson(value, listType);
        }
        return result;
    }

    /**
     *
     * @param intList
     * @return String
     */
    @TypeConverter
    public String fromListToStr(List<Integer> intList) {
        String value = "";
        if(intList!=null && intList.size()>0) {
            Gson gson = new Gson();
            value = gson.toJson(intList);
        }
        return value;
    }
}

