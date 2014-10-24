package com.mygdx.game.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.mygdx.game.ScreenManager;

/**
 * Created by raghu on 22/10/14.
 */
public class baseScreen implements Screen {
    ScreenManager mgr;
    Stage stage;
    Table table;
    SpriteBatch sb;

    public baseScreen(ScreenManager mgr) {
        this.mgr = mgr;

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
