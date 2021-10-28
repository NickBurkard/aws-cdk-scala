package io.burkard.cdk.services.ecs

sealed abstract class FargatePlatformVersion(val underlying: software.amazon.awscdk.services.ecs.FargatePlatformVersion)
  extends Product
    with Serializable

object FargatePlatformVersion {
  implicit def toAws(value: FargatePlatformVersion): software.amazon.awscdk.services.ecs.FargatePlatformVersion =
    Option(value).map(_.underlying).orNull

  case object Latest
    extends FargatePlatformVersion(software.amazon.awscdk.services.ecs.FargatePlatformVersion.LATEST)

  case object Version14
    extends FargatePlatformVersion(software.amazon.awscdk.services.ecs.FargatePlatformVersion.VERSION1_4)

  case object Version13
    extends FargatePlatformVersion(software.amazon.awscdk.services.ecs.FargatePlatformVersion.VERSION1_3)

  case object Version12
    extends FargatePlatformVersion(software.amazon.awscdk.services.ecs.FargatePlatformVersion.VERSION1_2)

  case object Version11
    extends FargatePlatformVersion(software.amazon.awscdk.services.ecs.FargatePlatformVersion.VERSION1_1)

  case object Version10
    extends FargatePlatformVersion(software.amazon.awscdk.services.ecs.FargatePlatformVersion.VERSION1_0)
}
