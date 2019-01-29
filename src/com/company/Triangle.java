package com.company;

public class Triangle {

        int sideA;
        int sideB;
        int sideC;

        public int getPerimeter (int sideA, int sideB, int sideC){
            int perimeter = sideA + sideB + sideC;
            return perimeter;
        }

        public boolean isEquilateral (int sideA, int sideB, int sideC){
            boolean equilateral = false;
            if (sideA == sideB && sideB == sideC){
                equilateral = true;
            }
            return equilateral;
        }

        public boolean isIsosceles (int sideA, int sideB, int sideC){
            boolean isosceles = false;
            if (sideA == sideB && sideB != sideC){
                isosceles = true;
            }
            else if (sideB == sideC && sideA != sideC){
                isosceles = true;
            }
            else if (sideA == sideC && sideB != sideA){
                isosceles = true;
            }
            else {
                isosceles = false;
            }

            return isosceles;
        }

        public boolean isScalene (int sideA, int sideB, int sideC){
            boolean scalene = false;
            if (sideA != sideB && sideB != sideC && sideA != sideC){
                scalene = true;
            }
            else {
                scalene = false;
            }

            return scalene;
        }

        public boolean isRightAngle (int sideA, int sideB, int sideC){
            boolean rightAngle = false;
            if ((sideA * sideA) == (sideB * sideB) + (sideC * sideC)){
                rightAngle = true;
            }
            if ((sideA * sideB) == (sideA * sideA) * (sideC * sideC)){
                rightAngle = true;
            }
            if ((sideC * sideC) == (sideA * sideA) * (sideC * sideC)){
                rightAngle = true;
            }
            else {
                rightAngle = false;
            }

            return rightAngle;
        }

        public boolean isAcute (int sideA, int sideB, int sideC){
            boolean acute = false;

            if (sideA + sideB > sideC){
                acute = true;
            }
            if (sideA + sideC > sideB){
                acute = true;
            }
            if (sideB + sideC > sideA){
                acute = true;
            }
            else {
                acute = false;
            }

            return acute;
        }

        public boolean isObtuse (int sideA, int sideB, int sideC){
            boolean obtuse = false;

            if (sideA + sideB < sideC){
                obtuse = true;
            }
            if (sideB + sideC < sideA){
                obtuse = true;
            }
            if (sideA + sideC < sideB){
                obtuse = true;
            }
            else {
                obtuse = false;
            }

            return obtuse;
        }
}
