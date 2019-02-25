// Generated by Dagger (https://google.github.io/dagger).
package in.goals.di;

import androidx.lifecycle.ViewModel;
import dagger.internal.Factory;
import java.util.Map;
import javax.inject.Provider;

public final class InjectingViewModelFactory_Factory implements Factory<InjectingViewModelFactory> {
  private final Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>>
      viewModelProvidersProvider;

  public InjectingViewModelFactory_Factory(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> viewModelProvidersProvider) {
    this.viewModelProvidersProvider = viewModelProvidersProvider;
  }

  @Override
  public InjectingViewModelFactory get() {
    return provideInstance(viewModelProvidersProvider);
  }

  public static InjectingViewModelFactory provideInstance(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> viewModelProvidersProvider) {
    return new InjectingViewModelFactory(viewModelProvidersProvider.get());
  }

  public static InjectingViewModelFactory_Factory create(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> viewModelProvidersProvider) {
    return new InjectingViewModelFactory_Factory(viewModelProvidersProvider);
  }

  public static InjectingViewModelFactory newInjectingViewModelFactory(
      Map<Class<? extends ViewModel>, Provider<ViewModel>> viewModelProviders) {
    return new InjectingViewModelFactory(viewModelProviders);
  }
}
