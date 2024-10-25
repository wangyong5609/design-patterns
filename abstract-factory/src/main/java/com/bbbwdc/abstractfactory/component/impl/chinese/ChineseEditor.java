package com.bbbwdc.abstractfactory.component.impl.chinese;

import com.bbbwdc.abstractfactory.component.Editor;

public class ChineseEditor implements Editor {
    @Override
    public void display() {
        System.out.println("中文编辑器");
    }
}
