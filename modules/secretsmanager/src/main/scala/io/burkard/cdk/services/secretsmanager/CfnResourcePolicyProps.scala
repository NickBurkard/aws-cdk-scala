package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResourcePolicyProps {

  def apply(
    secretId: Option[String] = None,
    blockPublicPolicy: Option[Boolean] = None,
    resourcePolicy: Option[AnyRef] = None
  ): software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps =
    (new software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps.Builder)
      .secretId(secretId.orNull)
      .blockPublicPolicy(blockPublicPolicy.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .resourcePolicy(resourcePolicy.orNull)
      .build()
}
