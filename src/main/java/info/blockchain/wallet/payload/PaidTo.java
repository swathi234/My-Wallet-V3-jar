package info.blockchain.wallet.payload;

import org.json.JSONException;
import org.json.JSONObject;

public class PaidTo implements PayloadJsonKeys{

    private String strEmail = null;
    private String strMobile = null;
    private Integer strRedeemedAt = null;
    private String strAddress = null;

    public PaidTo() {
    }

    public PaidTo(String email, String mobile, Integer redeemed, String address) {
        this.strEmail = email;
        this.strMobile = mobile;
        this.strRedeemedAt = redeemed;
        this.strAddress = address;
    }

    public String getEmail() {
        return strEmail;
    }

    public void setEmail(String strEmail) {
        this.strEmail = strEmail;
    }

    public String getMobile() {
        return strMobile;
    }

    public void setMobile(String strMobile) {
        this.strMobile = strMobile;
    }

    public Integer getRedeemedAt() {
        return strRedeemedAt;
    }

    public void setRedeemedAt(Integer strRedeemedAt) {
        this.strRedeemedAt = strRedeemedAt;
    }

    public String getAddress() {
        return strAddress;
    }

    public void setAddress(String strAddress) {
        this.strAddress = strAddress;
    }

    public JSONObject dumpJSON() throws JSONException {

        JSONObject obj = new JSONObject();

        if ((strEmail != null) && !"".equals(strEmail)) {
            obj.put(KEY_PAIDTO__EMAIL, strEmail);
        } else {
            obj.put(KEY_PAIDTO__EMAIL, JSONObject.NULL);
        }
        if ((strMobile != null) && !"".equals(strMobile)) {
            obj.put(KEY_PAIDTO__MOBILE, strMobile);
        } else {
            obj.put(KEY_PAIDTO__MOBILE, JSONObject.NULL);
        }
        if ((strRedeemedAt != null)) {
            obj.put(KEY_PAIDTO__REDEEMED_AT, strRedeemedAt);
        } else {
            obj.put(KEY_PAIDTO__REDEEMED_AT, JSONObject.NULL);
        }
        if ((strAddress != null) && !"".equals(strAddress)) {
            obj.put(KEY_PAIDTO__ADDRESS, strAddress);
        } else {
            obj.put(KEY_PAIDTO__ADDRESS, JSONObject.NULL);
        }
        return obj;
    }

}