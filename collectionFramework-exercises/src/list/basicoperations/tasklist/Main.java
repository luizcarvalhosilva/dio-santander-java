package list.basicoperations.tasklist;

public class Main {
    public static void main(String[] args) {
        ListOfTasks list1 = new ListOfTasks();

        list1.addTask("Corrida matinal");
        list1.addTask("Tomar café da manhã");
        list1.addTask("Pular corda");
        
        System.out.println("Total de tarefas: " + list1.getTotalTasks());
        System.out.println("Tarefas: " + list1.getAllDescriptions());

        list1.removeTask("Pular corda");

        System.out.println("Total de tarefas: " + list1.getTotalTasks());
        System.out.println("Tarefas: " + list1.getAllDescriptions());
    }
}
