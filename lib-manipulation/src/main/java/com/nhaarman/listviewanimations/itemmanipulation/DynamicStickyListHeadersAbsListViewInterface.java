package com.nhaarman.listviewanimations.itemmanipulation;

import android.support.annotation.NonNull;
import android.util.Pair;

public interface DynamicStickyListHeadersAbsListViewInterface {
    public boolean isInteracting();
    public void insert(final int index, final Object item);
    public void insert(final int index, final Object... items);
    public <T> void insert(@NonNull final Pair<Integer, T>... indexItemPairs);
    public <T> void insert(@NonNull final Iterable<Pair<Integer, T>> indexItemPairs);
    public <T> void remove(@NonNull final int position);
    public <T> void remove(@NonNull final int position, final int count);
}
