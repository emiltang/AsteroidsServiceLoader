/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */
package com.mycompany.enemy;

import com.mycompany.api.ICollideAble;
import com.mycompany.api.IMoveAble;
import com.mycompany.library.CollisionAbility;
import com.mycompany.library.MoveAbility;

public class Enemy implements IMoveAble, ICollideAble {

    private final MoveAbility moveAbility;
    private final CollisionAbility collisionAbility;
    private final String asset;

    private float x;
    private float y;
    private float rotation;

    Enemy(final String asset,
          MoveAbility moveAbility,
          CollisionAbility collisionAbility) {
        this.moveAbility = moveAbility;
        this.collisionAbility = collisionAbility;
        this.asset = asset;
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
    public float getRotation() {
        return rotation;
    }

    @Override
    public void setRotation(float rotation) {
        this.rotation = rotation;
    }

    @Override
    public String getAsset() {
        return asset;
    }

    @Override
    public CollisionAbility getCollisionAbility() {
        return collisionAbility;
    }

    @Override
    public MoveAbility getMoveAbility() {
        return moveAbility;
    }
}
