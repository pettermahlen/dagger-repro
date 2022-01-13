/**
 * TODO: document
 */
import dagger.Module
import dagger.Provides
import foo.Baz
import foo.Foo
import javax.inject.Singleton

@Module
class SomeModule {
    @Provides
    @Singleton
    fun provideFoo() : Foo<Baz> = Foo()

    @Provides
    @Singleton
    fun provideBar(foo: Foo<Baz>) = Bar(foo)
}

class Bar(val value: Any)
