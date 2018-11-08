package kz.batana.hackdayhomeproject

import kz.batana.hackdayhomeproject.auth.authModule
import kz.batana.hackdayhomeproject.core.coreModule
import org.koin.dsl.module.Module
import org.koin.dsl.module.module

val appModules: List<Module>
    get() = listOf(
            authModule,
            coreModule,
            singletons
    )

val singletons = module {
//    Logger.msg("accepted",Constants.URL )
//    single { createService<StoreService>(get(), Constants.URL) }
//    single { createService<HistoryService>(get(), Constants.URL) }
//    single { createService<ClubService>(get(), Constants.URL) }
}