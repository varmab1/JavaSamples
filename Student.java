public class Student {

    char[] Name;

    char[] getName(Student Ob){
        return Ob.Name;
    }

    void setName(Student Ob,char[] Name){
        Ob.Name=Name;
    }


    public static void main(String[] args){
        Student Ob=new Student();
        Ob.setName(Ob,new char[]{'a', 'b', 'c', 'd', 'e'});
        System.out.println(Ob.getName(Ob));
    }
}
