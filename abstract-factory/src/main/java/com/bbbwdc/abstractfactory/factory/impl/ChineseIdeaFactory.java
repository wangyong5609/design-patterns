package com.bbbwdc.abstractfactory.factory.impl;

import com.bbbwdc.abstractfactory.component.Editor;
import com.bbbwdc.abstractfactory.component.MenuBar;
import com.bbbwdc.abstractfactory.component.ToolBar;
import com.bbbwdc.abstractfactory.component.impl.chinese.ChineseEditor;
import com.bbbwdc.abstractfactory.component.impl.chinese.ChineseMenuBar;
import com.bbbwdc.abstractfactory.component.impl.chinese.ChineseToolBar;
import com.bbbwdc.abstractfactory.factory.IdeaFactory;

public class ChineseIdeaFactory implements IdeaFactory {
    @Override
    public ToolBar createToolBar() {
        return new ChineseToolBar();
    }

    @Override
    public Editor createEditor() {
        return new ChineseEditor();
    }

    @Override
    public MenuBar createMenuBar() {
        return new ChineseMenuBar();
    }
}
