package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UlimitProperty {

  def apply(
    hardLimit: Number,
    name: String,
    softLimit: Number
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.UlimitProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.UlimitProperty.Builder)
      .hardLimit(hardLimit)
      .name(name)
      .softLimit(softLimit)
      .build()
}
