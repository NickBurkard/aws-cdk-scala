package io.burkard.cdk.services.logs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourcePolicyProps {

  def apply(
    resourcePolicyName: Option[String] = None,
    policyStatements: Option[List[_ <: software.amazon.awscdk.services.iam.PolicyStatement]] = None
  ): software.amazon.awscdk.services.logs.ResourcePolicyProps =
    (new software.amazon.awscdk.services.logs.ResourcePolicyProps.Builder)
      .resourcePolicyName(resourcePolicyName.orNull)
      .policyStatements(policyStatements.map(_.asJava).orNull)
      .build()
}
