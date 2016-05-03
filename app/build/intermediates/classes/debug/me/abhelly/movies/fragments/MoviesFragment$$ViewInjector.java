// Generated code from Butter Knife. Do not modify!
package me.abhelly.movies.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class MoviesFragment$$ViewInjector<T extends me.abhelly.movies.fragments.MoviesFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492980, "field 'mEmptyTextView'");
    target.mEmptyTextView = finder.castView(view, 2131492980, "field 'mEmptyTextView'");
    view = finder.findRequiredView(source, 2131492979, "field 'mErrorTextView'");
    target.mErrorTextView = finder.castView(view, 2131492979, "field 'mErrorTextView'");
    view = finder.findRequiredView(source, 2131492978, "field 'mRetryButton'");
    target.mRetryButton = finder.castView(view, 2131492978, "field 'mRetryButton'");
    view = finder.findRequiredView(source, 2131492977, "field 'mProgressBar'");
    target.mProgressBar = finder.castView(view, 2131492977, "field 'mProgressBar'");
    view = finder.findRequiredView(source, 2131492981, "field 'mRecyclerView'");
    target.mRecyclerView = finder.castView(view, 2131492981, "field 'mRecyclerView'");
  }

  @Override public void reset(T target) {
    target.mEmptyTextView = null;
    target.mErrorTextView = null;
    target.mRetryButton = null;
    target.mProgressBar = null;
    target.mRecyclerView = null;
  }
}
