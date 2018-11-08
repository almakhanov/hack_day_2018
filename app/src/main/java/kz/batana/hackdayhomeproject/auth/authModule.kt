package kz.batana.hackdayhomeproject.auth

import kz.batana.hackdayhomeproject.core.createService
import org.koin.dsl.module.module

val authModule = module {
    factory { LoginPresenter(get()) as LoginContract.LoginPresenter }
    factory { LoginRepository() as LoginContract.LoginRepository }
    single { createService<LoginService>(get()) }
}