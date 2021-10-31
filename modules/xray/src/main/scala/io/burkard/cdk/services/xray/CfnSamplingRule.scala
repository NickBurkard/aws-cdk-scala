package io.burkard.cdk.services.xray

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSamplingRule {

  def apply(
    internalResourceId: String,
    ruleName: Option[String] = None,
    samplingRule: Option[software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleProperty] = None,
    samplingRuleUpdate: Option[software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleUpdateProperty] = None,
    samplingRuleRecord: Option[software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleRecordProperty] = None,
    tags: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.xray.CfnSamplingRule =
    software.amazon.awscdk.services.xray.CfnSamplingRule.Builder
      .create(stackCtx, internalResourceId)
      .ruleName(ruleName.orNull)
      .samplingRule(samplingRule.orNull)
      .samplingRuleUpdate(samplingRuleUpdate.orNull)
      .samplingRuleRecord(samplingRuleRecord.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
