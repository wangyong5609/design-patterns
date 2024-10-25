package com.bbbwdc.abstractfactory.component.impl.english;

import com.bbbwdc.abstractfactory.component.Editor;

public class EnglishEditor implements Editor {
    @Override
    public void display() {
        System.out.println("English Editor");
    }
}
