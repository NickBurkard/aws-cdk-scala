package io.burkard.cdk.services.xray

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SamplingRuleProperty {

  def apply(
    priority: Option[Number] = None,
    urlPath: Option[String] = None,
    resourceArn: Option[String] = None,
    httpMethod: Option[String] = None,
    version: Option[Number] = None,
    ruleArn: Option[String] = None,
    reservoirSize: Option[Number] = None,
    ruleName: Option[String] = None,
    serviceType: Option[String] = None,
    serviceName: Option[String] = None,
    host: Option[String] = None,
    fixedRate: Option[Number] = None,
    attributes: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleProperty =
    (new software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleProperty.Builder)
      .priority(priority.orNull)
      .urlPath(urlPath.orNull)
      .resourceArn(resourceArn.orNull)
      .httpMethod(httpMethod.orNull)
      .version(version.orNull)
      .ruleArn(ruleArn.orNull)
      .reservoirSize(reservoirSize.orNull)
      .ruleName(ruleName.orNull)
      .serviceType(serviceType.orNull)
      .serviceName(serviceName.orNull)
      .host(host.orNull)
      .fixedRate(fixedRate.orNull)
      .attributes(attributes.map(_.asJava).orNull)
      .build()
}
