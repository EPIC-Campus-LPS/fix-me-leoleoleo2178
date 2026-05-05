import java.util.*;

public class student {
    public String name;
    public int id;
    public ArrayList<Integer> List;

    public student(String n, int id_num) {
        this.name = name;
        this.id = id;
        List = new ArrayList<Integer>();
    }
    public void add(int v) {
        List.add(v);
    }
    public double get_val() {
        if(List.size()==0) return -1.0;
        double t = 0;
        for(int i=0;i<List.size();i++) {
            t+=List.get(i);
        }
        return t/List.size();
    }
};