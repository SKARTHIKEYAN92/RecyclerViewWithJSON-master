package rayan.avik.recyclerviewwithjson;

/**
 * Created by pc41 on 01-06-2017.
 */

public class ItemListPojo {
    String account_id, display_name, display_image;

    public ItemListPojo(String account_id, String display_name, String display_image) {
        this.account_id = account_id;
        this.display_name = display_name;
        this.display_image =display_image;
    }

    public String getAccount_id (){
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getDisplay_image() {
        return display_image;
    }

    public void setDisplay_image(String display_image) {

        this.display_image = display_image;
    }
}
