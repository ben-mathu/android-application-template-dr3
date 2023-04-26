package com.benatt.androidtemplate.di;

import com.benatt.androidtemplate.di.modules.NetworkModule;

import dagger.Component;

/**
 * @author ben-mathu
 * @date 4/26/23
 */
@Component(modules = {NetworkModule.class})
public interface MainComponent {
    @Component.Builder
    interface Builder {
        Builder dbModule();
        MainComponent build();
    }
}
