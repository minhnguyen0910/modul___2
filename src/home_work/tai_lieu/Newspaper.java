package home_work.tai_lieu;

public class Newspaper extends Document{
    int releaseDate;

    public Newspaper(int documentCode, String manufacturersName, int numberOfEditions, int releaseDate) {
        super(documentCode, manufacturersName, numberOfEditions);
        this.releaseDate = releaseDate;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "releaseDate=" + releaseDate +
                ", documentCode=" + documentCode +
                ", manufacturersName='" + manufacturersName + '\'' +
                ", numberOfEditions=" + numberOfEditions +
                '}';
    }
}
