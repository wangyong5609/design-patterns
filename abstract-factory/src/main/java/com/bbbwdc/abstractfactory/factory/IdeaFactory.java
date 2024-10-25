package com.bbbwdc.abstractfactory.factory;

import com.bbbwdc.abstractfactory.component.Editor;
import com.bbbwdc.abstractfactory.component.MenuBar;
import com.bbbwdc.abstractfactory.component.ToolBar;

/**
 * IDEA工厂
 */
public interface IdeaFactory {
    ToolBar createToolBar();
    Editor createEditor();
    MenuBar createMenuBar();
}
