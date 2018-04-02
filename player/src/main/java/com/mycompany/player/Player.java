/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.player;

import com.mycompany.api.IMoveAble;

/**
 * @author Emil
 */
public class Player implements IMoveAble {

    private final String asset;
    private final float acceleration;
    private final float deceleration;
    private final float maxSpeed;
    private final float rotationSpeed;

    private float x;
    private float y;
    private float dx;
    private float dy;
    private float rotation;
    private boolean turnLeft;
    private boolean turnRight;
    private boolean moveForward;

    Player(final String asset,
           final float acceleration,
           final float deceleration,
           final float maxSpeed,
           final float rotationSpeed) {
        this.asset = asset;
        this.acceleration = acceleration;
        this.deceleration = deceleration;
        this.maxSpeed = maxSpeed;
        this.rotationSpeed = rotationSpeed;
    }

    @Override
    public String getAsset() {
        return asset;
    }

    @Override
    public float getX() {
        return x;
    }

    @Override
    public void setX(float x) {
        this.x = x;
    }

    @Override
    public float getY() {
        return y;
    }

    @Override
    public void setY(float y) {
        this.y = y;
    }

    @Override
    public boolean isTurnLeft() {
        return turnLeft;
    }

    @Override
    public void setTurnLeft(boolean turnLeft) {
        this.turnLeft = turnLeft;
    }

    @Override
    public boolean isTurnRight() {
        return turnRight;
    }

    @Override
    public void setTurnRight(boolean turnRight) {
        this.turnRight = turnRight;
    }

    @Override
    public float getRotation() {
        return rotation;
    }

    @Override
    public void setRotation(float rotation) {
        this.rotation = rotation;
    }

    @Override
    public boolean isMoveForward() {
        return moveForward;
    }

    @Override
    public void setMoveForward(boolean moveForward) {
        this.moveForward = moveForward;
    }

    @Override
    public float getAcceleration() {
        return acceleration;
    }

    @Override
    public float getDx() {
        return dx;
    }

    @Override
    public void setDx(float dx) {
        this.dx = dx;
    }

    @Override
    public float getDy() {
        return dy;
    }

    @Override
    public void setDy(float dy) {
        this.dy = dy;
    }

    @Override
    public float getDeceleration() {
        return deceleration;
    }

    @Override
    public float getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public float getRotationSpeed() {
        return rotationSpeed;
    }
}
