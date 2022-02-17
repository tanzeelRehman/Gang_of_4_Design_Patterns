package MidsVisitor;

public class Demo {
    public static void main(String[] args) {
        Engineer engineer = new Engineer ("Engineer", 9);
        Manager manager = new Manager ("Manager", 9 );

    BuisnessReport buisnessReport = new BuisnessReport();
        buisnessReport.addProduct(manager);
        buisnessReport.addCode(engineer);
        System.out.println(buisnessReport);


        double visits = buisnessReport.totalvisitCEO();

        System.out.println("Total Visits of CEO"+visits);

        double visit = buisnessReport.totalvisitCTO();
        System.out.println("Total Visits of CTO"+visit);



    }
}
