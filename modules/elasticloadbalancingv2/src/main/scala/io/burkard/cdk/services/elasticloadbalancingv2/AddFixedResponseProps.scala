package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AddFixedResponseProps {

  def apply(
    statusCode: Option[String] = None,
    conditions: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition]] = None,
    priority: Option[Number] = None,
    pathPatterns: Option[List[String]] = None,
    pathPattern: Option[String] = None,
    messageBody: Option[String] = None,
    contentType: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ContentType] = None,
    hostHeader: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.AddFixedResponseProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.AddFixedResponseProps.Builder)
      .statusCode(statusCode.orNull)
      .conditions(conditions.map(_.asJava).orNull)
      .priority(priority.orNull)
      .pathPatterns(pathPatterns.map(_.asJava).orNull)
      .pathPattern(pathPattern.orNull)
      .messageBody(messageBody.orNull)
      .contentType(contentType.orNull)
      .hostHeader(hostHeader.orNull)
      .build()
}
