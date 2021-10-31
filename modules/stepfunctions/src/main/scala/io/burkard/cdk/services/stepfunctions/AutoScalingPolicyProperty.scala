package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AutoScalingPolicyProperty {

  def apply(
    constraints: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingConstraintsProperty] = None,
    rules: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingRuleProperty]] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.AutoScalingPolicyProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.AutoScalingPolicyProperty.Builder)
      .constraints(constraints.orNull)
      .rules(rules.map(_.asJava).orNull)
      .build()
}
