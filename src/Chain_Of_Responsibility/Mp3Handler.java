package Chain_Of_Responsibility;


public class Mp3Handler extends BaseHandler{
    Mp3Handler(String name){
        this.name = name;
    }
    private  String name;

    @Override
    public void handle(File file) {
        if (file.getFileType()==FileType.MP3){
            System.out.println("Handling "+file.getName()+" and "+file.getPath()+ "In MP3 VIEW");
        }
        else {
            if (next!=null){
                System.out.println("Can not handle this file. Farwording this file to "+next.getHandlerName());
                next.handle(file);
            }
            System.out.println("Your file cannot be handled");


        }


    }

    @Override
    public String getHandlerName() {
        return name;
    }
}
