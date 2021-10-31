package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpRequestMethodConfigProperty {

  def apply(
    values: Option[List[String]] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpRequestMethodConfigProperty =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpRequestMethodConfigProperty.Builder)
      .values(values.map(_.asJava).orNull)
      .build()
}
