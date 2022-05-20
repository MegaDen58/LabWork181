package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ������: ");
        String input = in.nextLine();
        int counterOne = 0;
        int counterZero = 0;
        boolean canNext = true;
        for(char c : input.toCharArray()){
            if(c == '1'){
                counterOne++;
            }
            else if(c == '0'){
                counterZero++;
            }
            else{
                canNext = false;
                break;
            }
        }
        if(canNext){
            System.out.printf("���������� 0: %d\n���������� 1: %d\n����� ���������� ��������: %d", counterZero, counterOne, input.length());
        }
        else{
            System.out.println("������ �����.");
        }
    }
}