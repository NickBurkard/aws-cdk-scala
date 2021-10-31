package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
