package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CodeSigningPoliciesProperty {

  def apply(
    untrustedArtifactOnDeployment: String
  ): software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.CodeSigningPoliciesProperty =
    (new software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.CodeSigningPoliciesProperty.Builder)
      .untrustedArtifactOnDeployment(untrustedArtifactOnDeployment)
      .build()
}
