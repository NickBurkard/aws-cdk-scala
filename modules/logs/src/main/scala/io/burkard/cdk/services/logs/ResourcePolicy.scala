package io.burkard.cdk.services.logs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourcePolicy {

  def apply(
    internalResourceId: String,
    resourcePolicyName: Option[String] = None,
    policyStatements: Option[List[_ <: software.amazon.awscdk.services.iam.PolicyStatement]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.logs.ResourcePolicy =
    software.amazon.awscdk.services.logs.ResourcePolicy.Builder
      .create(stackCtx, internalResourceId)
      .resourcePolicyName(resourcePolicyName.orNull)
      .policyStatements(policyStatements.map(_.asJava).orNull)
      .build()
}
