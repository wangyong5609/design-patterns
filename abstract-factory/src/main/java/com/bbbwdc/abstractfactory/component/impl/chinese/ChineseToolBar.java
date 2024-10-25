package com.bbbwdc.abstractfactory.component.impl.chinese;

import com.bbbwdc.abstractfactory.component.ToolBar;

public class ChineseToolBar implements ToolBar {
    @Override
    public void display() {
        System.out.println("中文工具栏");
    }
}
