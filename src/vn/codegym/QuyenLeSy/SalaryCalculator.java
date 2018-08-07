package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         float year;
         double no, salary;


// Không thỏa mãn điều kiện về năm làm việc và hệ số lương thì cần nhập lại
        do {
            System.out.print("Nhập vào số năm làm việc: ");
            year = scanner.nextFloat();
        }
        while (year <= 0);

        do {
            System.out.print("Nhập vào hệ số lương (từ 1 - 5): ");
            no = scanner.nextFloat();
        }
        while (no < 1 || no > 5);

        salary = (no * 4000000) + (year * 500000);

        System.out.printf("Tiền lương là: %10.0f", salary);
    }
}
