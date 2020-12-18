package Models;

public class BloodDonor {
    private String dateGenerated, examStatus;
    private BloodDonors[] bloodDonors;

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

    public BloodDonors[] getBloodDonors() {
        return bloodDonors;
    }

    public void setBloodDonors(BloodDonors[] bloodDonors) {
        this.bloodDonors = bloodDonors;
    }
}
