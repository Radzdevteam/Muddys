package io.github.porum.muddy.plugin

/**
 * Created by panda on 2021/8/4 10:41
 */
interface MuddyExtension {
  fun isEnable(enable: Boolean)
  fun setKey(muddyKey: Int)
}