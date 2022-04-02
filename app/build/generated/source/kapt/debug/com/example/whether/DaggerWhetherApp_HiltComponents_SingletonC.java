package com.example.whether;

import android.app.Activity;
import android.app.Service;
import android.content.SharedPreferences;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.example.whether.core.base.BaseActivity;
import com.example.whether.core.base.BaseActivity_MembersInjector;
import com.example.whether.core.base.BaseFragment_MembersInjector;
import com.example.whether.receiver.AlarmReceiver;
import com.example.whether.receiver.AlarmReceiver_MembersInjector;
import com.example.whether.receiver.MyFirebaseMessagingService;
import com.example.whether.receiver.MyFirebaseMessagingService_MembersInjector;
import com.example.whether.retrofit.di.AppModule;
import com.example.whether.retrofit.di.AppModule_ProvideSharedPreferencesFactory;
import com.example.whether.ui.home.HomeActivity;
import com.example.whether.ui.homewether.HomeFragment;
import com.example.whether.utils.Prefs;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerWhetherApp_HiltComponents_SingletonC extends WhetherApp_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object sharedPreferences = new MemoizedSentinel();

  private DaggerWhetherApp_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private SharedPreferences getSharedPreferences() {
    Object local = sharedPreferences;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = sharedPreferences;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideSharedPreferencesFactory.provideSharedPreferences(ApplicationContextModule_ProvideApplicationFactory.provideApplication(applicationContextModule));
          sharedPreferences = DoubleCheck.reentrantCheck(sharedPreferences, local);
        }
      }
    }
    return (SharedPreferences) local;
  }

  private Prefs getPrefs() {
    return new Prefs(getSharedPreferences());
  }

  @Override
  public void injectWhetherApp(WhetherApp whetherApp) {
  }

  @Override
  public void injectAlarmReceiver(AlarmReceiver alarmReceiver) {
    injectAlarmReceiver2(alarmReceiver);
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  private AlarmReceiver injectAlarmReceiver2(AlarmReceiver instance) {
    AlarmReceiver_MembersInjector.injectPrefs(instance, getPrefs());
    return instance;
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public WhetherApp_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerWhetherApp_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements WhetherApp_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public WhetherApp_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends WhetherApp_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements WhetherApp_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public WhetherApp_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends WhetherApp_HiltComponents.ActivityC {
      private final Activity activity;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerWhetherApp_HiltComponents_SingletonC.this.applicationContextModule), Collections.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>emptyMap());
      }

      @Override
      public void injectBaseActivity(BaseActivity baseActivity) {
        injectBaseActivity2(baseActivity);
      }

      @Override
      public void injectHomeActivity(HomeActivity homeActivity) {
        injectHomeActivity2(homeActivity);
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private BaseActivity injectBaseActivity2(BaseActivity instance) {
        BaseActivity_MembersInjector.injectPrefs(instance, DaggerWhetherApp_HiltComponents_SingletonC.this.getPrefs());
        return instance;
      }

      private HomeActivity injectHomeActivity2(HomeActivity instance) {
        BaseActivity_MembersInjector.injectPrefs(instance, DaggerWhetherApp_HiltComponents_SingletonC.this.getPrefs());
        return instance;
      }

      private final class FragmentCBuilder implements WhetherApp_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public WhetherApp_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends WhetherApp_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerWhetherApp_HiltComponents_SingletonC.this.applicationContextModule), Collections.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>emptyMap());
        }

        @Override
        public void injectHomeFragment(HomeFragment homeFragment) {
          injectHomeFragment2(homeFragment);
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private HomeFragment injectHomeFragment2(HomeFragment instance) {
          BaseFragment_MembersInjector.injectPrefs(instance, DaggerWhetherApp_HiltComponents_SingletonC.this.getPrefs());
          return instance;
        }

        private final class ViewWithFragmentCBuilder implements WhetherApp_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public WhetherApp_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends WhetherApp_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements WhetherApp_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public WhetherApp_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends WhetherApp_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }
    }
  }

  private final class ServiceCBuilder implements WhetherApp_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public WhetherApp_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends WhetherApp_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }

    @Override
    public void injectMyFirebaseMessagingService(
        MyFirebaseMessagingService myFirebaseMessagingService) {
      injectMyFirebaseMessagingService2(myFirebaseMessagingService);
    }

    private MyFirebaseMessagingService injectMyFirebaseMessagingService2(
        MyFirebaseMessagingService instance) {
      MyFirebaseMessagingService_MembersInjector.injectPrefs(instance, DaggerWhetherApp_HiltComponents_SingletonC.this.getPrefs());
      return instance;
    }
  }
}
