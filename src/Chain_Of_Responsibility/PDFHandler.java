package Chain_Of_Responsibility;

public class PDFHandler extends BaseHandler{

    PDFHandler(String name){
        this.name = name;
    }
    private  String name;

    @Override
    public void handle(File file) {
        if (file.getFileType()==FileType.PDF){
            System.out.println("Handling "+file.getName()+" and "+file.getPath()+ "In PDF VIEW");
        }
        else {

            System.out.println("Can not handle this file. Farwording this file");
            next.handle(file);
        }


    }

    @Override
    public String getHandlerName() {
        return name;
    }


}
