package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.mygdx.game.screens.menuScreen;
import com.mygdx.game.screens.screen2;

/**
 * Created by raghu on 18/10/14.
 */
public class ScreenManager implements InputProcessor{
    public MyGdxGame game;
    public menuScreen menu;
    public screen2 scr2;

    public ScreenManager(MyGdxGame game){
        this.game = game;
        menu = new menuScreen(this);
        scr2 = new screen2(this);
        Gdx.input.setInputProcessor(this);
        game.setScreen(menu);

    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        //game.setScreen(scr2);

        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
