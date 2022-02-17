package MidsVisitor;

import java.util.ArrayList;
import java.util.List;

public class BuisnessReport {
    private List<Employee> product = new ArrayList<>();
    private List<Employee> code = new ArrayList<>();

    void addProduct(Employee product) {
        this.product.add(product);
    }
    double totalvisitCEO() {

        CEOVisitor Visitor = new CEOVisitor();
        for (Employee product : product) {
            product.accept(Visitor);

        }
        double report = Visitor.getTotalvisitCEO();
        return report;
    }

    @Override
    public String toString() {
        return "BuisnessReport{" +
                "product=" + product +
                ", code=" + code +
                '}';
    }

    double totalvisitCTO() {

        CTOVisitor Visitor = new CTOVisitor();
        for(Employee code : code) {
            code.accept(Visitor);

        }
        double report = Visitor.getTotalvisitCTO();
        return report;
    }

    void addCode(Employee code) {
        this.code.add(code);
    }

    public void showReport(IVisitor visitor){

    }
}
