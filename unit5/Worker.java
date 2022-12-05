/**
 * Represents an hourly worker
 * @author Ken Loomis
 * @version 2022
 */
public class Worker {

    /** The worker's name */
    private String name;
    /** The worker's hourly wage */
    private double wage;
    /** The worker's number of hours worked in a week */
    private double hours;

    /**
     * Instantiates a worker given the name, wage, and hours.
     * @param n (String) - the worker's name
     * @param w (double) - the worker's hourly wage
     * @param h (double) - the worker's hours worked in a week
     */
    public Worker ( String n, double w, double h ) {
        name = n;
        wage = w;
        hours = h;
    }

    /**
     * Produces the worker's name 
     * @return String - the name of the worker.
     */
    public String getName ( ) { return name; }

    /**
     * Produces the worker's hourly wage 
     * @return double - the hourly wage of the worker.
     */
    public double getWage ( ) { return wage; }

    /**
     * Produces the worker's most recent hours per week
     * @return double - the hours of the worker.
     */
    public double getHours ( ) { return hours; }

    /**
     * Set's the worker's hourly wage to the given amount.
     * precondition: the given wage is between 0 and 100 
     * dollars per hour
     * @param w (double) - the new hourly wage
     */
    public void setWage ( double w ) {
        if ( w > 0 && w <= 100 ){
            wage = w; 
        }
    }

    /**
     * Set's the worker's hours worked to the given amount in hours.
     * precondition: the given hours are between 0 and 80 and
     * minutes are converted to the decimal equivalent
     * @param h (double) - the new hours
     */
    public void setHours ( double h ) {
        if ( h >= 0 && h <= 80 ){
            hours = h; 
        }
    }

    /**
     * The net pay of the employee including overtime if
     * the worker works more than 40 hours.
     * @return double - the worker's netpay with overtime
     */
    public double netPay ( ) {
        if ( hours > 40 ) {
            return 40 * wage + 1.5 * wage * ( hours - 40 );
        } else {
            return hours * wage;
        }
    }

    /**
      * Produces the take home pay with given taxes deducted
      * from the net pay.
      * Precondition - Tax is a decimal between 0 and 1
      * @param tax (double) - the tax rate
      * @return double - the take home pay of the worker or 
      * negative value if an invalid tax rate is given.
      */
    public double takeHomePay ( double tax ){
        if ( tax < 0 || tax > 1 ) {
            return -1;
        }
        return ( 1 - tax ) * netPay();
    }

}
