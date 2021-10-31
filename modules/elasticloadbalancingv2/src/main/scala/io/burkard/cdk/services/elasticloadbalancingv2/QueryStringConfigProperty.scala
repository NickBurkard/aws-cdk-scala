package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object QueryStringConfigProperty {

  def apply(
    values: Option[List[_]] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringConfigProperty =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringConfigProperty.Builder)
      .values(values.map(_.asJava).orNull)
      .build()
}
