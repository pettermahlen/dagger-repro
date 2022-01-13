import dagger.Component
import javax.inject.Singleton

/**
 * TODO: document
 */
@Component(
    modules = [
        SomeModule::class
    ]
)
@Singleton
interface SomeComponent {
    fun bar(): Bar
}
