package io.burkard.cdk.services.dlm

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CrossRegionCopyDeprecateRuleProperty {

  def apply(
    intervalUnit: Option[String] = None,
    interval: Option[Number] = None
  ): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty =
    (new software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty.Builder)
      .intervalUnit(intervalUnit.orNull)
      .interval(interval.orNull)
      .build()
}
