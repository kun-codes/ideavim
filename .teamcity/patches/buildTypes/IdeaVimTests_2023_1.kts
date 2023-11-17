package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'IdeaVimTests_2023_1'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("IdeaVimTests_2023_1")) {
    check(name == "Tests for IntelliJ 2023.1") {
        "Unexpected name: '$name'"
    }
    name = "Tests for IntelliJ IC-2023.1"
}
