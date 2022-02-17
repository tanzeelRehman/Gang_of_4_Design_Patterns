package Decorator;

import javax.xml.crypto.Data;

public class DecoratorDemo {
    public static void main(String[] args) {
        DataSource ds = new FileDataSource("Somefile.data");
        ds = new DataSourceDecorator(ds);
        ds.writeData("newdata");
        ds.readData();
        ds = new ComprassionDecorator(ds);
        ds.readData();

    }
}
