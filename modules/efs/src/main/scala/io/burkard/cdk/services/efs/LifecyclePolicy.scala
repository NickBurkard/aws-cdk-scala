package io.burkard.cdk.services.efs


sealed abstract class LifecyclePolicy(val underlying: software.amazon.awscdk.services.efs.LifecyclePolicy)
  extends Product
    with Serializable


object LifecyclePolicy {
  implicit def toAws(value: LifecyclePolicy): software.amazon.awscdk.services.efs.LifecyclePolicy =
    Option(value).map(_.underlying).orNull

  case object After7Days
    extends LifecyclePolicy(software.amazon.awscdk.services.efs.LifecyclePolicy.AFTER_7_DAYS)

  case object After14Days
    extends LifecyclePolicy(software.amazon.awscdk.services.efs.LifecyclePolicy.AFTER_14_DAYS)

  case object After30Days
    extends LifecyclePolicy(software.amazon.awscdk.services.efs.LifecyclePolicy.AFTER_30_DAYS)

  case object After60Days
    extends LifecyclePolicy(software.amazon.awscdk.services.efs.LifecyclePolicy.AFTER_60_DAYS)

  case object After90Days
    extends LifecyclePolicy(software.amazon.awscdk.services.efs.LifecyclePolicy.AFTER_90_DAYS)
}
