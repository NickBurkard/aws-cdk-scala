package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EphemeralStorageProperty {

  def apply(
    sizeInGiB: Option[Number] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.EphemeralStorageProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.EphemeralStorageProperty.Builder)
      .sizeInGiB(sizeInGiB.orNull)
      .build()
}
