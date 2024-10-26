
import java.util.PriorityQueue;

public class PriorityQueues {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank; // Ascending order based on rank
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(); // Increasing order based on rank

        pq.add(new Student("Prajwal", 4)); // o(logn)
        pq.add(new Student("Kanade", 2));
        pq.add(new Student("P", 5));
        pq.add(new Student("Praj", 7));

        while (!pq.isEmpty()) {
            Student student = pq.peek();
            System.out.println(student.name + "--" + student.rank);
            pq.remove();
        }
    }
}

