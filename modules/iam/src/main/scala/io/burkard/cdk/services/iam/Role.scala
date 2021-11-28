package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Role {

  def apply(
    internalResourceId: String,
    assumedBy: software.amazon.awscdk.services.iam.IPrincipal,
    maxSessionDuration: Option[software.amazon.awscdk.Duration] = None,
    roleName: Option[String] = None,
    externalIds: Option[List[String]] = None,
    managedPolicies: Option[List[_ <: software.amazon.awscdk.services.iam.IManagedPolicy]] = None,
    path: Option[String] = None,
    inlinePolicies: Option[Map[String, _ <: software.amazon.awscdk.services.iam.PolicyDocument]] = None,
    permissionsBoundary: Option[software.amazon.awscdk.services.iam.IManagedPolicy] = None,
    description: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iam.Role =
    software.amazon.awscdk.services.iam.Role.Builder
      .create(stackCtx, internalResourceId)
      .assumedBy(assumedBy)
      .maxSessionDuration(maxSessionDuration.orNull)
      .roleName(roleName.orNull)
      .externalIds(externalIds.map(_.asJava).orNull)
      .managedPolicies(managedPolicies.map(_.asJava).orNull)
      .path(path.orNull)
      .inlinePolicies(inlinePolicies.map(_.asJava).orNull)
      .permissionsBoundary(permissionsBoundary.orNull)
      .description(description.orNull)
      .build()
}
