package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AddRedirectResponseProps {

  def apply(
    statusCode: Option[String] = None,
    conditions: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition]] = None,
    priority: Option[Number] = None,
    path: Option[String] = None,
    pathPattern: Option[String] = None,
    query: Option[String] = None,
    port: Option[String] = None,
    protocol: Option[String] = None,
    hostHeader: Option[String] = None,
    pathPatterns: Option[List[String]] = None,
    host: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.AddRedirectResponseProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.AddRedirectResponseProps.Builder)
      .statusCode(statusCode.orNull)
      .conditions(conditions.map(_.asJava).orNull)
      .priority(priority.orNull)
      .path(path.orNull)
      .pathPattern(pathPattern.orNull)
      .query(query.orNull)
      .port(port.orNull)
      .protocol(protocol.orNull)
      .hostHeader(hostHeader.orNull)
      .pathPatterns(pathPatterns.map(_.asJava).orNull)
      .host(host.orNull)
      .build()
}
