package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UlimitProperty {

  def apply(
    hardLimit: Option[Number] = None,
    name: Option[String] = None,
    softLimit: Option[Number] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty.Builder)
      .hardLimit(hardLimit.orNull)
      .name(name.orNull)
      .softLimit(softLimit.orNull)
      .build()
}
