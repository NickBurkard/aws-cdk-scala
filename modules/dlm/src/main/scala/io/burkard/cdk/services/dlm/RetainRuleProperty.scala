package io.burkard.cdk.services.dlm

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RetainRuleProperty {

  def apply(
    count: Option[Number] = None,
    intervalUnit: Option[String] = None,
    interval: Option[Number] = None
  ): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty =
    (new software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty.Builder)
      .count(count.orNull)
      .intervalUnit(intervalUnit.orNull)
      .interval(interval.orNull)
      .build()
}
