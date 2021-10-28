package io.burkard.cdk.services.dlm

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DeprecateRuleProperty {

  def apply(
    count: Option[Number] = None,
    intervalUnit: Option[String] = None,
    interval: Option[Number] = None
  ): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.DeprecateRuleProperty =
    (new software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.DeprecateRuleProperty.Builder)
      .count(count.orNull)
      .intervalUnit(intervalUnit.orNull)
      .interval(interval.orNull)
      .build()
}
