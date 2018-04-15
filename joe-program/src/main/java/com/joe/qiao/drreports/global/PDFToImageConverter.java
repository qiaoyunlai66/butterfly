package com.joe.qiao.drreports.global;

import com.sun.pdfview.PDFFile;
import com.sun.pdfview.PDFPage;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;

public class PDFToImageConverter {

    final static String PATH = "/Users/qiaoyunlai/opt/test/";
    final static String PATH_IMAGE = "/Users/qiaoyunlai/opt/test/image/";


    public static List<BufferedImage> convert(String path){
        List<BufferedImage> images = null;
        //  load a pdf from a file
        File file = new File(path);
        try {
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            ReadableByteChannel ch = Channels.newChannel(new FileInputStream(file));

            FileChannel channel = raf.getChannel();
            ByteBuffer buf = channel.map(FileChannel.MapMode.READ_ONLY,
                    0, channel.size());
            PDFFile pdffile = new PDFFile(buf);

            //   get number of pages
            int jumlahhalaman = pdffile.getNumPages();

            //  iterate through the number of pages
            for (int i = 1; i <= jumlahhalaman; i++) {
                PDFPage page = pdffile.getPage(i);

                //  create new image
                Rectangle rect = new Rectangle(0, 0,
                        (int) page.getBBox().getWidth(),
                        (int) page.getBBox().getHeight());

                Image img = page.getImage(
                        rect.width, rect.height, //width & height
                        rect, // clip rect
                        null, // null for the ImageObserver
                        true, // fill background with white
                        true // block until drawing is done
                );

                BufferedImage bufferedImage = new BufferedImage(rect.width, rect.height, BufferedImage.TYPE_INT_RGB);

                Graphics g = bufferedImage.createGraphics();
                g.drawImage(img, 0, 0, null);
                g.dispose();

                if (images == null) {
                    images = new ArrayList<>();
                }
                images.add(bufferedImage);

//            File asd = new File(PATH_IMAGE +"dreportimg/dreport"+ i + ".png");
//            if (asd.exists()) {
//                asd.delete();
//            }
//            ImageIO.write(bufferedImage, "png", asd);
            }
        }catch (Exception e){
            return null;
        }
        return images;
    }

    public static void main(String[] args) {
        PDFToImageConverter converter = new PDFToImageConverter();
        try {
          // converter.convert();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}