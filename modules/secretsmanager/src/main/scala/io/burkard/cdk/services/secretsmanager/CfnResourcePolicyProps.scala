package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourcePolicyProps {

  def apply(
    secretId: String,
    resourcePolicy: AnyRef,
    blockPublicPolicy: Option[Boolean] = None
  ): software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps =
    (new software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps.Builder)
      .secretId(secretId)
      .resourcePolicy(resourcePolicy)
      .blockPublicPolicy(blockPublicPolicy.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
