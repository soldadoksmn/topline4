package com.kisimoni.topline.ui.icons

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddPhotoAlternate
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowRightAlt
import androidx.compose.material.icons.filled.Autorenew
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.CalendarToday
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.ChatBubble
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.GridView
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.NotificationsActive
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Tune
import androidx.compose.material.icons.filled.Translate
import androidx.compose.material.icons.filled.Videocam
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material.icons.filled.Reply
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.runtime.Composable
import com.kisimoni.topline.R

/**
 * Centralized icon aliases used by Topline's Compose UI.
 * Standard icons use Compose Material's extended icon set; the two brand
 * marks remain app-owned vector assets.
 */
object BootstrapIcons {
    @Composable fun Add(): ImageVector = Icons.Filled.Add
    @Composable fun AddPhoto(): ImageVector = Icons.Filled.AddPhotoAlternate
    @Composable fun ArrowBack(): ImageVector = Icons.Filled.ArrowBack
    @Composable fun ArrowDropDown(): ImageVector = Icons.Filled.ArrowDropDown
    @Composable fun ArrowRepeat(): ImageVector = Icons.Filled.Autorenew
    @Composable fun ArrowRightTurn(): ImageVector = Icons.Filled.ArrowRightAlt
    @Composable fun Bell(): ImageVector = Icons.Filled.Notifications
    @Composable fun BellFill(): ImageVector = Icons.Filled.NotificationsActive
    @Composable fun Bookmark(): ImageVector = Icons.Filled.BookmarkBorder
    @Composable fun BookmarkFill(): ImageVector = Icons.Filled.Bookmark
    @Composable fun Calendar(): ImageVector = Icons.Filled.CalendarToday
    @Composable fun CameraVideo(): ImageVector = Icons.Filled.Videocam
    @Composable fun ChatDotsFill(): ImageVector = Icons.Filled.ChatBubble
    @Composable fun ChatLeftText(): ImageVector = Icons.Filled.Chat
    @Composable fun ChatLeftTextFill(): ImageVector = Icons.Filled.Chat
    @Composable fun ClockHistory(): ImageVector = Icons.Filled.History
    @Composable fun Close(): ImageVector = Icons.Filled.Close
    @Composable fun Copy(): ImageVector = Icons.Filled.ContentCopy
    @Composable fun Delete(): ImageVector = Icons.Filled.Delete
    @Composable fun Download(): ImageVector = Icons.Filled.Download
    @Composable fun Edit(): ImageVector = Icons.Filled.Edit
    @Composable fun Email(): ImageVector = Icons.Filled.Email
    @Composable fun Eye(): ImageVector = Icons.Filled.Visibility
    @Composable fun EyeSlash(): ImageVector = Icons.Filled.VisibilityOff
    @Composable fun Facebook(): ImageVector = ImageVector.vectorResource(R.drawable.facebook_f)
    @Composable fun Gear(): ImageVector = Icons.Filled.Settings
    @Composable fun Google(): ImageVector = ImageVector.vectorResource(R.drawable.google_g)
    @Composable fun GridFill(): ImageVector = Icons.Filled.GridView
    @Composable fun Heart(): ImageVector = Icons.Filled.Favorite
    @Composable fun HeartFill(): ImageVector = Icons.Filled.Favorite
    @Composable fun HeartOutline(): ImageVector = Icons.Filled.Favorite
    @Composable fun HomeFill(): ImageVector = Icons.Filled.Home
    @Composable fun Image(): ImageVector = Icons.Filled.AddPhotoAlternate
    @Composable fun Language(): ImageVector = Icons.Filled.Translate
    @Composable fun Lock(): ImageVector = Icons.Filled.Lock
    @Composable fun Message(): ImageVector = Icons.Filled.Chat
    @Composable fun PeopleFill(): ImageVector = Icons.Filled.People
    @Composable fun Person(): ImageVector = Icons.Filled.Person
    @Composable fun PersonFill(): ImageVector = Icons.Filled.Person
    @Composable fun Play(): ImageVector = Icons.Filled.PlayArrow
    @Composable fun Refresh(): ImageVector = Icons.Filled.Refresh
    @Composable fun Search(): ImageVector = Icons.Filled.Search
    @Composable fun Send(): ImageVector = Icons.Filled.Send
    @Composable fun Settings(): ImageVector = Icons.Filled.Settings
    @Composable fun Share(): ImageVector = Icons.Filled.Reply
    @Composable fun Sliders(): ImageVector = Icons.Filled.Tune
    @Composable fun Trash(): ImageVector = Icons.Filled.Delete
}
