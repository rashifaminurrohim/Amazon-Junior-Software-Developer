package ComparableInterface;

public class Length implements Comparable<Length>{

    int cm, mm;

    Length(int cm, int mm) {
        this.cm = cm;
        this.mm = mm;
    }

    @Override
    public int compareTo(Length obj2) {
        int mmObj1 = this.cm*10+this.mm;
        int mmObj2 = obj2.cm*10+obj2.mm;

        if (mmObj1 > mmObj2) {
            return 1;
        } else {
            return 0;
        }
    }
}
