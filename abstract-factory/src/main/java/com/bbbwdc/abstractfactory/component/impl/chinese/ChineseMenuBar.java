package com.bbbwdc.abstractfactory.component.impl.chinese;

import com.bbbwdc.abstractfactory.component.MenuBar;

public class ChineseMenuBar implements MenuBar {
    @Override
    public void display() {
        System.out.println("中文菜单栏");
    }
}
