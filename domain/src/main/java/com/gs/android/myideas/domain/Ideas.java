package com.gs.android.myideas.domain;

public class Ideas {
    public static WithId<Idea> withId(final long id, final String text) {
        return new WithId<>(id, new Idea(text));
    }

    public static Idea with(final String text) {
        return new Idea(text);
    }
}
