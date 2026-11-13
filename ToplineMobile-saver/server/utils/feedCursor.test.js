import assert from "node:assert/strict";
import test from "node:test";
import { decodeFeedCursor, encodeFeedCursor } from "./feedCursor.js";

test("feed cursor round-trips a post timestamp and MongoDB id", () => {
    const post = {
        createdAt: new Date("2026-11-13T10:00:00.000Z"),
        _id: "507f1f77bcf86cd799439011",
    };
    const decoded = decodeFeedCursor(encodeFeedCursor(post));
    assert.equal(decoded.createdAt.toISOString(), post.createdAt.toISOString());
    assert.equal(decoded.id, post._id);
});

test("feed cursor rejects malformed data and accepts an absent cursor", () => {
    assert.equal(decodeFeedCursor(null), null);
    assert.equal(decodeFeedCursor(""), null);
    assert.equal(decodeFeedCursor("not-a-valid-cursor"), undefined);
    assert.equal(decodeFeedCursor(Buffer.from(JSON.stringify({
        createdAt: "not-a-date",
        id: "invalid",
    })).toString("base64url")), undefined);
});
