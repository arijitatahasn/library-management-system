public class student_information {

    String name,f_name,uni_id,user_id;
    int sem;

    public void getData( String name, String f_name, String uni_id, String user_id, int sem ) {

        this.name=name;
        this.f_name=f_name;
        this.uni_id=uni_id;
        this.user_id=user_id;
        this.sem=sem;
    }

    public void setData() {
        System.out.println("Student's name: " +name);
        System.out.println("Student's father name: " +f_name);
        System.out.println("University id: " +uni_id);
        System.out.println("User id: " +user_id);
        System.out.println("Semester: " +sem);
    }
}
