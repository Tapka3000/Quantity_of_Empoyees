public class QuantityEmployees {
    public static void main(String[] args) {
        final int programmers = 8;
        final int testersForOneProgrammer = 1;
        final int support = 2;
        final int necessaryTesters = testersForOneProgrammer * programmers;
        final int necessarySupport = programmers * support;
        final int allSpecialists = programmers + necessaryTesters + necessarySupport;

        System.out.println("Количество тестировщиков, которые требуется на проекте - " + necessaryTesters + " человек");
        System.out.println("Количество специалистов тех.поддержки, которые требуются на проекте " + necessarySupport + " человек");
        System.out.println("Всего специалистов на проекте - " + allSpecialists + " человек");
    }
}
