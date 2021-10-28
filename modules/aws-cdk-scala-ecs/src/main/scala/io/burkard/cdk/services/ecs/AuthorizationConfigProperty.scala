package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AuthorizationConfigProperty {

  def apply(
    iam: Option[String] = None,
    accessPointId: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.AuthorizationConfigProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.AuthorizationConfigProperty.Builder)
      .iam(iam.orNull)
      .accessPointId(accessPointId.orNull)
      .build()
}
