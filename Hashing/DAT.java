


public class DAT {

    // Array to store values with a size of 1000
    int[] table = new int[1000];
    
    // Method to insert a value by setting the array index to 1
    void insert(int i) {
        table[i] = 1;
    }

    // Method to delete a value by setting the array index to 0
    void del(int i) {
        table[i] = 0;
    }

    // Method to search for a value by returning the value at the array index
    int search(int i) {
        return table[i];
    }
    
}

class DirectAccess {

    public static void main(String[] args) {
        // Creating an instance of the DAT class
        DAT dat = new DAT();

        // Inserting values into the DAT
        dat.insert(10);
        dat.insert(20);
        dat.insert(119);

        // Searching for values in the DAT and printing the results
        System.out.println(dat.search(10));  // Output: 1
        System.out.println(dat.search(20));  // Output: 1

        // Deleting a value from the DAT
        dat.del(119);

        // Searching for a value after deletion and printing the result
        System.out.println(dat.search(119));  // Output: 0
    }
}
