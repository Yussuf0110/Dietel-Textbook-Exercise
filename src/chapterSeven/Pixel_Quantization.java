package chapterSeven;

public class Pixel_Quantization {
    public static void main(String[] args) {

        int[] pixels = {17, 25, 55, 72, 95, 109, 135, 151, 172, 205};


        for (int i = 0; i < pixels.length; i++) {
            if (pixels[i] < 21) {
                pixels[i] = 10;
            }
            else if (pixels[i] < 40) {
                pixels[i] = 30;
            }
            else if (pixels[i] < 60) {
                pixels[i] = 50;
            }
            else if (pixels[i] < 80) {
                pixels[i] = 70;
            }
            else if (pixels[i] < 100) {
                pixels[i] = 90;
            }
            else if (pixels[i] < 120) {
                pixels[i] = 110;
            }
            else if (pixels[i] < 140) {
                pixels[i] = 130;
            }
            else if (pixels[i] < 160) {
                pixels[i] = 150;
            }
            else if (pixels[i] < 180) {
                pixels[i] = 170;
            }
            else {
                pixels[i] = 190;
            }
        }

        for (int pixel : pixels) {
            System.out.println(pixel);
        }


    }
}
