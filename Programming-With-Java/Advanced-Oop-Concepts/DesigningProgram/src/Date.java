public class Date {
    int dd;
    int mm;
    int yy;

    public Date(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    String getDate (){
        return this.dd + "-" + this.mm + "-" + this.yy;
    }
}
