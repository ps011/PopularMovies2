// Generated code from Butter Knife. Do not modify!
package me.abhelly.movies;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class MainActivity$$ViewInjector<T extends me.abhelly.movies.MainActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492969, "field 'mToolbar'");
    target.mToolbar = finder.castView(view, 2131492969, "field 'mToolbar'");
    view = finder.findOptionalView(source, 2131492971, null);
    target.mDetailsPlaceholder = finder.castView(view, 2131492971, "field 'mDetailsPlaceholder'");
  }

  @Override public void reset(T target) {
    target.mToolbar = null;
    target.mDetailsPlaceholder = null;
  }
}
