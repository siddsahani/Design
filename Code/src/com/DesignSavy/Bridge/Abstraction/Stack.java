package com.DesignSavy.Bridge.Abstraction;

import com.DesignSavy.Bridge.Impl.StackImpl;

/**
 * Created by sisahani on 2/8/17.
 */
public abstract class Stack {

    protected StackImpl getImpl() {
        return impl;
    }

    public abstract void push(int item);
    public abstract int pop();
    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return false;
    }

    // Member variables
    private StackImpl impl;
    private int size;
}
