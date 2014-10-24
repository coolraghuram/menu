package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.mygdx.game.ScreenManager;

/**
 * Created by raghu on 13/10/14.
 */
public class menuScreen extends baseScreen {
    BitmapFont font;

    Label gameName;
    Label.LabelStyle lable_style;
    TextButton btnPlay;
    TextButton btnExit;
    TextButton.TextButtonStyle style;
    String[] menuItems = new String[]{"Play", "Settings", "Exit"};

    public menuScreen(ScreenManager mgr) {
        super(mgr);

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        //sb.setProjectionMatrix(mgr.game.ca);
//        sb.begin();
//        font.setColor(Color.RED);
//        font.setScale(10);
//
//        font.draw(sb, "Screen 1", 500, 500);
//        sb.end();
        stage.draw();


    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {
        font = new BitmapFont();
        sb = new SpriteBatch();
        table = new Table();
        table.debug();
        //table.setBounds(100, 100, 300, 300);
        lable_style = new Label.LabelStyle();
        lable_style.font = new BitmapFont();
        lable_style.fontColor = Color.YELLOW;
        lable_style.font.setScale(12);
        gameName = new Label("The Game", lable_style);
        table.add(gameName);
        table.row();
        stage = new Stage();
        style = new TextButton.TextButtonStyle();
        style.font = new BitmapFont();
        style.fontColor = Color.CYAN;
        style.font.setScale(10);
        btnPlay = new TextButton("Play", style);
        btnPlay.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                mgr.game.setScreen(mgr.scr2);
            }
        });
        btnExit = new TextButton("Exit", style);
        btnExit.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                Gdx.app.exit();
            }
        });
        table.setFillParent(true);
        table.add(btnPlay);
        table.row();
        table.add(btnExit);
        table.row();
        stage.addActor(table);
        Gdx.input.setInputProcessor(stage);
        Gdx.input.setCatchBackKey(true);



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
        font.dispose();
        sb.dispose();

    }
}
