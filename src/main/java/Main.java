public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Edward", 24, "St Albans", "Newcastle");
        Student student2 = new Student("Kieran", 26, "Sutton Coldfield", "Manchester");


        Cohort cohort = new Cohort("T-Techs");

        cohort.addStudent(student1);
        cohort.addStudent(student2);

        for (int i = 0; i < 2; i++) {
            System.out.println(cohort.getStudents().get(i).getName());
        }



    }

}
