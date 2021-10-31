package io.burkard.cdk.services.codebuild

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UntrustedCodeBoundaryPolicyProps {

  def apply(
    additionalStatements: Option[List[_ <: software.amazon.awscdk.services.iam.PolicyStatement]] = None,
    managedPolicyName: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicyProps =
    (new software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicyProps.Builder)
      .additionalStatements(additionalStatements.map(_.asJava).orNull)
      .managedPolicyName(managedPolicyName.orNull)
      .build()
}
