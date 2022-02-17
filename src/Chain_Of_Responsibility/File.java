package Chain_Of_Responsibility;

public class File {
   private FileType type;

    public File(String name, String path, FileType type) {
        this.name = name;
        this.path = path;
        this.type = type;
    }

    public FileType getFileType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

  private   String name;
   private String path;

}
