public class TrappingRainWater {
    public static int trapRainWater(int[] height) {
        if (height.length == 0) {
            throw new IllegalArgumentException("Height array cannot be empty.");
        }
        int n = height.length;

        // left maxBoundry
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // right maxBoundry
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int trappedWater = 0;

        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(rightMax[i], leftMax[i]);
            trappedWater = trappedWater + waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trapRainWater(height));
    }
}
