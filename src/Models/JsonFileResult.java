package Models;

public class JsonFileResult {
    private String dateGenerated, examStatus;
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
}
