package com.bbbwdc;

import com.bbbwdc.abstractfactory.component.Editor;
import com.bbbwdc.abstractfactory.component.MenuBar;
import com.bbbwdc.abstractfactory.component.ToolBar;
import com.bbbwdc.abstractfactory.component.impl.chinese.ChineseEditor;
import com.bbbwdc.abstractfactory.component.impl.chinese.ChineseMenuBar;
import com.bbbwdc.abstractfactory.component.impl.chinese.ChineseToolBar;
import com.bbbwdc.abstractfactory.component.impl.english.EnglishEditor;
import com.bbbwdc.abstractfactory.component.impl.english.EnglishMenuBar;
import com.bbbwdc.abstractfactory.component.impl.english.EnglishToolBar;
import com.bbbwdc.abstractfactory.factory.impl.ChineseIdeaFactory;
import com.bbbwdc.abstractfactory.factory.impl.EnglishIdeaFactory;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void test() {
        ChineseIdeaFactory chineseIdeaFactory = new ChineseIdeaFactory();
        ToolBar toolBar = chineseIdeaFactory.createToolBar();
        MenuBar menuBar = chineseIdeaFactory.createMenuBar();
        Editor editor = chineseIdeaFactory.createEditor();
        toolBar.display();
        menuBar.display();
        editor.display();

        EnglishIdeaFactory englishIdeaFactory = new EnglishIdeaFactory();
        toolBar = englishIdeaFactory.createToolBar();
        menuBar = englishIdeaFactory.createMenuBar();
        editor = englishIdeaFactory.createEditor();
        toolBar.display();
        menuBar.display();
        editor.display();
    }

    @Test
    public void shit() {
        String language = "chinese";
        display(language);

        language = "english";
        display(language);
    }
    
    public void display(String language) {
        MenuBar menuBar;
        if ("Chinese".equalsIgnoreCase(language)) {
            menuBar =  new ChineseMenuBar();
        } else if ("English".equalsIgnoreCase(language)) {
            menuBar =  new EnglishMenuBar();
        } else {
            throw new IllegalArgumentException("Unsupported language: " + language);
        }

        ToolBar toolBar;
        if ("Chinese".equalsIgnoreCase(language)) {
            toolBar =  new ChineseToolBar();
        } else if ("English".equalsIgnoreCase(language)) {
            toolBar =  new EnglishToolBar();
        } else {
            throw new IllegalArgumentException("Unsupported language: " + language);
        }

        Editor editor;
        if ("Chinese".equalsIgnoreCase(language)) {
            editor =  new ChineseEditor();
        } else if ("English".equalsIgnoreCase(language)) {
            editor =  new EnglishEditor();
        } else {
            throw new IllegalArgumentException("Unsupported language: " + language);
        }

        toolBar.display();
        menuBar.display();
        editor.display();
    }
    
    
}
