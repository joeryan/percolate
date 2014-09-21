/**
 * Percolation.java - class for an N-by-N grid that can test for percolation
 * Joe Ryan, 23 July 2014
 * Creates an N-by-N grid
 * open(row, column) allows opening of elements
 * isOpen(row, column) tests the state of element at (row, column)
 *    and returns true if open
 * isFull(row, column) tests the ??
 * percolates() tests system for a path from the bottom row all the way through
 * to the top row and returns true if a valid path exists from row 1 to row N
 */

public class Percolation {
    private WeightedQuickUnionUF[] grid;
    private boolean[] state;
    private int size;
    
    public Percolation(int N) {  /**
     * create N by N grid with all sites blocked
     * the integer N must be > 0 and determines the size of the grid
     * @param N specifies the size of the square grid to create
     */
        grid = new WeightedQuickUnionUF [N*N];
        state = new boolean [N*N];
        size = N;
    }
    
    public void open(int i, int j) {  /**
     * opens the site (row i, column j) if it not already open
     */
        if (!isOpen(i, j)) { state[i*size+j] = true; }
    }
    
    public boolean isOpen(int i, int j) {  /**
     * is site (row i, column j) is currently open?
     * returns true if site is open and false otherwise
     * @param i row for site being checked
     * @param j column for site being checked
     */
       
        return state[i*size+j];
       
    }
    public boolean isFull(int i, int j) {  /**
     * is site (row i, column j) full?
     * returns true if site is full?? and false otherwise
     * @param i row for site being checked
     * @param j column for site being checked
     */ 
        // TODO
        return true; // TODO fix return stub
    }
    public boolean percolates() {  /**
     * does the system percolate?
     * returns true if a path exists from row 1 to row N between open sites
     */
        // TODO
        return true; // TODO fix return stub
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Percolation percolator = new Percolation(N);
        percolator.open(1, 1);
        percolator.open(0, 0);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                StdOut.println(percolator.isOpen(i, j));
            }
        }
    }
}
    
    
                         
