package io.burkard.cdk.services.ecs

sealed abstract class WindowsOptimizedVersion(val underlying: software.amazon.awscdk.services.ecs.WindowsOptimizedVersion)
  extends Product
    with Serializable

object WindowsOptimizedVersion {
  implicit def toAws(value: WindowsOptimizedVersion): software.amazon.awscdk.services.ecs.WindowsOptimizedVersion =
    Option(value).map(_.underlying).orNull

  case object Server2019
    extends WindowsOptimizedVersion(software.amazon.awscdk.services.ecs.WindowsOptimizedVersion.SERVER_2019)

  case object Server2016
    extends WindowsOptimizedVersion(software.amazon.awscdk.services.ecs.WindowsOptimizedVersion.SERVER_2016)
}
