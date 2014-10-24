package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.ScreenManager;

/**
 * Created by raghu on 13/10/14.
 */
public class screen2 extends baseScreen {
    BitmapFont font;


    public screen2(ScreenManager mgr) {
        super(mgr);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 1, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        sb.begin();
        font.setColor(Color.RED);
        font.setScale(10);

        font.draw(sb, "Screen 2", 500, 500);
        sb.end();

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {
        font = new BitmapFont();
        sb = new SpriteBatch();

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
