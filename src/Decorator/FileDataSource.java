package Decorator;

public class FileDataSource implements DataSource {
    private String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String file) {
        System.out.println("Writing Data in file:"+file);
    }

    @Override
    public void readData() {
        System.out.println("Writing Data from file:"+filename);
    }
}
