package com.company;

public class Main {

    public static void main(String[] args) {
        Triangle triangleOne = new Triangle();

        triangleOne.sideA = 4;
        triangleOne.sideB = 4;
        triangleOne.sideC = 4;

        triangleOne.getPerimeter(triangleOne.sideA, triangleOne.sideB, triangleOne.sideC);
        triangleOne.isEquilateral(triangleOne.sideA, triangleOne.sideB, triangleOne.sideC);

        printTriangleSummary(triangleOne);

        Triangle triangleTwo = new Triangle();

        triangleTwo.sideA = 3;
        triangleTwo.sideB = 5;
        triangleTwo.sideC = 8;

        triangleOne.getPerimeter(triangleTwo.sideA, triangleTwo.sideB, triangleTwo.sideC);
        triangleOne.isEquilateral(triangleTwo.sideA, triangleTwo.sideB, triangleTwo.sideC);

        printTriangleSummary(triangleTwo);

        Triangle triangleThree = new Triangle();

        triangleThree.sideA = 3;
        triangleThree.sideB = 3;
        triangleThree.sideC = 8;

        triangleOne.getPerimeter(triangleThree.sideA, triangleThree.sideB, triangleThree.sideC);
        triangleOne.isEquilateral(triangleThree.sideA, triangleThree.sideB, triangleThree.sideC);

        printTriangleSummary(triangleThree);
    }

    private static void printTriangleSummary (Triangle triangle){
        System.out.println("The sides of the triangle are: " + triangle.sideA + " + " + triangle.sideB + " + " + triangle.sideC );
        System.out.println("The perimeter of the triangle is: " + triangle.getPerimeter(triangle.sideA, triangle.sideB, triangle.sideC));
        System.out.println("This triangle is an equilateral: " + triangle.isEquilateral(triangle.sideA, triangle.sideB, triangle.sideC));
        System.out.println("This triangle is an isosceles: " + triangle.isIsosceles(triangle.sideA, triangle.sideB, triangle.sideC));
        System.out.println("This trianlge is scalene: " + triangle.isScalene(triangle.sideA, triangle.sideB, triangle.sideC));
        System.out.println("This triangle has a right angle: " + triangle.isRightAngle(triangle.sideA, triangle.sideB, triangle.sideC));
        System.out.println("This triangle is acute: " + triangle.isAcute(triangle.sideA, triangle.sideB, triangle.sideC));
        System.out.println("This triangle is obtuse: " + triangle.isObtuse(triangle.sideA, triangle.sideB, triangle.sideC));
    }
}
