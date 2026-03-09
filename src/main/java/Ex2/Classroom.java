package Ex2;
import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<String> students;
    private int max;

    public Classroom(int max){
        if(max <= 0){
            throw new IllegalArgumentException("O numero maximo de alunos tem que ser maior que 0");
        }

        this.students = new ArrayList<>();
        this.max = max;

    }
    public List<String> getStudents() {
        return students; 
    }

    public void add(String name) {
        if(students.size()<max)
                students.add(name); 
    }

    public int getMax() {
        return max;
    }

    public void setMax(int m) {
        if(max <= 0){
            throw new IllegalArgumentException("O numero maximo de alunos tem que ser maior que 0");
        }
        this.max = m;
    }
}
