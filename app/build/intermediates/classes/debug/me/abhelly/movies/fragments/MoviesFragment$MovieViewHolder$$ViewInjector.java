// Generated code from Butter Knife. Do not modify!
package me.abhelly.movies.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class MoviesFragment$MovieViewHolder$$ViewInjector<T extends me.abhelly.movies.fragments.MoviesFragment.MovieViewHolder> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492974, "field 'mPosterView'");
    target.mPosterView = finder.castView(view, 2131492974, "field 'mPosterView'");
  }

  @Override public void reset(T target) {
    target.mPosterView = null;
  }
}
