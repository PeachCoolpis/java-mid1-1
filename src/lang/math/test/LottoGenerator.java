package lang.math.test;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class LottoGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        
        Set<Integer> lottoSet = new HashSet<>();
        
        while (lottoSet.size() < 6) {
            int lotto = random.nextInt(45) + 1;
            lottoSet.add(lotto);
        }
        
        String collect = lottoSet.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
        
        
        System.out.println("로또번호 = " + collect);
    }
}
