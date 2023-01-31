package home_work.tai_lieu;

public class Document {
    int documentCode;
    String manufacturersName;
    int numberOfEditions;

    public int getDocumentCode() {
        return documentCode;
    }

    public void setDocumentCode(int documentCode) {
        this.documentCode = documentCode;
    }

    public String getManufacturersName() {
        return manufacturersName;
    }

    public void setManufacturersName(String manufacturersName) {
        this.manufacturersName = manufacturersName;
    }

    public int getNumberOfEditions() {
        return numberOfEditions;
    }

    public void setNumberOfEditions(int numberOfEditions) {
        this.numberOfEditions = numberOfEditions;
    }

    public Document(int documentCode, String manufacturersName, int numberOfEditions) {
        this.documentCode = documentCode;
        this.manufacturersName = manufacturersName;
        this.numberOfEditions = numberOfEditions;
    }
}
