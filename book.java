public class book {
    private String title;
    private String author;
    private int numPages;
    public book(String t, String a, int np){
        title = t;
        author =a;
        numPages= np;

    }
    public String getTitle(){
        return title;

    }
    public String getAuthor(){
        return author;
    }
    public int getNumPages(){
        return numPages;
    }

}
