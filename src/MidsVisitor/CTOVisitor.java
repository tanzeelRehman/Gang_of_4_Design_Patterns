package MidsVisitor;

public class CTOVisitor implements IVisitor {
    private double totalvisitCTO;
    @Override
    public void visit(Engineer eng) {
        totalvisitCTO += eng.getCode();
    }

    @Override
    public void visit(Manager manager) {
        totalvisitCTO += manager.getProducts();
    }

    public double getTotalvisitCTO() {
        return totalvisitCTO;
    }
}
