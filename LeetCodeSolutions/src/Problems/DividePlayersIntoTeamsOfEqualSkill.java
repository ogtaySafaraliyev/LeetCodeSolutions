package Problems;

import java.util.*;

public class DividePlayersIntoTeamsOfEqualSkill {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);

        int left = 0;
        int right = skill.length - 1;

        int innerSum = skill[left] + skill[right];
        long ans = 0;
        

        while(left < right) {            
            if(innerSum == skill[left] + skill[right]) {
                ans += skill[left] * skill[right];
                left++;
                right--;
            }
            else {
                return -1;
            }          
            
        }
        return ans;
    }
}
