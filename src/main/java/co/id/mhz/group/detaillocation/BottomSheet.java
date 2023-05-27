package co.id.mhz.group.detaillocation;

import android.content.Context;
import android.widget.Toast;

public class BottomSheet {

    public BottomSheet() {
    }

    public static void s(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }
}
