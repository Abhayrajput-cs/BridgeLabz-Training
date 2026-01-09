class JobNode {
    int id;
    String title;
    int level;
    String deadline;
    JobNode next;

    JobNode(int id, String title, int level, String deadline) {
        this.id = id;
        this.title = title;
        this.level = level;
        this.deadline = deadline;
        this.next = null;
    }
}

class JobManager {
    private JobNode start;
    private JobNode pointer;

    // Insert job at start
    public void insertAtStart(int id, String title, int level, String deadline) {
        JobNode job = new JobNode(id, title, level, deadline);

        if (start == null) {
            start = job;
            job.next = start;
            pointer = start;
            return;
        }

        JobNode temp = start;
        while (temp.next != start) {
            temp = temp.next;
        }

        job.next = start;
        temp.next = job;
        start = job;
    }

    // Insert job at end
    public void insertAtEnd(int id, String title, int level, String deadline) {
        JobNode job = new JobNode(id, title, level, deadline);

        if (start == null) {
            start = job;
            job.next = start;
            pointer = start;
            return;
        }

        JobNode temp = start;
        while (temp.next != start) {
            temp = temp.next;
        }

        temp.next = job;
        job.next = start;
    }

    // Insert job at position (1-based)
    public void insertAtPosition(int pos, int id, String title, int level, String deadline) {
        if (pos <= 1) {
            insertAtStart(id, title, level, deadline);
            return;
        }

        JobNode temp = start;
        for (int i = 1; i < pos - 1 && temp.next != start; i++) {
            temp = temp.next;
        }

        JobNode job = new JobNode(id, title, level, deadline);
        job.next = temp.next;
        temp.next = job;
    }

    // Delete job by ID
    public void deleteJob(int id) {
        if (start == null) {
            System.out.println("Task list is empty");
            return;
        }

        JobNode curr = start;
        JobNode prev = null;

        do {
            if (curr.id == id) {
                if (curr == start) {
                    JobNode last = start;
                    while (last.next != start) {
                        last = last.next;
                    }
                    start = start.next;
                    last.next = start;
                } else {
                    prev.next = curr.next;
                }
                System.out.println("Task deleted successfully");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != start);

        System.out.println("Task not found");
    }

    // Show current task and move pointer
    public void showNextTask() {
        if (pointer == null) {
            System.out.println("No tasks available");
            return;
        }

        System.out.println("Current Task:");
        print(pointer);
        pointer = pointer.next;
    }

    // Display all jobs
    public void showAllJobs() {
        if (start == null) {
            System.out.println("No tasks to display");
            return;
        }

        JobNode temp = start;
        do {
            print(temp);
            temp = temp.next;
        } while (temp != start);
    }

    // Search by priority level
    public void findByLevel(int level) {
        if (start == null) {
            System.out.println("No tasks available");
            return;
        }

        JobNode temp = start;
        boolean match = false;

        do {
            if (temp.level == level) {
                print(temp);
                match = true;
            }
            temp = temp.next;
        } while (temp != start);

        if (!match)
            System.out.println("No tasks found with priority: " + level);
    }

    // Print job details
    private void print(JobNode j) {
        System.out.println(
                "ID: " + j.id +
                ", Task: " + j.title +
                ", Priority: " + j.level +
                ", Due: " + j.deadline
        );
    }
}

public class CircularTaskScheduler {
    public static void main(String[] args) {

        JobManager manager = new JobManager();

        manager.insertAtEnd(1, "Design Module", 1, "10-Jan");
        manager.insertAtEnd(2, "Write Code", 2, "15-Jan");
        manager.insertAtStart(3, "Requirement Analysis", 1, "05-Jan");

        System.out.println("\nAll Tasks:");
        manager.showAllJobs();

        System.out.println("\nView Current Tasks:");
        manager.showNextTask();
        manager.showNextTask();

        System.out.println("\nSearch by Priority:");
        manager.findByLevel(1);

        System.out.println("\nDelete Task:");
        manager.deleteJob(2);

        System.out.println("\nFinal Task List:");
        manager.showAllJobs();
    }
}
