package com.willfp.eco.util;

import lombok.experimental.UtilityClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Utilities / API methods for lists.
 */
@UtilityClass
public class ListUtils {
    /**
     * Initialize 2D list of a given size.
     *
     * @param rows    The amount of rows.
     * @param columns The amount of columns.
     * @param <T>     The type of the object stored in the list.
     * @return The list, filled will null objects.
     */
    @NotNull
    public <@Nullable T> List<List<T>> create2DList(final int rows,
                                                    final int columns) {
        List<List<T>> list = new ArrayList<>(rows);
        while (list.size() < rows) {
            List<T> row = new ArrayList<>(columns);
            while (row.size() < columns) {
                row.add(null);
            }
            list.add(row);
        }

        return list;
    }

    /**
     * Convert a list potentially containing duplicates to a map where the value is the frequency of the key.
     *
     * @param list The list.
     * @param <T>  The type parameter of the list.
     * @return The frequency map.
     */
    @NotNull
    private static <T> Map<T, Integer> listToFrequencyMap(@NotNull final List<T> list) {
        Map<T, Integer> frequencyMap = new HashMap<>();
        for (T object : list) {
            if (frequencyMap.containsKey(object)) {
                frequencyMap.put(object, frequencyMap.get(object) + 1);
            } else {
                frequencyMap.put(object, 1);
            }
        }

        return frequencyMap;
    }
}
