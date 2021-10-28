package io.burkard.cdk.services.xray

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SamplingRuleRecordProperty {

  def apply(
    modifiedAt: Option[String] = None,
    createdAt: Option[String] = None,
    samplingRule: Option[software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleProperty] = None
  ): software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleRecordProperty =
    (new software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleRecordProperty.Builder)
      .modifiedAt(modifiedAt.orNull)
      .createdAt(createdAt.orNull)
      .samplingRule(samplingRule.orNull)
      .build()
}