class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int size=flowerbed.length,c=0,i=0;
        if(n==0)
            return true;
        while(i<size)
            {
                if(flowerbed[i]==0){
                 boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                 boolean rightEmpty = (i == size - 1) || (flowerbed[i + 1] == 0);
                if(leftEmpty && rightEmpty)
                {
                    flowerbed[i]=1;
                    c++;
                }
                if(c>=n)
                    return true;
                }
            i++;
            }
    return false;
    }
}