package com.codecool.termlib;



class PipeElement {

        /**
         * Character codes for the pipe elements of same shape
         */
        char charCode;
        /**
         * Directions in which the element is connected
         * The arrays first element are the directions in which the element is connected
         * 0 is LEFT, 1 is UP, 2 is RIGHT, 3 is DOWN
         */
        int[] activeDirections;
        /**
         * Next permutation
         */
        PipeElement nextPermutationOfElement;

        PipeElement(char a, int[] dir) {
            this.charCode = a;
            this.activeDirections = dir;

        }
        /**
         * Get next permutation
         */
        PipeElement getNextPermutation() {
            return nextPermutationOfElement;
        }

    public static void main(String[] args) {
        PipeElement DOWNRIGHT = new PipeElement((char)9499, new int[]{1, 2});
        PipeElement DOWNLEFT = new PipeElement((char)9495, new int[]{0, 1});
        PipeElement UPLEFT = new PipeElement((char)9487, new int[]{0, 3});
        PipeElement UPRIGHT = new PipeElement((char)9491, new int[]{2, 3});
        DOWNRIGHT.nextPermutationOfElement = UPRIGHT;
        DOWNLEFT.nextPermutationOfElement = DOWNRIGHT;
        UPLEFT.nextPermutationOfElement = DOWNLEFT;
        UPRIGHT.nextPermutationOfElement = UPLEFT;

        PipeElement VERTICAL = new PipeElement((char)9475, new int[]{0, 2});
        PipeElement HORIZONTAL = new PipeElement((char)9473, new int[]{1, 3});
        VERTICAL.nextPermutationOfElement = HORIZONTAL;
        HORIZONTAL.nextPermutationOfElement = VERTICAL;
        System.out.println(DOWNLEFT.getNextPermutation().charCode);
    }
}
