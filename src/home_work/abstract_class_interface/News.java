package home_work.abstract_class_interface;

public class News implements INews {
    int iD;
    String title;
    String publishDate;
    String author;
    String content;
    float averageRate;

    public News(int iD, String title, String publishDate, String author, String content, float averageRate) {
        this.iD = iD;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void Display() {
        System.out.println(title+" "+publishDate+" "+author+" "+content+" "+averageRate);
    }
    int[] rateList=new int[3];
    public float calculate(){
        float a=0;
        for (int i=0; i<rateList.length;i++){
            a+=rateList[i]/3;
        }return a;
    }
}
