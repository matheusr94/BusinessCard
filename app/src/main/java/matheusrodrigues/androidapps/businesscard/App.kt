package matheusrodrigues.androidapps.businesscard

import android.app.Application
import matheusrodrigues.androidapps.businesscard.data.AppDatabase
import matheusrodrigues.androidapps.businesscard.data.BusinessCardRepository

class App : Application() {

    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}