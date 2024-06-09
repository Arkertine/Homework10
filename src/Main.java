
public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("«Ф. И. О. сотрудника — %s».%n", fullName);

        System.out.println("Task 2");
        System.out.printf("«Данные Ф. И. О. сотрудника для заполнения отчета — %s».%n", fullName.toUpperCase());

        System.out.println("Task 3");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.printf("«Данные Ф. И. О. сотрудника — %s».%n", fullName);

    }
}