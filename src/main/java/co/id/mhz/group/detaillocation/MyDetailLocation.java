package co.id.mhz.group.detaillocation;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;

import java.text.DecimalFormat;
import java.util.List;

public class MyDetailLocation {

    public MyDetailLocation(){}

    public String detailLocation(Context context, String lat, String longi){
//        String lat = "-6.278065";
//        String longi = "106.854912";
        Geocoder geocoder = new Geocoder(context);
        List<Address> addressList;
        String result = "";
        try {
            addressList = geocoder.getFromLocation(
                    Double.parseDouble(lat),
                    Double.parseDouble(longi), 1);
            if (addressList != null && addressList.size() > 0) {
                String locality = addressList.get(0).getAddressLine(0);
                String country = addressList.get(0).getCountryName();
                if (locality == null && country == null){
                    return "Location not found";
                }
                else {
                    result = locality;
                    return result;
                }
            }
        }catch (Exception e){
            result = e.getMessage().toString();
        }

        return result;
    }
}
