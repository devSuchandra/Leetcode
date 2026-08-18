class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int minvalue = Integer.MAX_VALUE;
        int index = Integer.MAX_VALUE;
        for(int row = 0; row < drones.length; row++){
            // for(int col = 0; col < drones.length; col++){
            //     int sum = 0;
            //     int val = drone[row][col];    
            //     sum = diff1 + diff2;

            // }
            int xVal = drones[row][0];
            int yVal = drones[row][1];
            int range = drones[row][2];

            int diff = Math.abs(xVal - target[0]) + Math.abs(yVal - target[1]);
            
            
            if(diff < minvalue && diff <= range){
                minvalue = Math.min(diff,minvalue);
                index = row;
            }
        }
        return index == Integer.MAX_VALUE ? -1 : index;
    }
}