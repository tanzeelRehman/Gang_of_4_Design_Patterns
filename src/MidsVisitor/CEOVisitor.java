package MidsVisitor;

public class CEOVisitor implements IVisitor {
    private double totalvisitCEO;
    @Override
    public void visit(Engineer eng) {
        totalvisitCEO += eng.getCode();
    }

    @Override
    public void visit(Manager manager) {
        totalvisitCEO += manager.getProducts();
    }

    public double getTotalvisitCEO() {
        return totalvisitCEO;
    }
}
