class EmployeeTest{

    private int empId;
    private String empName;

    EmployeeTest(int id,String name){
        empId=id;
        empName=name;
    }

    public void display(){
        System.out.println(empId);
        System.out.println(empName);
    }
    public void show(){
        System.out.println(empId);
        System.out.println(empName);
    }
}