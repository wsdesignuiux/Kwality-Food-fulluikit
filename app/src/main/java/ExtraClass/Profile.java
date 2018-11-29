package ExtraClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by wolfsoft3 on 13/9/18.
 */

public class Profile {
    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("url")
    @Expose
    private String imageUrl;


    public Profile(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


}
