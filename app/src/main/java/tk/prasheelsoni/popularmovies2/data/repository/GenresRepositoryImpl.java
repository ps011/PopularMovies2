
package tk.prasheelsoni.popularmovies2.data.repository;


import com.squareup.sqlbrite.BriteContentResolver;

import java.util.Map;

import rx.Observable;
import rx.schedulers.Schedulers;
import tk.prasheelsoni.popularmovies2.data.api.MoviesApi;
import tk.prasheelsoni.popularmovies2.data.model.Genre;
import tk.prasheelsoni.popularmovies2.data.provider.MoviesContract;

final class GenresRepositoryImpl implements tk.prasheelsoni.popularmovies2.data.repository.GenresRepository {

    private final MoviesApi mMoviesApi;
    private final BriteContentResolver mBriteContentResolver;

    public GenresRepositoryImpl(MoviesApi moviesApi, BriteContentResolver briteContentResolver) {
        mMoviesApi = moviesApi;
        mBriteContentResolver = briteContentResolver;
    }

    @Override
    public Observable<Map<Integer, Genre>> genres() {
        return mBriteContentResolver.createQuery(MoviesContract.Genres.CONTENT_URI, Genre.PROJECTION, null, null, null, true)
                .map(Genre.PROJECTION_MAP)
                .subscribeOn(Schedulers.io());
    }
}
