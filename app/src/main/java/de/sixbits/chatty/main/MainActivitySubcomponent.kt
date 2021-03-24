package de.sixbits.chatty.main

import dagger.Subcomponent
import de.sixbits.chatty.di.ActivityScope

@ActivityScope
@Subcomponent(modules = [
    MainActivityModule::class
])
interface MainActivitySubcomponent {
    @Subcomponent.Factory interface Factory {
        fun create(): MainActivitySubcomponent
    }
}