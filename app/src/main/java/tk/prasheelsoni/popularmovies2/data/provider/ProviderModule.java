/*
 * Copyright 2015.  Emin Yahyayev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tk.prasheelsoni.popularmovies2.data.provider;

import android.app.Application;
import android.content.ContentResolver;
import android.database.sqlite.SQLiteOpenHelper;

import com.squareup.sqlbrite.BriteContentResolver;
import com.squareup.sqlbrite.SqlBrite;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import timber.log.Timber;

@Module(
        injects = {
                MoviesProvider.class
        },
        complete = false,
        library = true
)
public final class ProviderModule {

    @Provides
    @Singleton SqlBrite provideSqlBrite() {
        return SqlBrite.create(message -> Timber.tag("Database").v(message));
    }

    @Provides
    @Singleton ContentResolver provideContentResolver(Application application) {
        return application.getContentResolver();
    }

    @Provides
    @Singleton BriteContentResolver provideBrideContentResolver(SqlBrite sqlBrite, ContentResolver contentResolver) {
        return sqlBrite.wrapContentProvider(contentResolver);
    }

}
