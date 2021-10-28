package io.burkard.cdk.services.dlm

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
