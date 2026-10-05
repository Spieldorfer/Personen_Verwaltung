public class Student extends Person {
    private int schulnote;

    public Student(String name, int geburtsjahr, int schulnote) {
        super(name, geburtsjahr);
        this.schulnote = schulnote;
    }

    public int getSchulnote() { return schulnote; }

    @Override
    public String toString() {
        return super.toString() + " - Note: " + schulnote;
    }
}