package rocks.zipcode.io.collections;

import java.util.*;

public class CollectionUtils {

    /**
     * @param collection - object to be converted to list
     * @param <E>        - type of collection
     * @return list with identical contents
     */
    public static <E> List<E> toList(Collection collection) {
        List<E> list = new ArrayList<>(collection);
        return list;
    }

    /**
     * @param nestedCollection - collection to be evaluated
     * @param collection       - collections to be sought within `nestedCollection`
     * @return true if `nestedCollection` contains a collection with contents identical to `collection`
     */
    public static Boolean contains(Collection<? extends Collection<?>> nestedCollection, Collection<?> collection) {
        return nestedCollection.contains(collection);
    }

    /**
     * @param collections - collections to be nested
     * @return a single collection containing each of the collections passed in as an argument
     */
    public static Collection<? extends Collection<?>> nest(Collection<?>... collections) {

        Collection<? extends Collection<?>> container = new ArrayList<>();
//        for(Collection collection : collections){
//            container.add(collection);
//        }
        container = Arrays.asList(collections);
//        Collection<? extends Collection> collection = container;
        return container;
    }

    /**
     * @param collections - collections to be combined
     * @return a single collection containing the aggregate contents of each collection passed in as an argument
     */
    public static Collection<?> flatten(Collection<?>... collections) {
        Collection<? extends Collection<?>> container = new ArrayList<>();
        for (Collection<?> t : collections) {
            container.addAll(toList(t));
        }
//        Collection<? extends Collection> collection = container;
        return container;
    }
}
