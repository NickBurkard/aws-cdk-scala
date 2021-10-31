package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LazyRoleProps {

  def apply(
    maxSessionDuration: Option[software.amazon.awscdk.Duration] = None,
    assumedBy: Option[software.amazon.awscdk.services.iam.IPrincipal] = None,
    roleName: Option[String] = None,
    externalIds: Option[List[String]] = None,
    managedPolicies: Option[List[_ <: software.amazon.awscdk.services.iam.IManagedPolicy]] = None,
    path: Option[String] = None,
    inlinePolicies: Option[Map[String, _ <: software.amazon.awscdk.services.iam.PolicyDocument]] = None,
    permissionsBoundary: Option[software.amazon.awscdk.services.iam.IManagedPolicy] = None,
    description: Option[String] = None
  ): software.amazon.awscdk.services.iam.LazyRoleProps =
    (new software.amazon.awscdk.services.iam.LazyRoleProps.Builder)
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
