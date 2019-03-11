/*
 * MIT License
 *
 * Copyright (c) 2018 Jan Heinrich Reimer
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

import org.gradle.kotlin.dsl.kotlin
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

inline val PluginDependenciesSpec.androidApplication: PluginDependencySpec
    get() = id("com.android.application").version(Versions.androidBuildTools)

inline val PluginDependenciesSpec.kotlinAndroid: PluginDependencySpec
    // https://plugins.gradle.org/plugin/org.jetbrains.kotlin.android
    get() = kotlin("android").version(Versions.kotlin)

inline val PluginDependenciesSpec.kotlinAndroidExtensions: PluginDependencySpec
    // https://plugins.gradle.org/plugin/org.jetbrains.kotlin.android.extensions
    get() = kotlin("android.extensions").version(Versions.kotlin)

inline val PluginDependenciesSpec.kotlinKapt: PluginDependencySpec
    // https://plugins.gradle.org/plugin/org.jetbrains.kotlin.kapt
    get() = kotlin("kapt").version(Versions.kotlin)

inline val PluginDependenciesSpec.googlePlayPublishing: PluginDependencySpec
    // https://plugins.gradle.org/plugin/com.github.triplet.play
    get() = id("com.github.triplet.play").version(Versions.googlePlayPublishingPlugin)

inline val PluginDependenciesSpec.fDroidPublishing: PluginDependencySpec
    // https://plugins.gradle.org/plugin/org.openintents.fdroid
    get() = id("org.openintents.fdroid").version(Versions.fDroidPublishingPlugin)

inline val PluginDependenciesSpec.jacocoAndroid: PluginDependencySpec
    // https://plugins.gradle.org/plugin/com.vanniktech.android.junit.jacoco
    get() = id("com.vanniktech.android.junit.jacoco").version(Versions.jacocoAndroidPlugin)

inline val PluginDependenciesSpec.spoon: PluginDependencySpec
    // https://plugins.gradle.org/plugin/com.jaredsburrows.spoon
    get() = id("com.jaredsburrows.spoon").version(Versions.spoonPlugin)

inline val PluginDependenciesSpec.githubRelease: PluginDependencySpec
    // https://plugins.gradle.org/plugin/com.github.breadmoirai.github-release
    get() = id("com.github.breadmoirai.github-release").version(Versions.githubReleasePlugin)
