package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UlimitProperty {

  def apply(
    hardLimit: Number,
    name: String,
    softLimit: Number
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty.Builder)
      .hardLimit(hardLimit)
      .name(name)
      .softLimit(softLimit)
      .build()
}
