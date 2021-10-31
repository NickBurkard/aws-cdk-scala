package io.burkard.cdk.services.emr

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AutoScalingPolicyProperty {

  def apply(
    constraints: Option[software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty] = None,
    rules: Option[List[_]] = None
  ): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty =
    (new software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty.Builder)
      .constraints(constraints.orNull)
      .rules(rules.map(_.asJava).orNull)
      .build()
}
