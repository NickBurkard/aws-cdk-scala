package io.burkard.cdk.services.dlm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLifecyclePolicy {

  def apply(
    internalResourceId: String,
    state: Option[String] = None,
    executionRoleArn: Option[String] = None,
    policyDetails: Option[software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy =
    software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.Builder
      .create(stackCtx, internalResourceId)
      .state(state.orNull)
      .executionRoleArn(executionRoleArn.orNull)
      .policyDetails(policyDetails.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
