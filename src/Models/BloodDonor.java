//Tyler Lindley - 200382154
package Models;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class BloodDonor implements Comparable<BloodDonor> {
    @SerializedName("Id")
    private int id;
    @SerializedName("Gender")
    private String gender;
    @SerializedName("First_Name")
    private String first_Name;
    @SerializedName("Last_Name")
    private String last_Name;
    @SerializedName("BloodType")
    private String bloodType;
    @SerializedName("TelePhone")
    private String telePhone;
    @SerializedName("DonationDates")
    private String[] donationDates;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getTelePhone() {
        return telePhone;
    }

    public void setTelePhone(String telePhone) {
        this.telePhone = telePhone;
    }

    public String[] getDonationDates() {
        return donationDates;
    }

    public void setDonationDates(String[] donationDates) {
        this.donationDates = donationDates;
    }

    @Override
    public int compareTo(BloodDonor o) {
        return Integer.compare(getId(), o.getId());
    }

    @Override
    public String toString() {
        return id + " " + first_Name + " " + last_Name + " " + bloodType;
    }
}
