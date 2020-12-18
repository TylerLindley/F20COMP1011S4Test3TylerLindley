//Tyler Lindley - 200382154
package Models;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class JsonFileResult {
    @SerializedName("DateGenerated")
    private String dateGenerated;
    @SerializedName("ExamStatus")
    private String examStatus;
    @SerializedName("BloodDonors")
    private BloodDonor[] bloodDonors;

    public String getDateGenerated() {
        return dateGenerated;
    }

    public void setDateGenerated(String dateGenerated) {
        this.dateGenerated = dateGenerated;
    }

    public String getExamStatus() {
        return examStatus;
    }

    public void setExamStatus(String examStatus) {
        this.examStatus = examStatus;
    }

    public BloodDonor[] getBloodDonors() {
        return bloodDonors;
    }

    public void setBloodDonors(BloodDonor[] bloodDonors) {
        this.bloodDonors = bloodDonors;
    }

    @Override
    public String toString() {
        return "JsonFileResult{" +
                "dateGenerated='" + dateGenerated + '\'' +
                ", examStatus='" + examStatus + '\'' +
                ", bloodDonors=" + Arrays.toString(bloodDonors) +
                '}';
    }
}
