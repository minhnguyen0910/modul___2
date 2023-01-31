package home_work.tai_lieu;

public class Books extends Document{
    String theWriterName;
    int numbersOfPage;

    public Books(int documentCode, String manufacturersName, int numberOfEditions, String theWriterName, int numbersOfPage) {
        super(documentCode, manufacturersName, numberOfEditions);
        this.theWriterName = theWriterName;
        this.numbersOfPage = numbersOfPage;
    }

    public String getTheWriterName() {
        return theWriterName;
    }

    public void setTheWriterName(String theWriterName) {
        this.theWriterName = theWriterName;
    }

    public int getNumbersOfPage() {
        return numbersOfPage;
    }

    public void setNumbersOfPage(int numbersOfPage) {
        this.numbersOfPage = numbersOfPage;
    }

    @Override
    public String toString() {
        return "Books{" +
                "theWriterName='" + theWriterName + '\'' +
                ", numbersOfPage=" + numbersOfPage +
                ", documentCode=" + documentCode +
                ", manufacturersName='" + manufacturersName + '\'' +
                ", numberOfEditions=" + numberOfEditions +
                '}';
    }
}
