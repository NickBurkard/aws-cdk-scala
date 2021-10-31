package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RiskExceptionConfigurationTypeProperty {

  def apply(
    blockedIpRangeList: Option[List[String]] = None,
    skippedIpRangeList: Option[List[String]] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty.Builder)
      .blockedIpRangeList(blockedIpRangeList.map(_.asJava).orNull)
      .skippedIpRangeList(skippedIpRangeList.map(_.asJava).orNull)
      .build()
}
