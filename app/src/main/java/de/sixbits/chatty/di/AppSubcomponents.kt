package de.sixbits.chatty.di

import dagger.Module
import de.sixbits.chatty.main.MainActivitySubcomponent

@Module(
        subcomponents = [
            MainActivitySubcomponent::class
        ]
)
class AppSubcomponents