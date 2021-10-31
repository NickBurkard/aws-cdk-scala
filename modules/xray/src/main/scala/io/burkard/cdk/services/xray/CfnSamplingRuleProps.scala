package io.burkard.cdk.services.xray

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSamplingRuleProps {

  def apply(
    ruleName: Option[String] = None,
    samplingRule: Option[software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleProperty] = None,
    samplingRuleUpdate: Option[software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleUpdateProperty] = None,
    samplingRuleRecord: Option[software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleRecordProperty] = None,
    tags: Option[List[_]] = None
  ): software.amazon.awscdk.services.xray.CfnSamplingRuleProps =
    (new software.amazon.awscdk.services.xray.CfnSamplingRuleProps.Builder)
      .ruleName(ruleName.orNull)
      .samplingRule(samplingRule.orNull)
      .samplingRuleUpdate(samplingRuleUpdate.orNull)
      .samplingRuleRecord(samplingRuleRecord.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
