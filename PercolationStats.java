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
    private Percolation percolator;
    private int tests, gridSize;
    
    public PercolationStats(int N, int T) throws IllegalArgumentException {
        /** perform T independent coputational experiments on an N-by-N grid
          * Throws IllegalArgumentException if either N <= 0 or T <= 0
          * @param N size of grid to perform experiments on 
          * @param T number of independent simulations to perform
          */
        if (N < 1 || T < 1) {
            throw new IllegalArgumentException("N and T must be greater than 0");
        }
        gridSize = N;
        tests = T;
        for (int i = 1; i <= tests; i++) {
            percolator = new Percolation(gridSize);
        }
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
        PercolationStats tester;
        int tests, size;
        
        if (args.length < 2) {
            tests = 2;
            size = 2;
        } else {
            tests = Integer.parseInt(args[0]);
            size = Integer.parseInt(args[1]);
        }
        tester = new PercolationStats(size, tests);
        System.out.println(tests + " tests complete, on " + size + " by " 
                               + size + " grid");
        System.out.println("High confidence: " + tester.confidenceHi());
        System.out.println("Low confidence: " + tester.confidenceLo());
        System.out.println("Standard Deviation: " + tester.stddev());
        System.out.println("Mean: " + tester.mean());
    }
}
        