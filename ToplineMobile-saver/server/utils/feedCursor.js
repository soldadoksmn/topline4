export const encodeFeedCursor = (post) => Buffer.from(JSON.stringify({
    createdAt: new Date(post.createdAt).toISOString(),
    id: String(post._id),
})).toString("base64url");

export const decodeFeedCursor = (value) => {
    if (typeof value !== "string" || !value.trim()) return null;
    try {
        const decoded = JSON.parse(Buffer.from(value, "base64url").toString("utf8"));
        const createdAt = new Date(decoded.createdAt);
        const id = String(decoded.id || "");
        if (!Number.isFinite(createdAt.getTime()) || !/^[a-f0-9]{24}$/i.test(id)) return undefined;
        return { createdAt, id };
    } catch {
        return undefined;
    }
};
