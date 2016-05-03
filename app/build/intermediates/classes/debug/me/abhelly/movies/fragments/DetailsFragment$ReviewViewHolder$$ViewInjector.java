// Generated code from Butter Knife. Do not modify!
package me.abhelly.movies.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class DetailsFragment$ReviewViewHolder$$ViewInjector<T extends me.abhelly.movies.fragments.DetailsFragment.ReviewViewHolder> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131493005, "field 'avatarImageView'");
    target.avatarImageView = finder.castView(view, 2131493005, "field 'avatarImageView'");
    view = finder.findRequiredView(source, 2131493006, "field 'nameTextView'");
    target.nameTextView = finder.castView(view, 2131493006, "field 'nameTextView'");
    view = finder.findRequiredView(source, 2131493007, "field 'contentTextView'");
    target.contentTextView = finder.castView(view, 2131493007, "field 'contentTextView'");
  }

  @Override public void reset(T target) {
    target.avatarImageView = null;
    target.nameTextView = null;
    target.contentTextView = null;
  }
}
