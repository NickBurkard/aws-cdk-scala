package io.burkard.cdk.services.dlm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CreateRuleProperty {

  def apply(
    interval: Option[Number] = None,
    times: Option[List[String]] = None,
    cronExpression: Option[String] = None,
    intervalUnit: Option[String] = None,
    location: Option[String] = None
  ): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty =
    (new software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty.Builder)
      .interval(interval.orNull)
      .times(times.map(_.asJava).orNull)
      .cronExpression(cronExpression.orNull)
      .intervalUnit(intervalUnit.orNull)
      .location(location.orNull)
      .build()
}
