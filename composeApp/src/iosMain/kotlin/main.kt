import androidx.compose.ui.window.ComposeUIViewController
import org.ncgroup.portfolio.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
