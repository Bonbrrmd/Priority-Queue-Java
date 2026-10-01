import java.util.*;

public class Task {
    
    String description;
    int priority;
    
    public Task(String description, int priority) {
     
        this.description = description;
        this.priority = priority;
    }
    
    @Override
    public String toString() {
        return "[Priority " + priority + "]" + description;
        
    }
    
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
      
      PriorityQueue<Task> taskQueue = new PriorityQueue<>(Comparator.comparingInt((Task t) -> t.priority).reversed());
       
      int n;
      
        System.out.println("Enter number of Task: ");
      n = sc.nextInt();
      
      sc.nextLine();
      
      for(int i = 0; i < n; i++) {
      
          
          System.out.println("Enter Description for Task " + (i + 1) +": ");
          String desc = sc.nextLine();
          
          System.out.println("Enter Priority" + "(" + "1-10" + ") for task " + (i + 1));
          int prio = sc.nextInt();
          
          sc.nextLine();
          
          taskQueue.add(new Task(desc, prio));    
          }
      
       System.out.println("Next task: " + taskQueue.peek());
        System.out.println();
       
       System.out.println("Processing task in order of priority:");
        System.out.println();
     
       while (!taskQueue.isEmpty()) {
       
        
           System.out.println(taskQueue.poll());
      
      }
        System.out.println();
       System.out.println("All task have been processed.");
     
        }
}
