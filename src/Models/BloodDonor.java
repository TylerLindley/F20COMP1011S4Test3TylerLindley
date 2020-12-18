//Tyler Lindley - 200382154
package Models;

public class BloodDonor implements Comparable<BloodDonor> {
    private int id;
    private String gender, first_Name, last_Name, bloodType, telePhone;
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
        return Integer.compare(this.getId(), o.getId());
    }
}
