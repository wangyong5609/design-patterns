package com.bbbwdc.abstractfactory.factory.impl;

import com.bbbwdc.abstractfactory.component.Editor;
import com.bbbwdc.abstractfactory.component.MenuBar;
import com.bbbwdc.abstractfactory.component.ToolBar;
import com.bbbwdc.abstractfactory.component.impl.english.EnglishEditor;
import com.bbbwdc.abstractfactory.component.impl.english.EnglishMenuBar;
import com.bbbwdc.abstractfactory.component.impl.english.EnglishToolBar;
import com.bbbwdc.abstractfactory.factory.IdeaFactory;

public class EnglishIdeaFactory implements IdeaFactory {
    @Override
    public ToolBar createToolBar() {
        return new EnglishToolBar();
    }

    @Override
    public Editor createEditor() {
        return new EnglishEditor();
    }

    @Override
    public MenuBar createMenuBar() {
        return new EnglishMenuBar();
    }
}
