class EmployeeTest{

    private int empId;
    private String empName;
    private double empSalary;

    public EmployeeTest(){
        System.out.println("Default");
    }
    public EmployeeTest(int id,String name,double salary){
        empId=id;
        empName=name;
        empSalary=salary;
    }

    public void display(){
        System.out.println(empId);
        System.out.println(empName);
        System.out.println(empSalary);
    }
    public void show(){
        System.out.println(empId);
        System.out.println(empName);
        System.out.println(empSalary);
    }
    public String toString(){
        return "hello";
    }
}