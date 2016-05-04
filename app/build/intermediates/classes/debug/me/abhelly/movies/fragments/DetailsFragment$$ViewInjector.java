// Generated code from Butter Knife. Do not modify!
package me.abhelly.movies.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class DetailsFragment$$ViewInjector<T extends me.abhelly.movies.fragments.DetailsFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findOptionalView(source, 2131492972, null);
    target.mCollapsingToolbar = finder.castView(view, 2131492972, "field 'mCollapsingToolbar'");
    view = finder.findOptionalView(source, 2131492969, null);
    target.mToolbar = finder.castView(view, 2131492969, "field 'mToolbar'");
    view = finder.findRequiredView(source, 2131492976, "field 'mActionButton' and method 'onFavoriteAction'");
    target.mActionButton = finder.castView(view, 2131492976, "field 'mActionButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onFavoriteAction();
        }
      });
    view = finder.findRequiredView(source, 2131492973, "field 'mBackdropImageView'");
    target.mBackdropImageView = finder.castView(view, 2131492973, "field 'mBackdropImageView'");
    view = finder.findRequiredView(source, 2131492974, "field 'mPosterImageView'");
    target.mPosterImageView = finder.castView(view, 2131492974, "field 'mPosterImageView'");
    view = finder.findRequiredView(source, 2131492984, "field 'mRatingTextView'");
    target.mRatingTextView = finder.castView(view, 2131492984, "field 'mRatingTextView'");
    view = finder.findRequiredView(source, 2131492985, "field 'mDateTextView'");
    target.mDateTextView = finder.castView(view, 2131492985, "field 'mDateTextView'");
    view = finder.findRequiredView(source, 2131492986, "field 'mOverviewTextView'");
    target.mOverviewTextView = finder.castView(view, 2131492986, "field 'mOverviewTextView'");
    view = finder.findRequiredView(source, 2131492987, "field 'mEmptyOverviewTextView'");
    target.mEmptyOverviewTextView = finder.castView(view, 2131492987, "field 'mEmptyOverviewTextView'");
    view = finder.findRequiredView(source, 2131492988, "field 'mTrailersParent'");
    target.mTrailersParent = finder.castView(view, 2131492988, "field 'mTrailersParent'");
    view = finder.findRequiredView(source, 2131492989, "field 'mEmptyTrailersTextView'");
    target.mEmptyTrailersTextView = finder.castView(view, 2131492989, "field 'mEmptyTrailersTextView'");
    view = finder.findRequiredView(source, 2131492990, "field 'mReviewsParent'");
    target.mReviewsParent = finder.castView(view, 2131492990, "field 'mReviewsParent'");
    view = finder.findRequiredView(source, 2131492991, "field 'mEmptyReviewsTextView'");
    target.mEmptyReviewsTextView = finder.castView(view, 2131492991, "field 'mEmptyReviewsTextView'");
  }

  @Override public void reset(T target) {
    target.mCollapsingToolbar = null;
    target.mToolbar = null;
    target.mActionButton = null;
    target.mBackdropImageView = null;
    target.mPosterImageView = null;
    target.mRatingTextView = null;
    target.mDateTextView = null;
    target.mOverviewTextView = null;
    target.mEmptyOverviewTextView = null;
    target.mTrailersParent = null;
    target.mEmptyTrailersTextView = null;
    target.mReviewsParent = null;
    target.mEmptyReviewsTextView = null;
  }
}
