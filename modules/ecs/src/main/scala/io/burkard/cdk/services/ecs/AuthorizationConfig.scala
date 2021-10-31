package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AuthorizationConfig {

  def apply(
    iam: Option[String] = None,
    accessPointId: Option[String] = None
  ): software.amazon.awscdk.services.ecs.AuthorizationConfig =
    (new software.amazon.awscdk.services.ecs.AuthorizationConfig.Builder)
      .iam(iam.orNull)
      .accessPointId(accessPointId.orNull)
      .build()
}
