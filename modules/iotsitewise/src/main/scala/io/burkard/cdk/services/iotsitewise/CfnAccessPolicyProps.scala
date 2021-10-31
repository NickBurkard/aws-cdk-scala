package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAccessPolicyProps {

  def apply(
    accessPolicyResource: Option[software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyResourceProperty] = None,
    accessPolicyIdentity: Option[software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyIdentityProperty] = None,
    accessPolicyPermission: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAccessPolicyProps =
    (new software.amazon.awscdk.services.iotsitewise.CfnAccessPolicyProps.Builder)
      .accessPolicyResource(accessPolicyResource.orNull)
      .accessPolicyIdentity(accessPolicyIdentity.orNull)
      .accessPolicyPermission(accessPolicyPermission.orNull)
      .build()
}
