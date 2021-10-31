package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AuthorizationConfigProperty {

  def apply(
    iam: Option[String] = None,
    accessPointId: Option[String] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.AuthorizationConfigProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.AuthorizationConfigProperty.Builder)
      .iam(iam.orNull)
      .accessPointId(accessPointId.orNull)
      .build()
}
