package Chain_Of_Responsibility;

import java.util.logging.Handler;

public class ChainDemo {
    public static void main(String[] args) {

        BaseHandler docHandler = new DocFileHandler("MS Word");
        BaseHandler pdfHandler = new PDFHandler("Adobe Acrobat");
        BaseHandler mp3Handler = new Mp3Handler("VLC Media Player");


        docHandler.setNext(pdfHandler);
        pdfHandler.setNext(mp3Handler);
        mp3Handler.setNext(docHandler);

        File file = null;
        file = new File("Abc.doc","C:", FileType.DOC);
        pdfHandler.handle(file);

        System.out.println("--------------------------");
        file = new File("Def.pdf","C:", FileType.PDF);
        docHandler.handle(file);

        System.out.println("--------------------------");
        file = new File("Ghi.Mp3", "C:", FileType.MP3);
        mp3Handler.handle(file);



    }
}
