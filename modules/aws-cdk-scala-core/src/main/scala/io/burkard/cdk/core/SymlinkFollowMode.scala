package io.burkard.cdk.core

sealed abstract class SymlinkFollowMode(val underlying: software.amazon.awscdk.SymlinkFollowMode)
  extends Product
    with Serializable

object SymlinkFollowMode {
  implicit def toAws(value: SymlinkFollowMode): software.amazon.awscdk.SymlinkFollowMode =
    Option(value).map(_.underlying).orNull

  case object Never
    extends SymlinkFollowMode(software.amazon.awscdk.SymlinkFollowMode.NEVER)

  case object Always
    extends SymlinkFollowMode(software.amazon.awscdk.SymlinkFollowMode.ALWAYS)

  case object External
    extends SymlinkFollowMode(software.amazon.awscdk.SymlinkFollowMode.EXTERNAL)

  case object BlockExternal
    extends SymlinkFollowMode(software.amazon.awscdk.SymlinkFollowMode.BLOCK_EXTERNAL)
}
