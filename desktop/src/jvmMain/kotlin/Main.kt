import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import ui.Login


fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        Login()
    }
}

@Preview
@Composable
fun desktopPreview(){
    Login()
}
