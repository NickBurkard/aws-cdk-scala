package io.burkard.cdk.services.elasticloadbalancingv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpHeaderConfigProperty {

  def apply(
    httpHeaderName: Option[String] = None,
    values: Option[List[String]] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpHeaderConfigProperty =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpHeaderConfigProperty.Builder)
      .httpHeaderName(httpHeaderName.orNull)
      .values(values.map(_.asJava).orNull)
      .build()
}
