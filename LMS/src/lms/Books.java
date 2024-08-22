package lms;
public class Books {

    private String bookid;
    private String bookname;
    private String bookauthor;
    
    public Books(String i,String b,String ba){
        this.bookid=i;
        this.bookname=b;
        this.bookauthor=ba;
    }
    
    
    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }
    
}
