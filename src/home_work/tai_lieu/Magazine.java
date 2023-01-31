package home_work.tai_lieu;

public class Magazine extends Document{
    int issueNumber;
    int releaseMonth;

    public Magazine(int documentCode, String manufacturersName, int numberOfEditions, int issueNumber, int releaseMonth) {
        super(documentCode, manufacturersName, numberOfEditions);
        this.issueNumber = issueNumber;
        this.releaseMonth = releaseMonth;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issueNumber=" + issueNumber +
                ", releaseMonth=" + releaseMonth +
                ", documentCode=" + documentCode +
                ", manufacturersName='" + manufacturersName + '\'' +
                ", numberOfEditions=" + numberOfEditions +
                '}';
    }
}
