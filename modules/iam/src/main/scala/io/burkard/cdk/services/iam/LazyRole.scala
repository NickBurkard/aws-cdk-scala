package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LazyRole {

  def apply(
    internalResourceId: String,
    maxSessionDuration: Option[software.amazon.awscdk.Duration] = None,
    assumedBy: Option[software.amazon.awscdk.services.iam.IPrincipal] = None,
    roleName: Option[String] = None,
    externalIds: Option[List[String]] = None,
    managedPolicies: Option[List[_ <: software.amazon.awscdk.services.iam.IManagedPolicy]] = None,
    path: Option[String] = None,
    inlinePolicies: Option[Map[String, _ <: software.amazon.awscdk.services.iam.PolicyDocument]] = None,
    permissionsBoundary: Option[software.amazon.awscdk.services.iam.IManagedPolicy] = None,
    description: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iam.LazyRole =
    software.amazon.awscdk.services.iam.LazyRole.Builder
      .create(stackCtx, internalResourceId)
      .maxSessionDuration(maxSessionDuration.orNull)
      .assumedBy(assumedBy.orNull)
      .roleName(roleName.orNull)
      .externalIds(externalIds.map(_.asJava).orNull)
      .managedPolicies(managedPolicies.map(_.asJava).orNull)
      .path(path.orNull)
      .inlinePolicies(inlinePolicies.map(_.asJava).orNull)
      .permissionsBoundary(permissionsBoundary.orNull)
      .description(description.orNull)
      .build()
}
