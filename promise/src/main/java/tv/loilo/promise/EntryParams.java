package tv.loilo.promise;

/**
 * Created by Junpei on 2015/10/26.
 */
public final class EntryParams implements ExecutionContext {
    private final CancelToken mCancelToken;
    private final CloseableStack mScope;
    private final Object mTag;

    public EntryParams(final CancelToken cancelToken, final CloseableStack scope, final Object tag) {
        mCancelToken = cancelToken;
        mScope = scope;
        mTag = tag;
    }

    @Override
    public CloseableStack getScope() {
        return mScope;
    }

    @Override
    public Object getTag() {
        return mTag;
    }

    @Override
    public CancelToken getCancelToken() {
        return mCancelToken;
    }
}