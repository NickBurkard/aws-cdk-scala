package io.burkard.cdk.core.assets

@scala.annotation.nowarn("cat=deprecation")
sealed abstract class FollowMode(val underlying: software.amazon.awscdk.assets.FollowMode)
  extends Product
    with Serializable

@scala.annotation.nowarn("cat=deprecation")
object FollowMode {
  implicit def toAws(value: FollowMode): software.amazon.awscdk.assets.FollowMode =
    Option(value).map(_.underlying).orNull

  case object Never
    extends FollowMode(software.amazon.awscdk.assets.FollowMode.NEVER)

  case object Always
    extends FollowMode(software.amazon.awscdk.assets.FollowMode.ALWAYS)

  case object External
    extends FollowMode(software.amazon.awscdk.assets.FollowMode.EXTERNAL)

  case object BlockExternal
    extends FollowMode(software.amazon.awscdk.assets.FollowMode.BLOCK_EXTERNAL)
}
