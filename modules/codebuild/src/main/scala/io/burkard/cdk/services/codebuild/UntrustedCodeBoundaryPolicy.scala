package io.burkard.cdk.services.codebuild

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UntrustedCodeBoundaryPolicy {

  def apply(
    internalResourceId: String,
    additionalStatements: Option[List[_ <: software.amazon.awscdk.services.iam.PolicyStatement]] = None,
    managedPolicyName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicy =
    software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicy.Builder
      .create(stackCtx, internalResourceId)
      .additionalStatements(additionalStatements.map(_.asJava).orNull)
      .managedPolicyName(managedPolicyName.orNull)
      .build()
}
