package io.burkard.cdk.services.mediapackage

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AuthorizationProperty {

  def apply(
    secretsRoleArn: Option[String] = None,
    cdnIdentifierSecret: Option[String] = None
  ): software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.AuthorizationProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.AuthorizationProperty.Builder)
      .secretsRoleArn(secretsRoleArn.orNull)
      .cdnIdentifierSecret(cdnIdentifierSecret.orNull)
      .build()
}
