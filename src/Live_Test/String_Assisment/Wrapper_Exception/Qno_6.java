package Live_Test.String_Assisment.Wrapper_Exception;

public class Qno_6 {
    public static void main(String[] args) {

        Pair<String, Integer> pair1 = new Pair<>("Test",100);
        pair1.display();
    }
}

class Pair<first, second> {
    private first first;
    private second second;

    public Pair(first first, second second) {
        this.first = first;
        this.second = second;
    }

    public first getFirst() {
        return first;
    }

    public void setFirst(first first) {
        this.first = first;
    }

    public second getSecond() {
        return second;
    }

    public void setSecond(second second) {
        this.second = second;
    }

    public void display() {
        System.out.println("First: " + first + ", Second: " + second);
    }
}
