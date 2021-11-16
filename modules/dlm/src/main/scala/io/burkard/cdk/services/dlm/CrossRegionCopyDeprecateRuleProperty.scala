package io.burkard.cdk.services.dlm

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CrossRegionCopyDeprecateRuleProperty {

  def apply(
    intervalUnit: String,
    interval: Number
  ): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty =
    (new software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty.Builder)
      .intervalUnit(intervalUnit)
      .interval(interval)
      .build()
}
