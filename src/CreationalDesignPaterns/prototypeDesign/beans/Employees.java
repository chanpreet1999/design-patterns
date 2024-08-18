package CreationalDesignPaterns.prototypeDesign.beans;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private  final List<String> empList;

    public Employees(){
        this.empList = new ArrayList<>();
    }

    public Employees(List<String> empList) {
        this.empList = empList;
    }
    public void loadData(){
        //read all employees from database and put into the list
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa");
    }
    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<>();
        temp.addAll(this.getEmpList());
        return new Employees(temp);
    }

}
