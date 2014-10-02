/**
 * Percolation.java - class for an N-by-N grid that can test for percolation
 * Joe Ryan, 23 July 2014
 * Dependencies: stdlib.jar and algs4.jar (libraries provided by Algorithms class
 * Command Line usage: java Percolation <size of grid N>
 * Constructor creates an N-by-N grid using a single WeightedQuickUnionUF object
 *    initialized with all elements closed
 * main() reads two entries from stdin while available, opens element at i,j
 *    and when no more entries are available prints //TODO output 
 * .open(row, column) allows opening of a single element, any surrounding element
 *    which is opened is then connected
 * isOpen(row, column) tests the state of an element at (row, column)
 *    and returns true if it is open
 * isFull(row, column) tests the element to see if it can connect to the top
 *    pseudo row indicating any element in the top row
 * percolates() tests system for a path from the bottom row all the way through
 *    to the top row and returns true if a valid path exists from row 1 to row N
 */

public class Percolation {
    private WeightedQuickUnionUF[] grid;
    private boolean[] state;
    private int size;
    private int bottom;
    
    public Percolation(int N) {  /**
     * create N by N grid with all sites blocked
     * the integer N must be > 0 and determines the size of the grid
     * @param N specifies the size of the square grid to create
     */
        if (N <= 0) {
            throw new IndexOutOfBoundsException("Initial size of system must be equal to or greater than 1");
        }
        grid = new WeightedQuickUnionUF [N*N];
        state = new boolean [N*N];
        size = N;
        StdOut.println("Size " + size + ", state length " + state.length);
    }
    
    public void open(int i, int j) {  /**
     * opens the site (row i, column j) if it not already open
     */
        int row, column;
        if (i <= 0 || i > size) {
            throw new IndexOutOfBoundsException("row index i out of bounds");
        } else {row = i - 1;}
        if (j <= 0 || j > size) {
            throw new IndexOutOfBoundsException("row index j out of bounds");
        } else {column = j-1;}
        if (!isOpen(i, j)) { state[row*size+column] = true; }
    }
    
    public boolean isOpen(int i, int j) {  /**
     * is site (row i, column j) is currently open?
     * returns true if site is open and false otherwise
     * @param i row for site being checked
     * @param j column for site being checked
     */
        int row, column;
        StdOut.println("i = " + i +", j = " + j);
        if (i <= 0 || i > size) {
            throw new IndexOutOfBoundsException("row index i out of bounds");
        } else {
            row = i - 1;
        }
        if ((j <= 0) || (j > size)) {
            throw new IndexOutOfBoundsException("row index j out of bounds");       
        } else { 
            column = j - 1; 
        } 
        return state[(row*size)+column];
       
    }
    public boolean isFull(int i, int j) {  /**
     * is site (row i, column j) full?
     * returns true if site is full?? and false otherwise
     * @param i row for site being checked
     * @param j column for site being checked
     */ 
        boolean fullness = false;
        // TODO
        // check if can reach top?
        return fullness; // TODO fix return stub
    }
    public boolean percolates() {  /**
     * does the system percolate?
     * returns true if a path exists from row 1 to row N between open sites
     */ 
        boolean perc = false;
        // TODO check the bottom row for full
        for (int j = 1; j <= size; j++) {
            if (isFull(bottom, j)) {perc = true;}
        }
        return perc; // TODO fix return stub
    }

    public static void main(String[] args) {
        int N =2;
        if (args.length > 0) {
            N = Integer.parseInt(args[0]); 
        } // use command line arguments to test if present
        
        Percolation percolator = new Percolation(N);
        
        percolator.open(1, 1);
        percolator.open(2, 2);
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                StdOut.println(percolator.isOpen(i, j));
            }
        }
        
        if (percolator.percolates()) {
            StdOut.println("percolates() call and return only success");
        }
        // TODO stdin union operations
        //TODO stdout of the grid or StdDraw
        
    }
}
