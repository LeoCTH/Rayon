package dev.lazurite.rayon.particle.api;

import java.util.Collections;

import dev.lazurite.rayon.core.api.PhysicsElement;
import dev.lazurite.rayon.core.impl.bullet.collision.body.shape.MinecraftShape;

public interface ParticlePhysicsElement extends PhysicsElement {
    @Override
    default MinecraftShape genShape() {
        return new MinecraftShape(Collections.emptyList());
    }
}
