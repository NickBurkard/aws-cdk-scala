package io.burkard.cdk.services.iam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GrantOnPrincipalAndResourceOptions {

  def apply(
    resourceArns: Option[List[String]] = None,
    resourceSelfArns: Option[List[String]] = None,
    resource: Option[software.amazon.awscdk.services.iam.IResourceWithPolicy] = None,
    grantee: Option[software.amazon.awscdk.services.iam.IGrantable] = None,
    actions: Option[List[String]] = None,
    resourcePolicyPrincipal: Option[software.amazon.awscdk.services.iam.IPrincipal] = None
  ): software.amazon.awscdk.services.iam.GrantOnPrincipalAndResourceOptions =
    (new software.amazon.awscdk.services.iam.GrantOnPrincipalAndResourceOptions.Builder)
      .resourceArns(resourceArns.map(_.asJava).orNull)
      .resourceSelfArns(resourceSelfArns.map(_.asJava).orNull)
      .resource(resource.orNull)
      .grantee(grantee.orNull)
      .actions(actions.map(_.asJava).orNull)
      .resourcePolicyPrincipal(resourcePolicyPrincipal.orNull)
      .build()
}
