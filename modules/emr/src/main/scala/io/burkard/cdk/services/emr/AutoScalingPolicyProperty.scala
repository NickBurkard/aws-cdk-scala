package io.burkard.cdk.services.emr

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
