package kz.batana.hackdayhomeproject.auth

import org.koin.dsl.module.module

val authModule = module {
    factory { LoginPresenter(get()) as LoginContract.LoginPresenter }
    factory { LoginRepository() as LoginContract.LoginRepository }
//    single { createService<LoginService>(get()) }
}