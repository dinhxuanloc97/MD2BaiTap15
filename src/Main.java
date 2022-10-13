import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Nhap vao canh dau tien cua tam giac ");
            float a = Float.parseFloat(sc.nextLine());
            System.out.println("Nhap vao canh thu 2 cua tam giac ");
            float b = Float.parseFloat(sc.nextLine());
            System.out.println("Nhap vao canh thu 3 cua tam giac ");
            float c = Float.parseFloat(sc.nextLine());
            if (a+b<c||b+c<a||a+c<b){
                throw new IllegalTriangleException("Day k phai 3 canh cua 1 tam giac ");

            }else {
                System.out.println("Day la 3 canh cua 1 tam giac ");
            }
        }catch (NumberFormatException e ){
            throw  new IllegalTriangleException("Nhap vao 1 so  ");
        }

    }
}