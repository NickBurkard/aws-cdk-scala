package io.burkard.cdk.services.codebuild

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
