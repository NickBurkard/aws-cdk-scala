package io.burkard.cdk.services.emr

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AutoScalingPolicyProperty {

  def apply(
    constraints: software.amazon.awscdk.services.emr.CfnCluster.ScalingConstraintsProperty,
    rules: List[_]
  ): software.amazon.awscdk.services.emr.CfnCluster.AutoScalingPolicyProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.AutoScalingPolicyProperty.Builder)
      .constraints(constraints)
      .rules(rules.asJava)
      .build()
}
