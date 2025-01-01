class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int closestX = Math.max(x1, Math.min(xCenter, x2));
        int closestY = Math.max(y1, Math.min(yCenter, y2));
        
        // Calculate the distance from the circle center to this closest point
        int deltaX = xCenter - closestX;
        int deltaY = yCenter - closestY;
        
        // Check if this distance is less than or equal to the radius
        return (deltaX * deltaX + deltaY * deltaY) <= (radius * radius);
    }
    
}
