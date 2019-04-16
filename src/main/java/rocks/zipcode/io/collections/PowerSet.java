package rocks.zipcode.io.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 10/01/2019.
 */
public class PowerSet<TypeOfSet> {
    protected final Set<TypeOfSet> originalSet;

    public PowerSet(TypeOfSet[] originalSet) {
        this.originalSet = new HashSet<>(Arrays.asList(originalSet));
    }

    /**
     * @return the powerset of `originalSet`
     */
    public Set<Set<TypeOfSet>> permute() {
        Set<Set<TypeOfSet>> sets = new HashSet<>();
        Set<TypeOfSet> set;
        Integer number = (int) Math.pow(2,originalSet.size());
        for (int i = 0; i <number ; i++) {
            for (int j = 0; j <originalSet.size() ; j++) {
                set = new HashSet<>();
//                set.add(originalSet[i])
            }
        }
        return sets;
    }

    /**
     * @return `originalSet`
     */
    public Set<TypeOfSet> getOriginalSet() {
        return originalSet;
    }
}
