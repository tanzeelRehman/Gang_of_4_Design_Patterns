package Decorator;

public class ComprassionDecorator extends DataSourceDecorator {

    public ComprassionDecorator(DataSource dataSource) {
        super(dataSource);
    }
    public void writeData(String file) {
        super.writeData(file);
        System.out.println("Writing Data from ComprassionDecorator: "+file);
    }


    public void readData() {
        super.readData();
        System.out.println("Reading Data from ComprassionDecorator:");
    }
}
