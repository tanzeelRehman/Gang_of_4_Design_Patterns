package Decorator;

public class EncryptionDecorator extends DataSourceDecorator{
    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }



    public void writeData(String file) {
        super.writeData(file);
        System.out.println("Writing Data from EncryptionDecorator: "+file);
    }


    public void readData() {
        super.readData();
        System.out.println("Reading Data from EncryptionDecorator:");
    }
}
