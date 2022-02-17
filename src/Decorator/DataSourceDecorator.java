package Decorator;

public class DataSourceDecorator implements DataSource {
    DataSource dataSource;
    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Override
    public void writeData(String file) {
        System.out.println("Writing Data in DataSoureDecorator file:"+file);
    }

    @Override
    public void readData() {
        System.out.println("Writing Data from file:");
    }
}
