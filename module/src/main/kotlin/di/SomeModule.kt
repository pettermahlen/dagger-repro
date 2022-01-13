/**
 * TODO: document
 */
import dagger.Module
import dagger.Provides
import foo.Foo
import javax.inject.Singleton

@Module
class SomeModule {
    @Provides
    @Singleton
    fun provideFoo(): Foo<String> = Foo()

    @Provides
    @Singleton
    fun provideBar(foo: Foo<String>) = Bar()
}

class Bar()
