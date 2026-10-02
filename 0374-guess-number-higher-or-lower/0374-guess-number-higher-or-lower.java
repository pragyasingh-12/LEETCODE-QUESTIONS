/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int least = 1;
        int most = n;
        while (least <= most) 
        {
            n=(int)(least+(most-least)/2); //binary search
            int pick=guess(n);
            if (pick == -1) 
            {
                most=n-1;
            } 
            else if (pick == 1) 
            {
                least=n+1;
            }
            else 
            {
                return n;
            }
        }
        return n;
    }
}