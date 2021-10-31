package io.burkard.cdk.services.dlm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLifecyclePolicyProps {

  def apply(
    state: Option[String] = None,
    executionRoleArn: Option[String] = None,
    policyDetails: Option[software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps =
    (new software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps.Builder)
      .state(state.orNull)
      .executionRoleArn(executionRoleArn.orNull)
      .policyDetails(policyDetails.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
