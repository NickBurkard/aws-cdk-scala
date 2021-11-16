package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAccessPolicyProps {

  def apply(
    accessPolicyResource: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyResourceProperty,
    accessPolicyIdentity: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyIdentityProperty,
    accessPolicyPermission: String
  ): software.amazon.awscdk.services.iotsitewise.CfnAccessPolicyProps =
    (new software.amazon.awscdk.services.iotsitewise.CfnAccessPolicyProps.Builder)
      .accessPolicyResource(accessPolicyResource)
      .accessPolicyIdentity(accessPolicyIdentity)
      .accessPolicyPermission(accessPolicyPermission)
      .build()
}
