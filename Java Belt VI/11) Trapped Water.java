/*Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
The elevation map is represented by an array where each integer represents the height of the bar at that index.*/
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int[] height = new int[n];

for (int i = 0; i < n; i++) {
    height[i] = sc.nextInt();
}

int water = 0;

for (int i = 0; i < n; i++) {

    int leftMax = 0;
    for (int j = 0; j <= i; j++) {
        leftMax = Math.max(leftMax, height[j]);
    }

    int rightMax = 0;
    for (int j = i; j < n; j++) {
        rightMax = Math.max(rightMax, height[j]);
    }

    water += Math.min(leftMax, rightMax) - height[i];
}

System.out.println(water);