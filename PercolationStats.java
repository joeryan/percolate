/** PercolationStats.java - provides percolation statistics of a system
  * defined by command line parameters. 
  * Writen by Joe Ryan, 23 July, 2014.
  * Usage: java PercolationStats [N] [T]
  * Where [N] is the size of the test system grid (N-by-N) and
  * where [T] indicates the number of times to run the Monte Carlo simulation
  * outputs the mean of the percolation threshold, sstandard deviation, and 
  * the 95% confidence interval as an upper and lower range
  */

public class PercolationStats {
    /** PercolationStats N-size experiments -> mean, stddev, 95% to stdout
      * throws IllegalArgumentException if either N <= 0 or T <= 0
      */
    public PercolationStats(int N, int T) throws IllegalArgumentException {
        /** perform T independent coputational experiments on an N-by-N grid
          * Throws IllegalArgumentException if either N <= 0 or T <= 0
          * @param N size of grid to perform experiments on 
          * @param T number of independent simulations to perform
          */
        // TODO
    }
    
    public double mean() {
        /** sample mean of percolation threshold
          */
        // TODO
        return 0.0; // TODO fix return stub
    }
    
    public double stddev() {
        /** sample standard deviation of percolation threshold
          * @return standard deviation as double
          */
        // TODO
        return 0.0; // TODO fix return stub
    }

    public double confidenceLo() {
        /** returns lower bound of the 95% confidence interval
          */
        // TODO
        return 0.0; // TODO fix return stub
    }
    
    public double confidenceHi() {
        /** returns upper bound of the 95% confidence interval
          */
        // TODO
        return 0.0;  // TODO fix return stub
    }
    
    public static void main(String[] args) {
        /** client takes two args N and T, perform T simulations on N-by-N grid
          * @param args[] String command line argument to provide two parameters
          * N and T to provide size of grid and number of simulations to run
          */
        // TODO
        System.out.println("Test complete!");
    }
}
        