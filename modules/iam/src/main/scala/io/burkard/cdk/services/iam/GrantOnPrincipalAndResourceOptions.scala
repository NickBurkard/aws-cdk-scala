package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
